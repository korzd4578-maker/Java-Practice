package Practice12;
import java.util.*;
public class Task22 {
    public static int cleanWithIterator(List<Double> data) {

        Iterator<Double> it = data.iterator();

        int removed = 0;

        while (it.hasNext()) {

            Double value = it.next();

            if (value == null
                    || Double.isNaN(value)
                    || value < 0
                    || value > 100.0) {

                it.remove();
                removed++;
            }
        }

        return removed;
    }

    public static int cleanWithRemoveIf(List<Double> data) {

        int before = data.size();

        data.removeIf(v ->
                v == null
                        || Double.isNaN(v)
                        || v < 0
                        || v > 100.0
        );

        return before - data.size();
    }

    public static double average(List<Double> data) {

        if (data.isEmpty()) {
            return 0;
        }

        double sum = 0;

        for (double value : data) {
            sum += value;
        }

        return sum / data.size();
    }

    public static void main(String[] args) {

        List<Double> readings1 = new ArrayList<>(
                Arrays.asList(
                        20.5, 25.0, -5.0, 30.2,
                        Double.NaN, 45.0, 105.0,
                        50.0, 60.0, 70.0, null, 80.0
                )
        );

        List<Double> readings2 = new ArrayList<>(readings1);

        int removed1 = cleanWithIterator(readings1);
        int removed2 = cleanWithRemoveIf(readings2);

        System.out.println("Iterator: " + readings1);
        System.out.println("RemoveIf: " + readings2);

        System.out.println("Удалено Iterator: " + removed1);
        System.out.println("Удалено removeIf: " + removed2);

        System.out.println("Результаты одинаковы: "
                + readings1.equals(readings2));

        System.out.printf("Среднее значение: %.2f\n",
                average(readings1));
    }
}
