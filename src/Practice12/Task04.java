package Practice12;
import java.util.*;
public class Task04 {
    public static String findFirstDuplicate(List<String> ids) {
        Set<String> seen = new HashSet<>();

        for (String id : ids) {

            if (!seen.add(id)) {
                return id;
            }
        }

        return null;
    }

    public static void main(String[] args) {

        List<String> receiptIds = Arrays.asList(
                "TR-101", "TR-102", "TR-103",
                "TR-104", "TR-102", "TR-105"
        );

        List<String> uniqueIds = Arrays.asList(
                "TR-201", "TR-202", "TR-203"
        );

        System.out.println("Первый дубликат: "
                + findFirstDuplicate(receiptIds));

        System.out.println("Уникальный список: "
                + findFirstDuplicate(uniqueIds));
    }
}
