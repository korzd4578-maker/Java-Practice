package Practice12;
import java.util.*;
public class Task12 {
    static class BrokenPoint2D {

        private final int x;
        private final int y;

        public BrokenPoint2D(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    static class ValidPoint2D {

        private final int x;
        private final int y;

        public ValidPoint2D(int x, int y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public boolean equals(Object obj) {

            if (this == obj) return true;

            if (!(obj instanceof ValidPoint2D other)) {
                return false;
            }

            return x == other.x && y == other.y;
        }

        @Override
        public int hashCode() {
            return Objects.hash(x, y);
        }

        @Override
        public String toString() {
            return "(" + x + ", " + y + ")";
        }
    }

    public static void main(String[] args) {

        Set<BrokenPoint2D> brokenPoints = new HashSet<>();

        brokenPoints.add(new BrokenPoint2D(0, 0));
        brokenPoints.add(new BrokenPoint2D(3, 4));
        brokenPoints.add(new BrokenPoint2D(0, 0));
        brokenPoints.add(new BrokenPoint2D(3, 4));

        Set<ValidPoint2D> validPoints = new HashSet<>();

        validPoints.add(new ValidPoint2D(0, 0));
        validPoints.add(new ValidPoint2D(3, 4));
        validPoints.add(new ValidPoint2D(0, 0));
        validPoints.add(new ValidPoint2D(3, 4));

        System.out.println("BrokenPoint2D: "
                + brokenPoints.size());

        System.out.println("ValidPoint2D: "
                + validPoints.size());

        System.out.println("Существует точка (3,4): "
                + validPoints.contains(
                new ValidPoint2D(3, 4)
        ));
    }
}
