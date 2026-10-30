package Practice04;
import java.util.Scanner;
public class Task34 {
    public static void main(String[] args) {
        long bigNumber = 3_000_000_000L;
        int smallNumber = (int) bigNumber;

        System.out.println("Початкове число (long): " + bigNumber);
        System.out.println("Після приведення до int: " + smallNumber);

        System.out.println("Відбулася втрата інформації через переповнення типу int.");
    }
}
