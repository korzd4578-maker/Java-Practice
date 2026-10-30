package Practice03;
import java.util.Scanner;
public class Exa4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть номер квитка: ");
        int studentId = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Введіть повне ім'я студента: ");
        String fullName = scanner.nextLine();
        System.out.print("Введіть спеціальність: ");
        String speciality = scanner.nextLine();

        System.out.println("Студент: " + fullName + ", квиток №" + studentId + ", спеціальність: " + speciality);
        scanner.close();
    }
}
