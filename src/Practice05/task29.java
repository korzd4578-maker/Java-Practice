package Practice05;
import java.util.Arrays;
public class task29 {
    public static void main(String[] args) {
        int[][] matrix = new int[4][4];
        for (int[] row : matrix) {
            Arrays.fill(row, 1);
        }


        Arrays.fill(matrix[1], 0);


        for (int i = 0; i < matrix.length; i++) {
            matrix[i][2] = 7;
        }

        System.out.println("Модифікована матриця:");
        for (int[] row : matrix) {
            System.out.println(Arrays.toString(row));
        }
    }
}
