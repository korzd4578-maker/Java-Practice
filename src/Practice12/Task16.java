package Practice12;
import java.util.*;
public class Task16 {
    static final class IntVector2D {

        private final int dx;
        private final int dy;

        public IntVector2D(int dx, int dy) {
            this.dx = dx;
            this.dy = dy;
        }

        public int dotProduct(IntVector2D other) {
            return dx * other.dx + dy * other.dy;
        }

        public double norm() {
            return Math.sqrt(dx * dx + dy * dy);
        }

        @Override
        public boolean equals(Object obj) {

            if (this == obj) return true;

            if (!(obj instanceof IntVector2D other)) {
                return false;
            }

            return dx == other.dx && dy == other.dy;
        }

        @Override
        public int hashCode() {
            return Objects.hash(dx, dy);
        }

        @Override
        public String toString() {
            return "(" + dx + ", " + dy + ")";
        }
    }

    public static void main(String[] args) {

        IntVector2D[] vectors = {
                new IntVector2D(1, 0),
                new IntVector2D(0, 1),
                new IntVector2D(1, 1),
                new IntVector2D(-1, 1),
                new IntVector2D(1, 0),
                new IntVector2D(2, 0),
                new IntVector2D(0, -2),
                new IntVector2D(0, 0)
        };

        Set<IntVector2D> uniqueVectors = new HashSet<>(
                Arrays.asList(vectors)
        );

        System.out.println("Уникальные векторы: "
                + uniqueVectors);

        System.out.println("\nПерпендикулярные пары:");

        List<IntVector2D> list = new ArrayList<>(uniqueVectors);

        for (int i = 0; i < list.size(); i++) {

            for (int j = i + 1; j < list.size(); j++) {

                IntVector2D a = list.get(i);
                IntVector2D b = list.get(j);

                if (a.norm() != 0
                        && b.norm() != 0
                        && a.dotProduct(b) == 0) {

                    System.out.println(a + " и " + b);
                }
            }
        }
    }
}
