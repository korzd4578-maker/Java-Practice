package Practice11;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class Task06 {
    public static int sumIgnoringNulls(List<Integer> list) {

        int sum = 0;

        for (Integer element : list) {

            if (element != null) {
                sum += element;
            }
        }

        return sum;
    }

    public static void main(String[] args) {

        ArrayList<Integer> temperatures = new ArrayList<>(
                Arrays.asList(18, 22, null, 15, null, 20)
        );

        System.out.println("Температури: " + temperatures);

        try {

            int temperature = temperatures.get(2);

            System.out.println(temperature);

        } catch (NullPointerException e) {

            System.out.println(
                    "Помилка: null неможливо автоматично "
                            + "розпакувати в int."
            );
        }

        System.out.println(
                "Сума без null: "
                        + sumIgnoringNulls(temperatures)
        );
    }
}
