package Practice03;

import java.util.Scanner;

public class Exa1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ім'я: ");
        String firstName = scanner.nextLine();
        System.out.print("Прізвище: ");
        String lastName = scanner.nextLine();
        System.out.print("Вік: ");
        int age = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Місто: ");
        String city = scanner.nextLine();
        System.out.println("-------------------");
        System.out.println("Привіт, " + firstName + " " + lastName + " з міста " + city + "! Твій вік: " + age + " р.");
        scanner.close();
    }
}
