package Practice04;
import java.util.Scanner;
public class Task19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть чисельник: ");
        double numerator = scanner.nextDouble();

        double denominator;

        do {
            System.out.print("Введіть знаменник: ");
            denominator = scanner.nextDouble();

            if (denominator == 0) {
                System.out.println("На нуль ділити не можна!");
            }

        } while (denominator == 0);

        double result = numerator / denominator;

        System.out.println("Результат ділення: " + result);

        scanner.close();
    }
}
