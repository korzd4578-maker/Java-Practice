package Practice03;
import java.util.Scanner;
public class Exa40 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double balance = 5000.0;
        System.out.println("================ БАНКОМАТ ================");
        System.out.print("Введіть PIN: ");
        int pin = scanner.nextInt();
        if (pin != 1234) {
            System.out.println("Невірний PIN. Доступ заборонено.");
        } else {
            System.out.println("Авторизація успішна!");
            System.out.print("Оберіть дію (1 - Баланс, 2 - Поповнення, 3 - Зняття, 4 - Вихід): ");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1 -> System.out.println("Поточний баланс: " + balance + " грн");
                case 2 -> {
                    System.out.print("Введіть суму поповнення: ");
                    double amount = scanner.nextDouble();
                    if (amount > 0) {
                        balance += amount;
                        System.out.println("Баланс після поповнення: " + balance + " грн");
                    } else {
                        System.out.println("Некоректна сума поповнення");
                    }
                }
                case 3 -> {
                    System.out.print("Введіть суму зняття: ");
                    double amount = scanner.nextDouble();
                    double commission = amount > 1000 ? amount * 0.01 : 0.0;
                    if (amount > 0 && amount + commission <= balance) {
                        balance -= amount + commission;
                        System.out.println("Комісія операції: " + commission + " грн");
                        System.out.println("Видано: " + amount + " грн. Залишок на рахунку: " + balance + " грн");
                    } else {
                        System.out.println("Недостатньо коштів (з урахуванням комісії) або некоректна сума");
                    }
                }
                case 4 -> System.out.println("Роботу завершено");
                default -> System.out.println("Невідома операція");
            }
        }
        System.out.println("==========================================");
        scanner.close();
    }
}
