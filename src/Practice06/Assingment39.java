package Practice06;

public class Assingment39 {
    public static void main(String[] args) {

        Matrix2D matrix = new Matrix2D();

        int[][] numbers = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        matrix.setGrid(numbers);

        System.out.println("Матриця:");
        matrix.printMatrix();

        System.out.println("Сума всіх елементів: " + matrix.getTotalSum());
        System.out.println("Сума першого рядка: " + matrix.getRowSum(0));
        System.out.println("Сума другого рядка: " + matrix.getRowSum(1));
        System.out.println("Сума третього рядка: " + matrix.getRowSum(2));

    }
}
