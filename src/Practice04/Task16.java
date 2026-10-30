package Practice04;
import java.util.Scanner;
public class Task16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int correctPin = 1234;
        int pin;
        int attempts = 0;

        do {
            System.out.print("Введіть PIN-код: ");
            pin = scanner.nextInt();
            attempts++;

            if (pin == correctPin) {
                System.out.println("Доступ надано");
                break;
            } else {
                System.out.println("Неправильний PIN-код!");
            }

        } while (attempts < 3);

        if (pin != correctPin) {
            System.out.println("Карту заблоковано!");
        }

        scanner.close();
    }
}
