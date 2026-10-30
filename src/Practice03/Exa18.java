package Practice03;
import java.util.Scanner;
public class Exa18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть число: ");
        int n = scanner.nextInt();

        int abs = (n < 0) ? -n : n;
        System.out.println("Модуль числа: " + abs);
        scanner.close();
    }
}
