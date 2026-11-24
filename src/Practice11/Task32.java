package Practice11;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
public class Task32 {
    public static void main(String[] args) {

        ArrayList<String> logs = new ArrayList<>(
                List.of(
                        "INFO: Start",
                        "DEBUG: Init",
                        "ERROR: Timeout",
                        "DEBUG: Retry",
                        "INFO: Done"
                )
        );

        Iterator<String> it = logs.iterator();

        while (it.hasNext()) {

            if (it.next().startsWith("DEBUG:")) {

                it.remove();
            }
        }

        System.out.println(
                "Після видалення DEBUG: " + logs
        );

        ListIterator<String> listIt = logs.listIterator();

        while (listIt.hasNext()) {

            String value = listIt.next();

            if (value.startsWith("ERROR:")) {

                listIt.set("CRITICAL ERROR: Timeout");
            }
        }

        System.out.println(
                "Прямий обхід та заміна: " + logs
        );

        System.out.println("Зворотний обхід:");

        while (listIt.hasPrevious()) {

            System.out.println(listIt.previous());
        }
    }
}
