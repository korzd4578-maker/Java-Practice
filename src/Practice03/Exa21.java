package Practice03;
import java.util.Scanner;
public class Exa21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть число: ");
        int n = scanner.nextInt();

        String status = (n > 0) ? "Додатне" : (n < 0) ? "Від'ємне" : "Нуль";
        System.out.println(status);
        scanner.close();
    }
}
