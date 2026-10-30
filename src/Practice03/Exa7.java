package Practice03;
import java.util.Scanner;
public class Exa7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Катет A: ");
        double a = scanner.nextDouble();
        System.out.print("Катет B: ");
        double b = scanner.nextDouble();

        if (a > 0 && b > 0) {
            double c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
            System.out.println("Гіпотенуза: " + c);
            System.out.println("Периметр: " + (a + b + c));
            System.out.println("Площа: " + (a * b / 2));
        } else {
            System.out.println("Помилка: катети мають бути додатними");
        }
        scanner.close();
    }
}
