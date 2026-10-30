package Practice03;
import java.util.Scanner;
public class Exa31 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть число: ");
        int n = scanner.nextInt();
        boolean isEvenBitwise = (n & 1) == 0;
        boolean isEvenModulo = n % 2 == 0;
        System.out.println("Через &: " + isEvenBitwise);
        System.out.println("Через %: " + isEvenModulo);
        System.out.println("Операція n & 1 залишає тільки останній біт числа: 0 — парне, 1 — непарне.");
        scanner.close();
    }
}
