package Practice03;
import java.util.Scanner;
public class Exa8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Товар: ");
        String product = scanner.nextLine();
        System.out.print("Ціна: ");
        double price = scanner.nextDouble();
        System.out.print("Кількість: ");
        int quantity = scanner.nextInt();

        double total = price * quantity;
        double vat = total * 0.20;
        System.out.println("Загальна сума: " + total + " грн (з них ПДВ 20%: " + vat + " грн)");
        scanner.close();
    }
}
