package Practice03;
import java.util.Scanner;
public class Exa30 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Сторона a: ");
        double a = scanner.nextDouble();
        System.out.print("Сторона b: ");
        double b = scanner.nextDouble();
        System.out.print("Сторона c: ");
        double c = scanner.nextDouble();
        boolean exists = (a + b > c) && (a + c > b) && (b + c > a);
        System.out.println("Трикутник існує: " + exists);
        scanner.close();
    }
}
