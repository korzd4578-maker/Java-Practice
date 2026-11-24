package Practice11;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;
import java.util.Vector;
public class Task27 {
    public static void exploreCollectionHierarchy() {

        ArrayList<String> arrayList = new ArrayList<>();

        LinkedList<String> linkedList = new LinkedList<>();

        Vector<String> vector = new Vector<>();

        Stack<String> stack = new Stack<>();

        HashSet<String> hashSet = new HashSet<>();

        ArrayDeque<String> queue = new ArrayDeque<>();

        Object[] collections = {
                arrayList,
                linkedList,
                vector,
                stack,
                hashSet,
                queue
        };

        String[] names = {
                "ArrayList",
                "LinkedList",
                "Vector",
                "Stack",
                "HashSet",
                "ArrayDeque"
        };

        for (int i = 0; i < collections.length; i++) {

            Object item = collections[i];

            System.out.println("\n" + names[i] + ":");

            System.out.println(
                    "  Collection: "
                            + (item instanceof Collection<?>)
            );

            System.out.println(
                    "  Iterable: "
                            + (item instanceof Iterable<?>)
            );

            System.out.println(
                    "  List: "
                            + (item instanceof List<?>)
            );

            System.out.println(
                    "  Set: "
                            + (item instanceof Set<?>)
            );

            System.out.println(
                    "  Queue: "
                            + (item instanceof Queue<?>)
            );
        }
    }

    public static void main(String[] args) {
        exploreCollectionHierarchy();
    }
}
