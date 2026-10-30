package Practice03;
import java.util.Scanner;
public class Exa25 {
    public static void main(String[] args) {
        int x = 10;
        Scanner scanner = new Scanner(System.in);
        int divisor = scanner.nextInt();
        if (divisor != 0 && (x / divisor > 1)) {
            System.out.println("Успішне ділення");
        } else {
            System.out.println("Ділення безпечно пропущено завдяки short-circuit!");
        }
    }
}