package Practice04;
import java.util.Scanner;
public class Task32 {
    public static void main(String[] args) {
        double[] prices = {19.99, 45.50, 12.10, 99.95, 3.40};

        int totalHryvnias = 0;
        int totalKopiykas = 0;

        for (int i = 0; i < prices.length; i++) {
            int hryvnias = (int) prices[i];
            int kopiykas = (int) Math.round((prices[i] - hryvnias) * 100);

            totalHryvnias += hryvnias;
            totalKopiykas += kopiykas;

            System.out.println("Ціна: " + prices[i] + " грн");
            System.out.println("Цілі гривні: " + hryvnias);
            System.out.println("Копійки: " + kopiykas);
        }

        System.out.println("Сума цілих гривень: " + totalHryvnias);
        System.out.println("Сума відкинутих копійок: " + totalKopiykas);
    }
}
