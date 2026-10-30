package Practice04;
import java.util.Scanner;
public class Task30 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Кількість чисел: ");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("Кількість має бути додатною!");
            scanner.close();
            return;
        }

        int sum = 0;

        for (int i = 1; i <= n; i++) {
            System.out.print("Число " + i + ": ");
            int number = scanner.nextInt();
            sum += number;
        }

        double wrongAverage = sum / n;
        double correctAverage = (double) sum / n;

        System.out.println("Сума: " + sum);
        System.out.println("Без приведення: " + wrongAverage);
        System.out.println("З приведенням: " + correctAverage);

        scanner.close();
    }
}
