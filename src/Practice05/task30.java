package Practice05;

public class task30 {
    public static void main(String[] args) {
        int[][] matrix = {
                {5, 10, 15},
                {20, 25, 30},
                {35, 40, 45}
        };
        int sum = 0;
        int totalElements = matrix.length * matrix[0].length;

        for (int[] row : matrix) {
            for (int val : row) {
                sum += val;
            }
        }
        double average = (double) sum / totalElements;
        System.out.println("Загальна сума: " + sum);
        System.out.println("Загальна кількість елементів: " + totalElements);
        System.out.println("Середнє арифметичне: " + average);
    }
}
