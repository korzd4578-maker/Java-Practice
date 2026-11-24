package Practice11;
import java.util.ArrayList;
import java.util.List;
public class Task18 {
    public static int countOccurrences(
            List<String> list,
            String target) {

        int count = 0;

        for (String value : list) {

            if (target.equals(value)) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {

        ArrayList<String> langs = new ArrayList<>(
                List.of(
                        "Java", "Python", "C++",
                        "Java", "Kotlin", "Java"
                )
        );

        System.out.println("Список мов: " + langs);

        System.out.println(
                "Містить Kotlin: " + langs.contains("Kotlin")
        );

        System.out.println(
                "Містить Rust: " + langs.contains("Rust")
        );

        System.out.println(
                "Індекс першого Java: " + langs.indexOf("Java")
        );

        System.out.println(
                "Індекс останнього Java: " + langs.lastIndexOf("Java")
        );

        System.out.println(
                "Кількість входжень Java: "
                        + countOccurrences(langs, "Java")
        );
    }
}
