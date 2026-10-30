package Practice06;

public class Matrix2D {
    private int[][] grid;

    public void setGrid(int[][] grid) {
        this.grid = grid;
    }

    public void printMatrix() {
        if (grid == null) {
            System.out.println("Матриця порожня!");
            return;
        }

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                System.out.print(grid[i][j] + "\t");
            }

            System.out.println();
        }
    }

    public int getTotalSum() {
        int sum = 0;

        if (grid == null) {
            return 0;
        }

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                sum += grid[i][j];
            }
        }

        return sum;
    }

    public int getRowSum(int rowIndex) {
        if (grid == null || rowIndex < 0 || rowIndex >= grid.length) {
            return 0;
        }

        int sum = 0;

        for (int j = 0; j < grid[rowIndex].length; j++) {
            sum += grid[rowIndex][j];
        }

        return sum;
    }
}
