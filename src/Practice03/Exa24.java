package Practice03;
import java.util.Scanner;
public class Exa24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Кількість помилок: ");
        int count = scanner.nextInt();
        String result = (count == 1) ? "Знайдено 1 помилку" : "Знайдено " + count + " помилок";
        System.out.println(result);
        scanner.close();
    }
}
