package Practice04;
import java.util.Scanner;
public class Task21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть A: ");
        int a = scanner.nextInt();

        System.out.print("Введіть B: ");
        int b = scanner.nextInt();

        if (a > b) {
            System.out.println("A має бути менше або дорівнювати B!");
        } else {
            for (int i = a; i <= b; i++) {
                if (i % 2 == 0) {
                    System.out.print(i + " ");
                }
            }
        }

        scanner.close();
    }
}
