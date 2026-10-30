package Practice05;
import java.util.Scanner;
import java.util.Arrays;
public class task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть розмір масиву N: ");
        int n = scanner.nextInt();
        if (n > 0) {
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = i + 1;
            }
            System.out.println("Результат: " + Arrays.toString(arr));
        } else {
            System.out.println("Число має бути більше за 0");
        }
    }
}