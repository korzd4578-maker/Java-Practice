package Practice03;
import java.util.Scanner;
public class Exa23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ділене a: ");
        int a = scanner.nextInt();
        System.out.print("Дільник b: ");
        int b = scanner.nextInt();
        String answer = (b != 0) ? "Результат: " + ((double) a / b) : "Помилка: ділення на нуль неможливе!";
        System.out.println(answer);
        scanner.close();
    }
}
