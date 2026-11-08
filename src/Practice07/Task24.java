package Practice07;
import java.util.Arrays;
public class Task24 {
    public static void main(String[] args) {
        ArrayFilter filter = new ArrayFilter();

        int[] numbers = {12, 5, 8, 19, 24, 3, 16};

        System.out.println("Числа більші за 10:");
        System.out.println(Arrays.toString(filter.filter(numbers, 10)));

        System.out.println("-------------------");

        System.out.println("Числа від 8 до 19:");
        System.out.println(Arrays.toString(filter.filter(numbers, 8, 19)));

        System.out.println("-------------------");

        System.out.println("Парні числа:");
        System.out.println(Arrays.toString(filter.filter(numbers, true)));

        System.out.println("-------------------");

        System.out.println("Непарні числа:");
        System.out.println(Arrays.toString(filter.filter(numbers, false)));
    }
}
