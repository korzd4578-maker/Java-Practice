package Practice11;
import java.util.ArrayList;
import java.util.List;
public class Task23 {
    public static List<String> passedBoth(
            List<String> listA,
            List<String> listB) {

        ArrayList<String> result = new ArrayList<>(listA);

        result.retainAll(listB);

        return result;
    }

    public static List<String> passedOnlyFirst(
            List<String> listA,
            List<String> listB) {

        ArrayList<String> result = new ArrayList<>(listA);

        result.removeAll(listB);

        return result;
    }

    public static void main(String[] args) {

        List<String> javaPassed = List.of(
                "Анна", "Богдан", "Олена", "Дмитро"
        );

        List<String> databasePassed = List.of(
                "Богдан", "Олена", "Ірина", "Максим"
        );

        System.out.println(
                "Склали обидва іспити: "
                        + passedBoth(javaPassed, databasePassed)
        );

        System.out.println(
                "Склали лише Java: "
                        + passedOnlyFirst(javaPassed, databasePassed)
        );
    }
}
