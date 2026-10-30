package Practice03;
import java.util.Scanner;
public class Exa26 {
    public static void main(String[] args) {
        int counter1 = 0;
        int counter2 = 0;
        boolean b1 = false && (++counter1 > 0);
        boolean b2 = false & (++counter2 > 0);
        // ~ пропускає правий операнд, & перевіряє обидва.
        System.out.println("counter1 = " + counter1 + ", b1 = " + b1);
        System.out.println("counter2 = " + counter2 + ", b2 = " + b2);
    }
}
