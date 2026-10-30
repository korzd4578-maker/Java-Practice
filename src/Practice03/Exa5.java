package Practice03;

import java.util.Scanner;

public class Exa5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ваш зріст (м): ");
        double height = scanner.nextDouble();
        System.out.print("Ваша вага (кг): ");
        double weight = scanner.nextDouble();

        if (height > 0 && weight > 0) {
            double bmi = weight / Math.pow(height, 2);
            System.out.printf(java.util.Locale.US, "Розрахований BMI: %.2f%n", bmi);
        } else {
            System.out.println("Помилка: зріст і вага мають бути додатними");
        }
        scanner.close();
    }

}
