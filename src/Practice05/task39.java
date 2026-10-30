package Practice05;

public class task39 {
    public static void main(String[] args) {
        int[][][] cube = new int[3][3][3];
        for (int x = 0; x < 3; x++) {
            System.out.println("--- Шар (x) = " + x + " ---");
            for (int y = 0; y < 3; y++) {
                for (int z = 0; z < 3; z++) {
                    cube[x][y][z] = x + y + z;
                    System.out.print(cube[x][y][z] + " ");
                }
                System.out.println();
            }
        }
    }
}
