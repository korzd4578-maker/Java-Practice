package Practice12;
import java.util.*;
public class Task21 {
    public static void main(String[] args) {
        List<String> commands = new ArrayList<>(
                List.of(
                        "START",
                        "LOAD",
                        "ERROR_TEMP",
                        "PROCESS",
                        "STOP"
                )
        );

        ListIterator<String> lit = commands.listIterator();

        while (lit.hasNext()) {

            String command = lit.next();

            if (command.equals("ERROR_TEMP")) {
                lit.set("RETRY");
            }

            if (command.equals("LOAD")) {
                lit.add("VALIDATE");
            }
        }

        System.out.println("Обновленные команды:");

        System.out.println(commands);
    }
}
