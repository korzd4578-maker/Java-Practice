package Practice11;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class Task36 {
    public static String[] mergeUniqueToArray(
            List<String> first,
            List<String> second) {

        var merged = new ArrayList<String>();

        for (String value : first) {

            if (!merged.contains(value)) {

                merged.add(value);
            }
        }

        for (String value : second) {

            if (!merged.contains(value)) {

                merged.add(value);
            }
        }

        return merged.toArray(new String[0]);
    }

    public static void main(String[] args) {

        List<String> first = List.of(
                "Java", "Python", "C++", "Kotlin"
        );

        List<String> second = List.of(
                "Python", "JavaScript", "Kotlin", "Go"
        );

        String[] result = mergeUniqueToArray(first, second);

        System.out.println(
                "Перший список: " + first
        );

        System.out.println(
                "Другий список: " + second
        );

        System.out.println(
                "Об'єднаний масив без дублікатів: "
                        + Arrays.toString(result)
        );
    }
}
