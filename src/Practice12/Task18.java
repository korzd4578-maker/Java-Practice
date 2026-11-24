package Practice12;
import java.util.*;
public class Task18 {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(
                List.of(10, 15, 22, 33, 40, 55, 60)
        );

        System.out.println("Исходный список: " + numbers);

        try {

            for (Integer n : numbers) {

                if (n % 2 != 0) {
                    numbers.remove(n);
                }
            }

        } catch (ConcurrentModificationException e) {

            System.out.println(
                    "Поймано ConcurrentModificationException!"
            );
        }

        List<Integer> safeNumbers = new ArrayList<>(
                List.of(10, 15, 22, 33, 40, 55, 60)
        );

        Iterator<Integer> it = safeNumbers.iterator();

        while (it.hasNext()) {

            Integer n = it.next();

            if (n % 2 != 0) {
                it.remove();
            }
        }

        System.out.println("Безопасное удаление: " + safeNumbers);
    }
}
