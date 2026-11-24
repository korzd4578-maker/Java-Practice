package Practice12;
import java.util.*;
public class Task03 {
    public static List<String> deduplicatePreserveOrder(List<String> input){
        LinkedHashSet<String> unique = new LinkedHashSet<>(input);

        return new ArrayList<>(unique);
    }

    public static void main(String[] args) {

        List<String> rawLogs = new ArrayList<>(Arrays.asList(
                "192.168.1.10",
                "192.168.1.20",
                "192.168.1.30",
                "192.168.1.10",
                "192.168.1.40",
                "192.168.1.20",
                "192.168.1.50",
                "192.168.1.60",
                "192.168.1.30",
                "192.168.1.70",
                "192.168.1.80",
                "192.168.1.10"
        ));

        List<String> uniqueLogs = deduplicatePreserveOrder(rawLogs);

        System.out.println("До: " + rawLogs.size());
        System.out.println("После: " + uniqueLogs.size());

        System.out.println("Удалено дубликатов: "
                + (rawLogs.size() - uniqueLogs.size()));

        System.out.println("Уникальные IP: " + uniqueLogs);
    }
}
