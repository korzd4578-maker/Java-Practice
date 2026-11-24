package Practice11;
import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
public class Task31 {
    public static void removeNegativesWithIterator(
            List<Integer> list) {

        Iterator<Integer> it = list.iterator();

        while (it.hasNext()) {

            if (it.next() < 0) {

                it.remove();
            }
        }
    }

    public static void main(String[] args) {

        ArrayList<Integer> data = new ArrayList<>(
                List.of(15, -3, 42, -10, 8, -1, 25)
        );

        System.out.println(
                "Початкові дані: " + data
        );

        try {

            for (Integer x : data) {

                if (x < 0) {
                    data.remove(x);
                }
            }

        } catch (ConcurrentModificationException e) {

            System.out.println(
                    "Виникла ConcurrentModificationException: "
                            + "список змінено напряму під час for-each."
            );
        }

        ArrayList<Integer> safeData = new ArrayList<>(
                List.of(15, -3, 42, -10, 8, -1, 25)
        );

        removeNegativesWithIterator(safeData);

        System.out.println(
                "Після безпечного видалення через Iterator.remove(): "
                        + safeData
        );
    }
}
