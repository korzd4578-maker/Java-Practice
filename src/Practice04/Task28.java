package Practice04;
import java.util.Scanner;
public class Task28 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Перший член прогресії: ");
        int a = scanner.nextInt();

        System.out.print("Різниця прогресії: ");
        int d = scanner.nextInt();

        System.out.print("Кількість членів: ");
        int n = scanner.nextInt();

        long sum = 0;

        for (int i = 0; i < n; i++) {
            long number = (long) a + (long) i * d;

            System.out.print(number + " ");
            sum += number;
        }

        System.out.println();
        System.out.println("Сума прогресії: " + sum);

        scanner.close();
    }
}
