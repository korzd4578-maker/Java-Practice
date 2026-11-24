package Practice12;
import java.util.*;
public class Task02 {
    public static void main(String[] args) {
        String[] cities = {
                "Львів", "Київ", "Одеса", "Дніпро",
                "Харків", "Київ", "Львів", "Чернівці"
        };

        HashSet<String> hashSet = new HashSet<>();
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();
        TreeSet<String> treeSet = new TreeSet<>();

        for (String city : cities) {
            hashSet.add(city);
            linkedHashSet.add(city);
            treeSet.add(city);
        }

        System.out.println("HashSet: " + hashSet);
        System.out.println("LinkedHashSet: " + linkedHashSet);
        System.out.println("TreeSet: " + treeSet);
    }
}
