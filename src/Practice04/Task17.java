package Practice04;
import java.util.Scanner;
public class Task17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String answer;

        do {
            System.out.print("Введіть перше число: ");
            double a = scanner.nextDouble();

            System.out.print("Введіть друге число: ");
            double b = scanner.nextDouble();

            System.out.println("Сума чисел: " + (a + b));

            System.out.print("Бажаєте продовжити? (y/n): ");
            answer = scanner.next();

        } while (answer.equalsIgnoreCase("y"));

        System.out.println("Роботу завершено.");

        scanner.close();
    }
}
