package Practice12;
import java.util.*;
public class Task08 {
    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>();
        Set<Integer> hashSet = new HashSet<>();

        for (int i = 0; i < 100000; i++) {
            arrayList.add(i);
            hashSet.add(i);
        }

        int found = 0;

        long startList = System.nanoTime();

        for (int i = 90000; i < 100000; i++) {
            if (arrayList.contains(i)) {
                found++;
            }
        }

        for (int i = 100000; i < 110000; i++) {
            arrayList.contains(i);
        }

        long endList = System.nanoTime();

        long startSet = System.nanoTime();

        for (int i = 90000; i < 100000; i++) {
            hashSet.contains(i);
        }

        for (int i = 100000; i < 110000; i++) {
            hashSet.contains(i);
        }

        long endSet = System.nanoTime();

        double listTime = (endList - startList) / 1_000_000.0;
        double setTime = (endSet - startSet) / 1_000_000.0;

        System.out.printf("ArrayList: %.3f ms\n", listTime);
        System.out.printf("HashSet: %.3f ms\n", setTime);

        System.out.printf("HashSet быстрее примерно в %.2f раз\n",
                listTime / setTime);

        System.out.println("Найдено элементов: " + found);
    }
}
