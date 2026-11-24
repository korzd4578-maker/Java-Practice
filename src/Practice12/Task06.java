package Practice12;
import java.util.*;
public class Task06 {
    public static boolean registerPromoCode(
            Set<String> activeCodes, String code) {
        if (code == null || code.trim().isEmpty()) {
            return false;
        }

        String normalized = code.trim().toUpperCase();

        return activeCodes.add(normalized);
    }

    public static void main(String[] args) {

        HashSet<String> hashSet = new HashSet<>();
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();
        TreeSet<String> treeSet = new TreeSet<>();

        hashSet.add(null);
        hashSet.add(null);

        linkedHashSet.add(null);
        linkedHashSet.add(null);

        System.out.println("HashSet: " + hashSet);
        System.out.println("LinkedHashSet: " + linkedHashSet);

        try {
            treeSet.add(null);
        } catch (NullPointerException e) {
            System.out.println("TreeSet не поддерживает null!");
        }

        Set<String> activeCodes = new HashSet<>();

        System.out.println(registerPromoCode(activeCodes, "summer20"));
        System.out.println(registerPromoCode(activeCodes, "summer20"));
        System.out.println(registerPromoCode(activeCodes, ""));
        System.out.println(registerPromoCode(activeCodes, null));

        System.out.println("Промокоды: " + activeCodes);
    }
}
