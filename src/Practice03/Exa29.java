package Practice03;
import java.util.Scanner;
public class Exa29 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Години: ");
        int hours = scanner.nextInt();
        System.out.print("Хвилини: ");
        int minutes = scanner.nextInt();
        boolean isValidTime = (hours >= 0 && hours <= 23) && (minutes >= 0 && minutes <= 59);
        if (isValidTime) {
            System.out.printf("%02d:%02d%n", hours, minutes);
        } else {
            System.out.println("Помилка: некоректний час");
        }
        scanner.close();
    }
}
