package Practice05;
import java.util.Arrays;
public class task38 {
    public static void main(String[] args) {
        int[][] pascal = new int[5][];
        System.out.println("Трикутник Паскаля:");
        for (int i = 0; i < 5; i++) {
            pascal[i] = new int[i + 1];
            pascal[i][0] = 1;
            pascal[i][i] = 1;
            for (int j = 1; j < i; j++) {
                pascal[i][j] = pascal[i - 1][j - 1] + pascal[i - 1][j];
            }
            System.out.println(Arrays.toString(pascal[i]));
        }
    }
}
