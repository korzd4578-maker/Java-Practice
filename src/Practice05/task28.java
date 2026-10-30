package Practice05;

public class task28 {
    public static void main(String[] args) {
        int[][] identity = new int[5][5];

        System.out.println("Одинична матриця 5x5:");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (i == j) {
                    identity[i][j] = 1;
                }
                System.out.print(identity[i][j] + " ");
            }
            System.out.println();
        }
    }
}
