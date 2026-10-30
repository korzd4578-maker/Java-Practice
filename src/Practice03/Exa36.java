package Practice03;
import java.util.Scanner;
public class Exa36 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть місяць: ");
        String month = scanner.nextLine().toLowerCase();
        String season = switch (month) {
            case "грудень", "січень", "лютий" -> "Зима";
            case "березень", "квітень", "травень" -> "Весна";
            case "червень", "липень", "серпень" -> "Літо";
            case "вересень", "жовтень", "листопад" -> "Осінь";
            default -> "Невідомий місяць";
        };
        System.out.println("Пора року: " + season);
        scanner.close();
    }
}
