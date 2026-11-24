package Homework;

class CustomArrayCapacityEmulator<E> {
    private static final int DEFAULT_CAPACITY = 10;
    private Object[] elementData;
    private int size = 0;
    private int resizeCount = 0;
    private int totalElementsCopied = 0;

    public CustomArrayCapacityEmulator() {
        this.elementData = new Object[DEFAULT_CAPACITY];
    }

    private void ensureCapacityInternal() {
        if (size == elementData.length) {
            int oldCapacity = elementData.length;
            int newCapacity = oldCapacity + (oldCapacity >> 1);
            Object[] newBuffer = new Object[newCapacity];
            System.arraycopy(elementData, 0, newBuffer, 0, size);
            elementData = newBuffer;
            resizeCount++;
            totalElementsCopied += size;
            System.out.printf("  ⚡ [GROW #%d] Переповнення! Ємність: %d -> %d (System.arraycopy скопіював %d ел.)\n",
                    resizeCount, oldCapacity, newCapacity, size);
        }
    }

    public void add(E element) {
        ensureCapacityInternal();
        elementData[size++] = element;
    }

    public void add(int index, E element) {
        if (index < 0 || index > size) throw new IndexOutOfBoundsException();
        ensureCapacityInternal();
        int moved = size - index;
        if (moved > 0) {
            System.arraycopy(elementData, index, elementData, index + 1, moved);
        }
        elementData[index] = element;
        size++;
    }

    @SuppressWarnings("unchecked")
    public E remove(int index) {
        if (index < 0 || index >= size) throw new IndexOutOfBoundsException();
        E oldValue = (E) elementData[index];
        int numMoved = size - index - 1;
        if (numMoved > 0) {
            System.arraycopy(elementData, index + 1, elementData, index, numMoved);
        }
        elementData[--size] = null;
        return oldValue;
    }

    @SuppressWarnings("unchecked")
    public E get(int index) {
        if (index < 0 || index >= size) throw new IndexOutOfBoundsException();
        return (E) elementData[index];
    }

    public int size() { return size; }
    public int getCapacity() { return elementData.length; }
    public int getResizeCount() { return resizeCount; }

    public void trimToSize() {
        if (size < elementData.length) {
            Object[] trimmed = new Object[size];
            System.arraycopy(elementData, 0, trimmed, 0, size);
            elementData = trimmed;
        }
    }
}

public class Task2ArrayListCapacityAndDynamicGrowth {
    public static void main(String[] args) {
        System.out.println("================ ЕМУЛЯТОР ВНУТРІШНЬОЇ БУДОВИ ARRAYLIST (ПІД КАПОТОМ) ================");
        var emulator = new CustomArrayCapacityEmulator<String>();
        System.out.println("[ІНІЦІАЛІЗАЦІЯ]: Створено CustomArrayCapacityEmulator<String> | size = " + emulator.size() + " | capacity = " + emulator.getCapacity());

        System.out.println("\n--- Додавання 35 елементів у список ---");
        for (int i = 1; i <= 35; i++) {
            emulator.add("Block-" + i);
        }
        System.out.printf("Стан після додавання 35 елементів: size = %d | capacity = %d (Вільний резерв: %d комірок null)\n",
                emulator.size(), emulator.getCapacity(), (emulator.getCapacity() - emulator.size()));

        System.out.println("\n--- Тестування вставки add(0, 'HEADER') та видалення remove(5) ---");
        emulator.add(0, "HEADER");
        System.out.println("  -> Вставлено 'HEADER' на індекс 0");
        String removed = emulator.remove(5);
        System.out.println("  -> Видалено елемент '" + removed + "' з індексу 5");
        System.out.printf("  Поточний стан: size = %d | capacity = %d | Перший: '%s' | Останній: '%s'\n",
                emulator.size(), emulator.getCapacity(), emulator.get(0), emulator.get(emulator.size() - 1));

        System.out.println("\n--- Оптимізація пам'яті trimToSize() ---");
        emulator.trimToSize();
        System.out.printf("  Фінальна телеметрія: size = %d | capacity = %d | Кількість розширень: %d\n",
                emulator.size(), emulator.getCapacity(), emulator.getResizeCount());
        System.out.println("=====================================================================================");
    }
}