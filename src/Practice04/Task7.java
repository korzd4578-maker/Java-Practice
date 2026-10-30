package Practice04;
import java.util.Scanner;
public class Task7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;

        System.out.print("Введіть число (0 - завершити): ");
        int number = scanner.nextInt();

        while (number != 0) {
            sum += number;

            System.out.print("Введіть число (0 - завершити): ");
            number = scanner.nextInt();
        }

        System.out.println("Загальна сума: " + sum);
        scanner.close();
    }
}
