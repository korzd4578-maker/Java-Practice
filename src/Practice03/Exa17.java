package Practice03;
import java.util.Scanner;
public class Exa17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("x: ");
        int x = scanner.nextInt();
        System.out.print("y: ");
        int y = scanner.nextInt();

        int max = (x > y) ? x : y;
        System.out.println("Більше число: " + max);
        scanner.close();
    }
}
