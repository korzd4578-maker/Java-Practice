package Practice12;
import java.util.*;
public class Task17 {
    public static <T> void printViaIterator(
            Iterable<T> collection, String title) {

        System.out.println("\n" + title);

        Iterator<T> it = collection.iterator();

        int number = 1;

        while (it.hasNext()) {
            System.out.println(number + ". " + it.next());
            number++;
        }
    }

    public static void main(String[] args) {

        List<String> planetsList = Arrays.asList(
                "Mercury", "Venus", "Earth", "Mars",
                "Jupiter", "Saturn", "Uranus", "Neptune"
        );

        Set<String> planetsSet = new HashSet<>(planetsList);

        ArrayList<String> arrayList = new ArrayList<>(planetsList);
        HashSet<String> hashSet = new HashSet<>(planetsList);
        LinkedHashSet<String> linkedHashSet =
                new LinkedHashSet<>(planetsList);
        TreeSet<String> treeSet = new TreeSet<>(planetsList);

        printViaIterator(arrayList, "ArrayList");
        printViaIterator(hashSet, "HashSet");
        printViaIterator(linkedHashSet, "LinkedHashSet");
        printViaIterator(treeSet, "TreeSet");
        printViaIterator(planetsSet, "Planets Set");
    }
}
