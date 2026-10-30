package Practice03;
import java.util.Scanner;
public class Exa6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть символ: ");
        char ch = scanner.next().charAt(0);

        System.out.println("Символ: " + ch + " | Код символу: " + (int) ch);
        scanner.close();
    }
}
