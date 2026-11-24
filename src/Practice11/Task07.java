package Practice11;
import java.util.ArrayList;
import java.util.List;
public class Task07 {
    public static List<Integer> extractDigitsFromText(String text) {

        ArrayList<Integer> digits = new ArrayList<>();

        for (char ch : text.toCharArray()) {

            if (Character.isDigit(ch)) {

                digits.add(Character.getNumericValue(ch));
            }
        }

        return digits;
    }

    public static void main(String[] args) {

        String text = "Server-04: CPU 85%, RAM 16GB";

        System.out.println("Текст: " + text);

        System.out.println(
                "Знайдені цифри: " + extractDigitsFromText(text)
        );

        double parsed = Double.parseDouble("36.6");

        Double boxed = Double.valueOf("99.95");

        double notANumber = Double.NaN;

        double infinity = Double.POSITIVE_INFINITY;

        System.out.println(
                "Double.parseDouble: " + parsed
        );

        System.out.println(
                "Double.valueOf: " + boxed
        );

        System.out.println(
                "Чи є NaN: " + Double.isNaN(notANumber)
        );

        System.out.println(
                "Чи є нескінченність: "
                        + Double.isInfinite(infinity)
        );
    }
}
