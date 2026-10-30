package Practice04;
import java.util.Scanner;
public class Task13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int secret = (int) (Math.random() * 100) + 1;
        int guess = 0;
        int attempts = 0;

        System.out.println("Вгадайте число від 1 до 100!");

        while (guess != secret) {
            System.out.print("Ваше число: ");
            guess = scanner.nextInt();
            attempts++;

            if (guess < secret) {
                System.out.println("Більше!");
            } else if (guess > secret) {
                System.out.println("Менше!");
            } else {
                System.out.println("Вітаємо! Ви вгадали!");
            }
        }

        System.out.println("Кількість спроб: " + attempts);

        scanner.close();
    }
}
