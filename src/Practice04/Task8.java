package Practice04;
import java.util.Scanner;
public class Task8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть M: ");
        long m = scanner.nextLong();

        long number = 1;

        while (number <= m) {
            System.out.print(number + " ");

            if (number > m / 2) {
                break;
            }

            number *= 2;
        }

        scanner.close();
    }
}
