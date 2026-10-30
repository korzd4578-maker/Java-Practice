package Practice05;

public class task34 {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };
        int mainDiagSum = 0;
        int sideDiagSum = 0;
        for (int i = 0; i < matrix.length; i++) {
            mainDiagSum += matrix[i][i];
            sideDiagSum += matrix[i][matrix.length - 1 - i];
        }
        System.out.println("Сума головної діагоналі: " + mainDiagSum);
        System.out.println("Сума побічної діагоналі: " + sideDiagSum);
        System.out.println("Діагоналі рівні за сумою? " + (mainDiagSum == sideDiagSum));
    }
}
