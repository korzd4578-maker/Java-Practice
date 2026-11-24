package Practice12;
import java.util.*;
public class Task09 {
    static class SetMathUtils {
        public static <T> Set<T> union(Set<T> a, Set<T> b) {
            Set<T> result = new HashSet<>(a);
            result.addAll(b);
            return result;
        }

        public static <T> Set<T> intersection(Set<T> a, Set<T> b) {
            Set<T> result = new HashSet<>(a);
            result.retainAll(b);
            return result;
        }

        public static <T> Set<T> difference(Set<T> a, Set<T> b) {
            Set<T> result = new HashSet<>(a);
            result.removeAll(b);
            return result;
        }

        public static <T> Set<T> symmetricDifference(Set<T> a, Set<T> b) {
            Set<T> result = union(a, b);
            result.removeAll(intersection(a, b));
            return result;
        }
    }

    public static void main(String[] args) {

        Set<Integer> a = new HashSet<>(
                Arrays.asList(1, 2, 3, 4, 5)
        );

        Set<Integer> b = new HashSet<>(
                Arrays.asList(4, 5, 6, 7, 8)
        );

        System.out.println("A: " + a);
        System.out.println("B: " + b);

        System.out.println("Объединение: "
                + SetMathUtils.union(a, b));

        System.out.println("Пересечение: "
                + SetMathUtils.intersection(a, b));

        System.out.println("Разность A - B: "
                + SetMathUtils.difference(a, b));

        System.out.println("Симметрическая разность: "
                + SetMathUtils.symmetricDifference(a, b));

        System.out.println("Исходная A: " + a);
        System.out.println("Исходная B: " + b);
    }
}
