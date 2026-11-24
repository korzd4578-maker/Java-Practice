package Practice11;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
public class Task30 {
    public static void main(String[] args) {

        ArrayList<String> modules = new ArrayList<>(
                List.of(
                        "Core Java",
                        "OOP",
                        "Collections",
                        "Streams",
                        "Multithreading"
                )
        );

        Iterator<String> it = modules.iterator();

        int totalCharacters = 0;

        System.out.println("Навчальні модулі:");

        while (it.hasNext()) {

            String module = it.next();

            System.out.println("- " + module);

            totalCharacters += module.length();
        }

        System.out.println(
                "Загальна кількість символів у назвах модулів: "
                        + totalCharacters
        );
    }
}
