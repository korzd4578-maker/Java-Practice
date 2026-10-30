package Practice03;
import java.util.Scanner;
public class Exa2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть перше число: ");
        int a = scanner.nextInt();
        System.out.print("Введіть друге число: ");
        int b = scanner.nextInt();
        System.out.println("Сума: " + (a + b));
        System.out.println("Різниця: " + (a - b));
        System.out.println("Добуток: " + (a * b));
        if (b != 0) {
            System.out.println("Остача від ділення: " + (a % b));
        } else {
            System.out.println("Остача: ділення на нуль неможливе");
        }
        scanner.close();
    }
}
