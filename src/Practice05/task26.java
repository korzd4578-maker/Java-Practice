package Practice05;
import java.util.Arrays;
public class task26 {
    public static void main(String[] args) {
        int[][] randomGrid = new int[4][3];
        for (int i = 0; i < randomGrid.length; i++) {
            for (int j = 0; j < randomGrid[i].length; j++) {
                randomGrid[i][j] = (int) (Math.random() * 90) + 10; // від 10 до 99
            }
        }

        System.out.println("1. Виведення через Arrays.deepToString():");
        System.out.println(Arrays.deepToString(randomGrid));

        System.out.println("\n2. Виведення у вигляді красивої таблиці:");
        for (int[] row : randomGrid) {
            for (int val : row) {
                System.out.print(val + "\t");
            }
            System.out.println();
        }
    }
}
