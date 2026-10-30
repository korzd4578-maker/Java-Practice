package Practice03;
import java.util.Scanner;
public class Exa38 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Число 1: ");
        double a = scanner.nextDouble();
        System.out.print("Оберіть операцію (+, -, *, /): ");
        char op = scanner.next().charAt(0);
        System.out.print("Число 2: ");
        double b = scanner.nextDouble();
        double result = switch (op) {
            case '+' -> a + b;
            case '-' -> a - b;
            case '*' -> a * b;
            case '/' -> b == 0 ? Double.NaN : a / b;
            default -> Double.NaN;
        };
        if (op == '/' && b == 0) {
            System.out.println("Помилка: ділення на нуль!");
        } else if (op != '+' && op != '-' && op != '*' && op != '/') {
            System.out.println("Невідома операція");
        } else {
            System.out.println("Результат: " + result);
        }
        scanner.close();
    }
}
