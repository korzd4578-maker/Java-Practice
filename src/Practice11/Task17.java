package Practice11;
import java.util.ArrayList;
import java.util.List;
public class Task17 {
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>(
                List.of(10, 20, 30, 1, 40, 2)
        );

        System.out.println("Початковий список: " + numbers);

        numbers.remove(1);

        System.out.println(
                "Після remove(1) видалено елемент з індексом 1 "
                        + "(число 20): " + numbers
        );

        numbers.remove(Integer.valueOf(1));

        numbers.remove(Integer.valueOf(2));

        System.out.println(
                "Після видалення значень 1 і 2: " + numbers
        );
    }
}
