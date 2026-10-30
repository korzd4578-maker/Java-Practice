package Practice04;
import java.util.Scanner;
public class Task15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int age;

        do {
            System.out.print("Введіть ваш вік: ");
            age = scanner.nextInt();

            if (age < 1 || age > 120) {
                System.out.println("Некоректний вік! Спробуйте ще раз.");
            }
        } while (age < 1 || age > 120);

        System.out.println("Вік підтверджено: " + age);

        scanner.close();
    }
}
