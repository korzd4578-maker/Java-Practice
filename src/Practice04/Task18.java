package Practice04;
import java.util.Scanner;
public class Task18 {
    public static void main(String[] args) {
        int dice1;
        int dice2;
        int attempts = 0;

        do {
            dice1 = (int) (Math.random() * 6) + 1;
            dice2 = (int) (Math.random() * 6) + 1;

            attempts++;

            System.out.println("Спроба " + attempts + ": " + dice1 + " і " + dice2);

        } while (dice1 != dice2);

        System.out.println("Випав дубль!");
        System.out.println("Кількість спроб: " + attempts);
    }
}
