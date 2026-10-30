package Practice04;
import java.util.Scanner;
public class Task9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть додатне число: ");
        int number = scanner.nextInt();

        if (number <= 0) {
            System.out.println("Число має бути додатним!");
            scanner.close();
            return;
        }

        int count = 0;
        int sum = 0;

        while (number > 0) {
            int digit = number % 10;
            sum += digit;
            count++;
            number /= 10;
        }

        System.out.println("Кількість цифр: " + count);
        System.out.println("Сума цифр: " + sum);

        scanner.close();
    }
}
