package Practice04;
import java.util.Scanner;
public class Task33 {
    public static void main(String[] args) {
        for (int i = 1; i <= 50; i++) {
            int percent = (int) (((double) i / 50) * 100);
            System.out.println("Завантажено: " + percent + "%");
        }

        System.out.println("Завантаження завершено!");
    }
}
