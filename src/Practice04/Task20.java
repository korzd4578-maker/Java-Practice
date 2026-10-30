package Practice04;
import java.util.Scanner;
public class Task20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int grade;
        int sum = 0;
        int count = 0;

        do {
            System.out.print("Введіть оцінку (від'ємне число - завершити): ");
            grade = scanner.nextInt();

            if (grade < 0) {
                break;
            }

            if (grade > 100) {
                System.out.println("Некоректна оцінка!");
                continue;
            }

            sum += grade;
            count++;

        } while (true);

        if (count > 0) {
            double average = (double) sum / count;
            System.out.printf("Середній бал: %.2f%n", average);
        } else {
            System.out.println("Оцінки не введено.");
        }

        scanner.close();
    }
}
