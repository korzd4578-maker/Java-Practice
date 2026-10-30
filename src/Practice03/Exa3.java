package Practice03;
import java.util.Scanner;
public class Exa3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть суму в гривнях (UAH): ");
        double uah = scanner.nextDouble();
        System.out.print("Введіть курс USD: ");
        double exchangeRate = scanner.nextDouble();

        if (exchangeRate > 0) {
            System.out.printf(java.util.Locale.US, "Сума до видачі: %.2f USD%n", uah / exchangeRate);
        } else {
            System.out.println("Помилка: курс має бути більшим за нуль");
        }
        scanner.close();
    }
}
