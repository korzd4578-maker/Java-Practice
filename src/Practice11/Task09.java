package Practice11;
import java.util.ArrayList;
import java.util.Arrays;
public class Task09 {
    public static void main(String[] args) {

        String[] fixedArray = {
                "Київ", "Львів", "Одеса"
        };

        try {

            fixedArray[3] = "Харків";

        } catch (ArrayIndexOutOfBoundsException e) {

            System.out.println(
                    "Масив має фіксований розмір: "
                            + "додати четверте місто не вдалося."
            );
        }

        System.out.println(
                "Звичайний масив: "
                        + Arrays.toString(fixedArray)
        );

        ArrayList<String> dynamicList = new ArrayList<>();

        dynamicList.add("Київ");
        dynamicList.add("Львів");
        dynamicList.add("Одеса");
        dynamicList.add("Харків");
        dynamicList.add("Дніпро");

        dynamicList.add(1, "Житомир");

        dynamicList.remove(0);

        System.out.println(
                "Динамічний ArrayList: " + dynamicList
        );
    }
}
