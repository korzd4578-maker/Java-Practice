package Practice05;
import java.util.Arrays;
public class task36 {
    public static void main(String[] args) {
        int[][] ladder = new int[4][];
        System.out.println("Зубчастий масив-сходинки:");
        for (int i = 0; i < ladder.length; i++) {
            ladder[i] = new int[i + 1];
            Arrays.fill(ladder[i], i);
            System.out.println(Arrays.toString(ladder[i]));
        }
    }
}
