package Practice03;
import java.util.Scanner;
public class Exa15 {
    public static void main(String[] args) {
        int x = 5;
        int y = 20;

        if (x > 10)
            if (y > 10)
                System.out.println("Обидві умови істинні");
            else
                System.out.println("Цей else належить внутрішньому if");

        if (x > 10) {
            if (y > 10) {
                System.out.println("Обидві умови істинні");
            }
        } else {
            System.out.println("Зовнішній if хибний: x <= 10");
        }
    }
}
