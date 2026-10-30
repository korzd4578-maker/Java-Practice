package Practice04;
import java.util.Scanner;
public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть курс євро: ");
        double rate = scanner.nextDouble();

        for (int euro = 10; euro <= 100; euro += 10) {
            double uah = euro * rate;
            System.out.printf("%d EUR = %.2f грн%n", euro, uah);
        }

        scanner.close();
    }
}
