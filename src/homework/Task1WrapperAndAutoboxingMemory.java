package Homework;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class Task1WrapperAndAutoboxingMemory {
    public static void inspectIntegerCache(int[] testValues) {
        System.out.println("[1. ЕКСПЕРИМЕНТ: INTEGER CACHE [-128..127] (== проти .equals())]:");
        for (int val : testValues) {
            Integer first = Integer.valueOf(val);
            Integer second = Integer.valueOf(val);
            boolean sameRef = (first == second);
            String source = sameRef ? "IntegerCache" : "Новий об'єкт у Heap!";
            System.out.printf("  Значення: %5d | (a == b): %-5b | a.equals(b): %-5b | Джерело: %s\n",
                    val, sameRef, first.equals(second), source);
        }
    }

    public static void demonstrateAutoboxingUnderTheHood() {
        System.out.println("\n[2. AUTOBOXING / UNBOXING ПІД КАПОТОМ ТА ЗАХИСТ ВІД NULL]:");
        Integer boxedInt = Integer.valueOf(42);
        int unboxedInt = boxedInt.intValue();
        System.out.println("  Явне пакування: Integer.valueOf(42) -> " + boxedInt + " | Розпакування: .intValue() -> " + unboxedInt);

        List<Integer> sensorData = Arrays.asList(45, null, -12, 88, null, 102);
        System.out.println("  Вхідний список із датчиків (з null): " + sensorData);

        int sum = 0;
        for (int i = 0; i < sensorData.size(); i++) {
            Integer val = sensorData.get(i);
            if (val == null) {
                System.out.println("  ⚠️ Пропущено null-елемент на індексі " + i);
            } else {
                sum += val.intValue();
            }
        }
        System.out.println("  Сума валідних розпакованих елементів: " + sum);
    }

    public static List<Integer> parseTelemetryStream(String[] rawPackets) {
        List<Integer> valid = new ArrayList<>();
        for (String packet : rawPackets) {
            if (packet == null || packet.trim().isEmpty()) {
                System.out.println("  ❌ Порожній або null-пакет відхилено");
                continue;
            }
            try {
                int parsed = Integer.parseInt(packet.trim());
                valid.add(parsed);
            } catch (NumberFormatException e) {
                System.out.println("  ❌ Пакет '" + packet + "' відхилено (NumberFormatException)");
            }
        }
        return valid;
    }

    public static void printExtremesAndStats(List<Integer> validData) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        System.out.println("  Початкові межі пошуку: min = " + min + " (MAX_VALUE), max = " + max + " (MIN_VALUE)");

        for (Integer num : validData) {
            if (num < min) min = num;
            if (num > max) max = num;
        }
        System.out.println("  Успішно розпізнаний список Integer: " + validData);
        System.out.println("  Знайдений мінімум: " + min + " | Знайдений максимум: " + max);

        validData.remove(Integer.valueOf(-30));
        System.out.println("  Після remove(Integer.valueOf(-30)) (за значенням): " + validData);
    }

    public static void main(String[] args) {
        System.out.println("================ ДОСЛІДЖЕННЯ WRAPPER CLASSES ТА INTEGER CACHE ================");
        inspectIntegerCache(new int[]{-128, 127, 128, 500});
        demonstrateAutoboxingUnderTheHood();

        System.out.println("\n[3. ПАРСИНГ РЯДКІВ (Integer.parseInt) ТА ЕКСТРЕМУМИ (MAX_VALUE / MIN_VALUE)]:");
        String[] packets = {"  145 ", "-30", "ERR_404", "980", "", null, "2147483647", "-85"};
        List<Integer> cleanList = parseTelemetryStream(packets);
        printExtremesAndStats(cleanList);
        System.out.println("==============================================================================");
    }
}
