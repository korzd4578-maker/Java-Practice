package Practice11;
import java.util.ArrayList;
import java.util.List;
public class Task10 {
    public static List<Integer> traceArrayListCapacity(
            int elementsCount) {

        ArrayList<Integer> capacities = new ArrayList<>();

        int capacity = 0;

        for (int size = 1; size <= elementsCount; size++) {

            if (capacity == 0) {

                capacity = 10;

                System.out.println(
                        "Після додавання першого елемента "
                                + "створено масив ємністю 10."
                );

                capacities.add(capacity);

            } else if (size > capacity) {

                int oldCapacity = capacity;

                capacity = oldCapacity + (oldCapacity >> 1);

                System.out.println(
                        "Елемент №" + size
                                + ": ємність збільшено з "
                                + oldCapacity + " до " + capacity + "."
                );

                capacities.add(capacity);
            }
        }

        return capacities;
    }

    public static void main(String[] args) {

        System.out.println(
                "Моделювання розширення внутрішнього масиву ArrayList:"
        );

        System.out.println(
                "Ємності: " + traceArrayListCapacity(100)
        );
    }
}
