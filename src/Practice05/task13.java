package Practice05;
import java.util.Scanner;
public class task13 {
    public static void main(String[] args) {
        int[] rolls = {3, 6, 2, 6, 1, 4, 6, 5, 2, 6};
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть число від 1 до 6: ");
        int target = scanner.nextInt();
        int count = 0;
        for (int roll : rolls) {
            if (roll == target) count++;
        }
        System.out.println("Число " + target + " випало " + count + " раз(ів)");
    }
}
