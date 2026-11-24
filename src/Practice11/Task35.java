package Practice11;
import java.util.ArrayList;
import java.util.List;
public class Task35 {
    public static <T> void reverseInPlace(List<T> list) {

        for (int i = 0; i < list.size() / 2; i++) {

            int oppositeIndex = list.size() - 1 - i;

            T left = list.get(i);

            T right = list.get(oppositeIndex);

            list.set(i, right);

            list.set(oppositeIndex, left);
        }
    }

    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>(
                List.of(
                        "Анна",
                        "Богдан",
                        "Віктор",
                        "Олена",
                        "Марія"
                )
        );

        System.out.println(
                "До розвороту: " + names
        );

        reverseInPlace(names);

        System.out.println(
                "Після розвороту: " + names
        );
    }
}
