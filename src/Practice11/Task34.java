package Practice11;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
public class Task34 {
    public static int removeInRange(
            List<Integer> list,
            int min,
            int max) {

        Iterator<Integer> it = list.iterator();

        int removed = 0;

        while (it.hasNext()) {

            int value = it.next();

            if (value >= min && value <= max) {

                it.remove();

                removed++;
            }
        }

        return removed;
    }

    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>(
                List.of(
                        3, 12, 18, 25, 31,
                        44, 50, 57, 63, 72
                )
        );

        System.out.println(
                "До фільтрації: " + numbers
        );

        int removed = removeInRange(numbers, 20, 50);

        System.out.println(
                "Видалено чисел у діапазоні [20; 50]: "
                        + removed
        );

        System.out.println(
                "Після фільтрації: " + numbers
        );
    }
}
