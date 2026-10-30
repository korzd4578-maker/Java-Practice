package Practice04;
import java.util.Scanner;
public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть текст: ");
        String text = scanner.nextLine();

        System.out.print("Введіть кількість повторень: ");
        int n = scanner.nextInt();

        if (n < 1) {
            System.out.println("Кількість має бути більшою за 0!");
        } else {
            for (int i = 1; i <= n; i++) {
                System.out.println("[" + i + "] " + text);
            }
        }

        scanner.close();
    }
}
