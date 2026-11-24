package Homework;
import java.util.Scanner;
public class Task2DeliveryService {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== ТАРИФІКАТОР СЛУЖБИ ДОСТАВКИ ===");
        System.out.print("Введіть вагу відправлення (кг): ");
        double weight = scanner.nextDouble();

        System.out.print("Введіть відстань транспортування (км): ");
        int distance = scanner.nextInt();

        System.out.print("Оберіть пункт призначення (1 - Відділення, 2 - Поштомат, 3 - Кур'єр): ");
        int deliveryType = scanner.nextInt();
        scanner.nextLine(); // очищення буфера

        System.out.print("Чи є у вас карта Premium? (так/ні): ");
        String premiumInput = scanner.nextLine();

        if (weight <= 0 || weight > 50.0) {
            System.out.println("Помилка: вага має бути від 0 до 50 кг!");
            scanner.close();
            return;
        }
        if (distance <= 0) {
            System.out.println("Помилка: відстань має бути більшою за 0!");
            scanner.close();
            return;
        }

        String typeName = "";
        double baseTariff = switch (deliveryType) {
            case 1 -> {
                typeName = "Відділення";
                yield 50.0;
            }
            case 2 -> {
                typeName = "Поштомат";
                if (weight > 15.0) {
                    System.out.println("Помилка: поштомат не приймає посилки понад 15 кг!");
                    yield -1.0;
                }
                yield 60.0;
            }
            case 3 -> {
                typeName = "Кур'єр";
                yield 100.0;
            }
            default -> {
                System.out.println("Помилка: невірний тип доставки!");
                yield -1.0;
            }
        };

        if (baseTariff < 0) {
            scanner.close();
            return;
        }

        double distanceFee;
        if (distance <= 50) {
            distanceFee = 0.0;
        } else if (distance <= 200) {
            distanceFee = 35.0;
        } else {
            distanceFee = 80.0;
        }

        double sumBeforeDiscount = baseTariff + distanceFee;
        boolean isPremium = premiumInput.equalsIgnoreCase("так");
        double totalCost = isPremium ? sumBeforeDiscount * 0.80 : sumBeforeDiscount;

        System.out.println("\n------------- НАКЛАДНА ДОСТАВКИ -------------");
        System.out.printf("Тип доставки:              %s (базовий тариф: %.2f грн)\n", typeName, baseTariff);
        System.out.printf("Доплата за відстань:       %.2f грн (%d км)\n", distanceFee, distance);
        System.out.printf("Сума до знижки:            %.2f грн\n", sumBeforeDiscount);
        System.out.println("Статус клієнта:            " + (isPremium ? "Premium (-20%)" : "Звичайний"));
        System.out.println("---------------------------------------------");
        System.out.printf("РАЗОМ ДО СПЛАТИ:           %.2f грн\n", totalCost);
        System.out.println("=============================================");

        scanner.close();
    }
}
