package Practice05;
import java.util.Scanner;
public class task12 {
    public static void main(String[] args) {
        int[] students = {1042, 2031, 3055, 4018, 5099};
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть шуканий номер: ");
        int target = scanner.nextInt();
        int foundIndex = -1;

        for (int i = 0; i < students.length; i++) {
            if (students[i] == target) {
                foundIndex = i;
                break;
            }
        }
        if (foundIndex != -1) {
            System.out.println("Елемент знайдено на позиції " + foundIndex);
        } else {
            System.out.println("Студента з таким номером не знайдено");
        }
    }
}
