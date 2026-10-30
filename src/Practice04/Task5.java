package Practice04;
import java.util.Scanner;
public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть ширину рамки: ");
        int width = scanner.nextInt();

        for (int i = 0; i < width; i++) {
            System.out.print("=");
        }

        System.out.println();
        scanner.close();
    }
}
