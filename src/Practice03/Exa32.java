package Practice03;
import java.util.Scanner;
public class Exa32 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Правильний PIN? (true/false): ");
        boolean isPinCorrect = scanner.nextBoolean();
        System.out.print("Картка активна? (true/false): ");
        boolean isCardActive = scanner.nextBoolean();
        System.out.print("Баланс: ");
        double balance = scanner.nextDouble();
        System.out.print("Сума зняття: ");
        double amount = scanner.nextDouble();
        System.out.print("Добовий ліміт перевищено? (true/false): ");
        boolean isDailyLimitExceeded = scanner.nextBoolean();
        boolean hasSufficientBalance = balance >= amount;
        boolean canWithdraw = isPinCorrect && isCardActive && hasSufficientBalance && !isDailyLimitExceeded && amount > 0;
        System.out.println("Транзакція дозволена: " + canWithdraw);
        scanner.close();
    }
}
