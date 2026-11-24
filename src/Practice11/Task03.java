package Practice11;
import java.util.*;
import java.util.List;
public class Task03 {
    public static List<Integer> parseNumbersFromStrings(
            String[] inputs) {

        ArrayList<Integer> result = new ArrayList<>();

        int sum = 0;

        for (String input : inputs) {

            try {

                int primitive = Integer.parseInt(input);

                Integer object = Integer.valueOf(input);

                sum += primitive;

                result.add(object);

                System.out.println(
                        "Оброблено значення: " + input
                );

            } catch (NumberFormatException e) {

                System.out.println(
                        "Попередження: рядок '" + input
                                + "' не є цілим числом."
                );
            }
        }

        System.out.println("Сума чисел: " + sum);

        return result;
    }

    public static void main(String[] args) {

        String[] inputs = {
                "120", "-45", "300", "abc", "1024", ""
        };

        System.out.println(
                "Коректні числа: "
                        + parseNumbersFromStrings(inputs)
        );
    }
}
