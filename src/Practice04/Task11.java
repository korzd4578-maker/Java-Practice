package Practice04;
import java.util.Scanner;
public class Task11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Початковий внесок: ");
        double sum = scanner.nextDouble();

        System.out.print("Річна ставка (%): ");
        double percent = scanner.nextDouble();

        if (sum <= 0 || percent <= 0) {
            System.out.println("Внесок і ставка мають бути додатними!");
            scanner.close();
            return;
        }

        double target = sum * 2;
        int years = 0;

        while (sum < target) {
            sum += sum * percent / 100;
            years++;

            System.out.printf("Рік %d: %.2f грн%n", years, sum);
        }

        System.out.println("Капітал подвоїться через " + years + " років.");

        scanner.close();
    }
}
