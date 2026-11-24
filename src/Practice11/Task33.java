package Practice11;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
public class Task33 {
    public static void splitEvenAndOdd(
            List<Integer> source,
            List<Integer> evens,
            List<Integer> odds) {

        Iterator<Integer> it = source.iterator();

        while (it.hasNext()) {

            int number = it.next();

            if (number % 2 == 0) {

                evens.add(number);

            } else {

                odds.add(number);
            }
        }
    }

    private static int maxOrMinValue(List<Integer> values) {

        int max = Integer.MIN_VALUE;

        for (Integer value : values) {

            if (value > max) {
                max = value;
            }
        }

        return max;
    }

    public static void main(String[] args) {

        List<Integer> source = Arrays.asList(
                12, 7, 4, 19, 22, 31, 8, 5, 14, 3
        );

        ArrayList<Integer> evens = new ArrayList<>();

        ArrayList<Integer> odds = new ArrayList<>();

        splitEvenAndOdd(source, evens, odds);

        System.out.println(
                "Парні числа: " + evens
                        + "; кількість: " + evens.size()
                        + "; найбільше: " + maxOrMinValue(evens)
        );

        System.out.println(
                "Непарні числа: " + odds
                        + "; кількість: " + odds.size()
                        + "; найбільше: " + maxOrMinValue(odds)
        );
    }
}
