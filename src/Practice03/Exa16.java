package Practice03;
import java.util.Scanner;
public class Exa16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Спожито (кВт·год): ");
        double usage = scanner.nextDouble();

        if (usage < 0) {
            System.out.println("Помилка: від'ємне споживання");
        } else {
            double cost;
            if (usage <= 100) {
                cost = usage * 2.64;
            } else {
                cost = 100 * 2.64 + (usage - 100) * 4.32;
            }
            System.out.println("Сума до сплати: " + cost + " грн");
        }
        scanner.close();
    }
}
