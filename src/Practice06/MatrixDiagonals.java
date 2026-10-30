package Practice06;

public class MatrixDiagonals {
    private int[][] matrix;

    public void setMatrix(int[][] matrix) {
        this.matrix = matrix;
    }

    public int getMainDiagonalSum() {
        if (matrix == null || matrix.length == 0) {
            return 0;
        }

        int sum = 0;

        for (int i = 0; i < matrix.length; i++) {
            sum += matrix[i][i];
        }

        return sum;
    }

    public int getAntiDiagonalSum() {
        if (matrix == null || matrix.length == 0) {
            return 0;
        }

        int sum = 0;

        for (int i = 0; i < matrix.length; i++) {
            sum += matrix[i][matrix.length - 1 - i];
        }

        return sum;
    }

    public boolean isDiagonalSymmetric() {
        return getMainDiagonalSum() == getAntiDiagonalSum();
    }
}
