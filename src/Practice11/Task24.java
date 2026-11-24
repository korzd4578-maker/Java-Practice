package Practice11;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
public class Task24 {
    public static int replaceAllValues(
            List<String> list,
            String oldValue,
            String newValue) {

        int replacements = 0;

        for (int i = 0; i < list.size(); i++) {

            if (Objects.equals(list.get(i), oldValue)) {

                list.set(i, newValue);

                replacements++;
            }
        }

        return replacements;
    }

    public static void main(String[] args) {

        ArrayList<String> statuses = new ArrayList<>(
                List.of(
                        "Очікує",
                        "Виконується",
                        "Очікує",
                        "Завершено",
                        "Очікує"
                )
        );

        System.out.println("До заміни: " + statuses);

        int count = replaceAllValues(
                statuses,
                "Очікує",
                "У черзі"
        );

        System.out.println("Після заміни: " + statuses);

        System.out.println("Кількість замін: " + count);
    }
}
