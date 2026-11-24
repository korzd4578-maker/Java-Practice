package Practice12;
import java.util.*;
public class Task23 {
    public static int removeDuplicatesInPlace(List<String> list) {

        Set<String> seen = new HashSet<>();

        Iterator<String> it = list.iterator();

        int removed = 0;

        while (it.hasNext()) {

            String value = it.next();

            if (!seen.add(value)) {
                it.remove();
                removed++;
            }
        }

        return removed;
    }

    public static void main(String[] args) {

        List<String> tags = new ArrayList<>(
                List.of(
                        "oop",
                        "java",
                        "set",
                        "java",
                        "iterator",
                        "oop",
                        "list",
                        "set"
                )
        );

        System.out.println("До: " + tags);

        int removed = removeDuplicatesInPlace(tags);

        System.out.println("Удалено дубликатов: " + removed);

        System.out.println("После: " + tags);
    }
}
