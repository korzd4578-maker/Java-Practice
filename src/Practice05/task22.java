package Practice05;
import java.util.Arrays;
public class task22 {
    public static void main(String[] args) {
        int[] test = {45, 12, 89, 3, 27};
        System.out.println("1. Початковий стан: " + Arrays.toString(test));

        Arrays.sort(test);
        System.out.println("2. Відсортований: " + Arrays.toString(test));

        Arrays.fill(test, -1);
        System.out.println("3. Заповнений числом -1: " + Arrays.toString(test));
    }
}
