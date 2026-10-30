package Practice04;
import java.util.Scanner;
public class Task35 {
    public static void main(String[] args) {
        System.out.println("Неправильний спосіб:");

        for (double d = 0.0; d <= 1.0; d += 0.1) {
            System.out.println(d);
        }

        System.out.println("Правильний спосіб:");

        for (int i = 0; i <= 10; i++) {
            double val = i / 10.0;
            System.out.println(val);
        }
    }
}
