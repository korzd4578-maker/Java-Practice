package Practice05;

public class task9 {
    public static void main(String[] args) {
        int[] temps = {18, 21, 15, 24, 13, 27, 20};
        int min = temps[0], max = temps[0];
        int minIdx = 0, maxIdx = 0;

        for (int i = 1; i < temps.length; i++) {
            if (temps[i] < min) {
                min = temps[i];
                minIdx = i;
            }
            if (temps[i] > max) {
                max = temps[i];
                maxIdx = i;
            }
        }
        System.out.println("Мінімум: " + min + " (інд: " + minIdx + "), Максимум: " + max + " (інд: " + maxIdx + ")");
    }
}
