package Practice11;
import java.util.Arrays;
import java.util.List;
public class Task04 {
    public static void findMinAndMax(List<Integer> numbers) {

        if (numbers.isEmpty()) {

            System.out.println(
                    "Список порожній — неможливо знайти мінімум і максимум."
            );

            return;
        }

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int number : numbers) {

            if (number < min) {
                min = number;
            }

            if (number > max) {
                max = number;
            }
        }

        System.out.println("Мінімальне число: " + min);
        System.out.println("Максимальне число: " + max);
    }

    public static void main(String[] args) {

        System.out.println(
                "Integer: від " + Integer.MIN_VALUE
                        + " до " + Integer.MAX_VALUE
        );

        System.out.println(
                "Byte: від " + Byte.MIN_VALUE
                        + " до " + Byte.MAX_VALUE
        );

        System.out.println(
                "Short: від " + Short.MIN_VALUE
                        + " до " + Short.MAX_VALUE
        );

        System.out.println(
                "Long: від " + Long.MIN_VALUE
                        + " до " + Long.MAX_VALUE
        );

        findMinAndMax(
                Arrays.asList(15, -40, 220, 0, 87, -5)
        );

        int overflow = Integer.MAX_VALUE + 1;

        System.out.println(
                "Переповнення MAX_VALUE + 1: " + overflow
        );

        int value = Integer.MAX_VALUE;

        if (value < Integer.MAX_VALUE) {

            value++;

        } else {

            System.out.println(
                    "Додавання неможливе без переповнення."
            );
        }
    }
}
