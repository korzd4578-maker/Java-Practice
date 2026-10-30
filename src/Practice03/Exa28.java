package Practice03;
import java.util.Scanner;
public class Exa28 {
    public static void main(String[] args) {
        int counterA = 0;
        int counterB = 0;
        boolean test1 = true || (++counterA > 0);
        boolean test2 = true | (++counterB > 0);
        System.out.println("counterA = " + counterA + ", test1 = " + test1);
        System.out.println("counterB = " + counterB + ", test2 = " + test2);
    }

}
