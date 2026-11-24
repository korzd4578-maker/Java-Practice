package Practice11;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class Task20 {
    public static void main(String[] args) {

        ArrayList<String> cities = new ArrayList<>(
                List.of(
                        "Київ", "Львів", "Одеса",
                        "Харків", "Дніпро"
                )
        );

        Object[] objArray = cities.toArray();

        String[] strArray = cities.toArray(new String[0]);

        System.out.println(
                "Масив Object[]: " + Arrays.toString(objArray)
        );

        System.out.println(
                "Типізований масив String[]: "
                        + Arrays.toString(strArray)
        );

        ArrayList<String> restored =
                new ArrayList<>(Arrays.asList(strArray));

        System.out.println(
                "Знову ArrayList: " + restored
        );
    }
}
