package Practice11;
import java.util.ArrayList;
import java.util.List;
public class Task13 {
    public static void main(String[] args) {

        ArrayList<Integer> speeds = new ArrayList<>(
                List.of(60, 85, 110, 95, 130)
        );

        System.out.println(
                "Перший елемент: " + speeds.get(0)
        );

        System.out.println(
                "Центральний елемент: "
                        + speeds.get(speeds.size() / 2)
        );

        System.out.println(
                "Останній елемент: "
                        + speeds.get(speeds.size() - 1)
        );

        for (int i = 0; i < speeds.size(); i++) {

            if (speeds.get(i) > 100) {

                Integer oldValue = speeds.set(i, 100);

                System.out.println(
                        "Перевищення " + oldValue
                                + " км/год обмежено до 100 км/год."
                );
            }
        }

        System.out.println(
                "Список після обмеження швидкості: " + speeds
        );
    }
}
