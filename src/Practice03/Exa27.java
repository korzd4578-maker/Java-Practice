package Practice03;
import java.util.Scanner;
public class Exa27 {
    public static void main(String[] args) {
        int number = 5;
        // ~ не виконує праву частину, бо number > 0 уже true.
        if (number > 0 || (10 / 0 == 0)) {
            System.out.println("Умова виконана, аварійне ділення не викликалося!");
        }
    }
}
