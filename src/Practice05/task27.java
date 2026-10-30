package Practice05;

public class task27 {
    public static void main(String[] args) {
        int[][] multTable = new int[9][9];

        System.out.println("Таблиця Піфагора:");
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                multTable[i][j] = (i + 1) * (j + 1);
                System.out.printf("%4d", multTable[i][j]);
            }
            System.out.println();
        }
    }
}
