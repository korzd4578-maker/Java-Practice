package Practice04;
import java.util.Scanner;
public class Task12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть число N > 1: ");
        int n = scanner.nextInt();

        if (n <= 1) {
            System.out.println("Число має бути більше за 1!");
            scanner.close();
            return;
        }

        int divisor = 2;

        while (n % divisor != 0) {
            divisor++;
        }

        System.out.println("Найменший дільник: " + divisor);

        scanner.close();
    }
}
