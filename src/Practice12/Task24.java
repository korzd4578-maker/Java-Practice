package Practice12;
import java.util.*;
public class Task24 {
    public static List<Integer> mergeSorted(
            List<Integer> a,
            List<Integer> b) {

        List<Integer> result = new ArrayList<>();

        Iterator<Integer> itA = a.iterator();
        Iterator<Integer> itB = b.iterator();

        Integer currentA = itA.hasNext() ? itA.next() : null;
        Integer currentB = itB.hasNext() ? itB.next() : null;

        while (currentA != null || currentB != null) {

            int value;

            if (currentA == null) {

                value = currentB;
                currentB = itB.hasNext() ? itB.next() : null;

            } else if (currentB == null) {

                value = currentA;
                currentA = itA.hasNext() ? itA.next() : null;

            } else if (currentA <= currentB) {

                value = currentA;
                currentA = itA.hasNext() ? itA.next() : null;

            } else {

                value = currentB;
                currentB = itB.hasNext() ? itB.next() : null;
            }

            if (result.isEmpty()
                    || !result.get(result.size() - 1).equals(value)) {

                result.add(value);
            }
        }

        return result;
    }

    public static void main(String[] args) {

        List<Integer> a = List.of(1, 4, 7, 12, 20);

        List<Integer> b = List.of(2, 4, 9, 12, 15, 25);

        List<Integer> result = mergeSorted(a, b);

        System.out.println("Список A: " + a);
        System.out.println("Список B: " + b);

        System.out.println("Результат: " + result);
    }
}
