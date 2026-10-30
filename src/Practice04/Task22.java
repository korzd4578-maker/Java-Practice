package Practice04;
import java.util.Scanner;
public class Task22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть N (0-20): ");
        int n = scanner.nextInt();

        if (n < 0 || n > 20) {
            System.out.println("Число має бути від 0 до 20!");
            scanner.close();
            return;
        }

        long factorial = 1;

        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }

        System.out.println(n + "! = " + factorial);

        scanner.close();
    }
}
