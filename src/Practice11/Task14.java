package Practice11;
import java.util.Arrays;
public class Task14 {
    static class SimpleArrayList {

        private Object[] data = new Object[10];

        private int size = 0;

        public void add(Object element) {

            if (size == data.length) {

                int newCapacity =
                        data.length + (data.length >> 1);

                Object[] newData = new Object[newCapacity];

                System.arraycopy(
                        data, 0,
                        newData, 0,
                        size
                );

                data = newData;
            }

            data[size++] = element;
        }

        public Object get(int index) {

            if (index < 0 || index >= size) {

                throw new IndexOutOfBoundsException(
                        "Неправильний індекс: " + index
                );
            }

            return data[index];
        }

        public int size() {
            return size;
        }

        public int getCapacity() {
            return data.length;
        }

        @Override
        public String toString() {

            return Arrays.toString(
                    Arrays.copyOf(data, size)
            );
        }
    }

    public static void main(String[] args) {

        SimpleArrayList list = new SimpleArrayList();

        for (int i = 1; i <= 12; i++) {

            list.add("Елемент " + i);

            System.out.println(
                    "Додано елемент " + i
                            + "; size = " + list.size()
                            + "; capacity = " + list.getCapacity()
            );
        }

        System.out.println(
                "Перший елемент: " + list.get(0)
        );

        System.out.println(
                "Підсумковий список: " + list
        );
    }
}
