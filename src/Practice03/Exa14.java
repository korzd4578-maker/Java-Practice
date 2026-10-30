package Practice03;
import java.util.Scanner;
public class Exa14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть X: ");
        double x = scanner.nextDouble();
        System.out.print("Введіть Y: ");
        double y = scanner.nextDouble();

        String position;
        if (x == 0 && y == 0) {
            position = "у початку координат";
        } else if (x == 0) {
            position = "на осі Y";
        } else if (y == 0) {
            position = "на осі X";
        } else if (x > 0 && y > 0) {
            position = "у I чверті";
        } else if (x < 0 && y > 0) {
            position = "у II чверті";
        } else if (x < 0 && y < 0) {
            position = "у III чверті";
        } else {
            position = "у IV чверті";
        }
        System.out.println("Точка (" + x + "; " + y + ") знаходиться " + position + ".");
        scanner.close();
    }
}
