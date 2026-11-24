package Practice11;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
import java.util.Vector;
public class Task28 {
    public static <E> void printElements(Iterable<E> iterable) {

        Iterator<E> it = iterable.iterator();

        while (it.hasNext()) {

            System.out.print(it.next() + " ");
        }

        System.out.println();
    }

    public static <E> void printSummary(Collection<E> collection) {

        System.out.println(
                "Кількість елементів: " + collection.size()
                        + "; список порожній: " + collection.isEmpty()
        );
    }

    public static <E> E getFirstAndLast(List<E> list) {

        if (list.isEmpty()) {

            System.out.println("Список порожній.");

            return null;
        }

        E first = list.get(0);

        E last = list.get(list.size() - 1);

        System.out.println("Перший елемент: " + first);

        System.out.println("Останній елемент: " + last);

        return last;
    }

    public static void main(String[] args) {

        List<List<String>> lists = new ArrayList<>();

        lists.add(
                new ArrayList<>(List.of("Київ", "Львів"))
        );

        lists.add(
                new LinkedList<>(List.of("Одеса", "Харків"))
        );

        lists.add(
                new Vector<>(List.of("Дніпро", "Чернігів"))
        );

        lists.add(new Stack<>());

        ((Stack<String>) lists.get(3)).addAll(
                List.of("Полтава", "Суми")
        );

        for (List<String> list : lists) {

            System.out.println("\nОбхід Iterable:");

            printElements(list);

            printSummary(list);

            getFirstAndLast(list);
        }
    }
}
