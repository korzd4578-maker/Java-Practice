package Practice11;
import java.util.ArrayList;
import java.util.List;
public class Task22 {
    public static <T> ArrayList<T> deduplicate(List<T> source) {

        ArrayList<T> unique = new ArrayList<>();

        for (T item : source) {

            if (!unique.contains(item)) {
                unique.add(item);
            }
        }

        return unique;
    }

    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>(
                List.of(5, 12, 5, 8, 12, 20, 5)
        );

        ArrayList<String> names = new ArrayList<>(
                List.of(
                        "Анна", "Богдан", "Анна",
                        "Олена", "Богдан"
                )
        );

        System.out.println(
                "Числа без дублікатів: " + deduplicate(numbers)
        );

        System.out.println(
                "Імена без дублікатів: " + deduplicate(names)
        );
    }
}
