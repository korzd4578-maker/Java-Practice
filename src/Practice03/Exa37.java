package Practice03;
import java.util.Scanner;
public class Exa37 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Доставка (1 — Самовивіз, 2 — Кур'єр, 3 — Поштомат): ");
        int deliveryType = scanner.nextInt();
        System.out.print("Вага (кг): ");
        double weight = scanner.nextDouble();
        int cost = switch (deliveryType) {
            case 1 -> 0;
            case 2 -> {
                int courierCost = (weight > 5) ? 150 : 90;
                yield courierCost;
            }
            case 3 -> 60;
            default -> -1;
        };
        if (cost < 0) {
            System.out.println("Некоректний вибір доставки");
        } else {
            System.out.println("Вартість доставки: " + cost + " грн");
        }
        scanner.close();
    }
}
