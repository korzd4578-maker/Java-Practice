package Practice06;

public class Assingment40 {
    public static void main(String[] args) {

        MatrixDiagonals diagonals = new MatrixDiagonals();

        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        diagonals.setMatrix(matrix);

        System.out.println("Сума головної діагоналі: "
                + diagonals.getMainDiagonalSum());

        System.out.println("Сума побічної діагоналі: "
                + diagonals.getAntiDiagonalSum());

        System.out.println("Діагоналі рівні: "
                + diagonals.isDiagonalSymmetric());

    }
}
