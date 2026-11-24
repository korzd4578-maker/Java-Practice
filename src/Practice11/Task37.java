package Practice11;
import java.util.ArrayList;
import java.util.List;
public class Task37 {
    public static <T> void rotateRight(List<T> list, int k) {

        if (list.isEmpty()) {
            return;
        }

        int rotations = Math.floorMod(k, list.size());

        for (int i = 0; i < rotations; i++) {

            T last = list.remove(list.size() - 1);

            list.add(0, last);
        }
    }

    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>(
                List.of(1, 2, 3, 4, 5)
        );

        System.out.println(
                "До зсуву: " + numbers
        );

        rotateRight(numbers, 2);

        System.out.println(
                "Після зсуву праворуч на 2 позиції: "
                        + numbers
        );
    }
}
