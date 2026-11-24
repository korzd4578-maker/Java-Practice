package Practice12;
import java.util.*;
public class Task20 {
    public static void main(String[] args) {
        List<String> stations = new ArrayList<>(
                List.of(
                        "Вокзальна",
                        "Університет",
                        "Театральна",
                        "Хрещатик",
                        "Арсенальна"
                )
        );

        ListIterator<String> lit = stations.listIterator();

        System.out.println("Прямое направление:");

        while (lit.hasNext()) {

            int index = lit.nextIndex();
            String station = lit.next();

            System.out.println(index + ". " + station);
        }

        System.out.println("\nОбратное направление:");

        while (lit.hasPrevious()) {

            int index = lit.previousIndex();
            String station = lit.previous();

            System.out.println(index + ". " + station);
        }
    }
}
