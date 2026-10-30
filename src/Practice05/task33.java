package Practice05;

public class task33 {
    public static void main(String[] args) {
        int[][] matrix = {
                {12, -5, 43, 2},
                {19, 0, -2, 8},
                {55, 15, -10, 24}
        };
        int max = matrix[0][0];
        int maxRow = 0, maxCol = 0;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] > max) {
                    max = matrix[i][j];
                    maxRow = i;
                    maxCol = j;
                }
            }
        }
        System.out.println("Максимальний елемент: " + max + " знаходиться в комірці [" + maxRow + ", " + maxCol + "]");
    }
}
