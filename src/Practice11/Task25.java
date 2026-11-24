package Practice11;
import java.util.ArrayList;
import java.util.List;
public class Task25 {
    public static void demonstrateTypeInference() {

        List<Integer> list1 = new ArrayList<>();

        var list2 = new ArrayList<Integer>();

        var names = new ArrayList<String>(
                List.of("Анна", "Богдан")
        );

        list1.add(10);
        list1.add(20);

        list2.add(30);
        list2.add(40);

        names.add("Олена");

        System.out.println(
                "Список Integer через <>: " + list1
        );

        System.out.println(
                "Список Integer через var: " + list2
        );

        System.out.println(
                "Список String через var: " + names
        );
    }

    public static void main(String[] args) {
        demonstrateTypeInference();
    }
}
