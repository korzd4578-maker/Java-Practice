package Homework;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;

class Point2D {
    private final int x;
    private final int y;

    public Point2D(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() { return x; }
    public int getY() { return y; }

    public double distanceFromOrigin() {
        return Math.sqrt(x * x + y * y);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Point2D point2D)) return false;
        return x == point2D.x && y == point2D.y;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }

    @Override
    public String toString() {
        return "(" + x + "; " + y + ")";
    }
}

class PointSetUtils {
    public static HashSet<Point2D> union(HashSet<Point2D> a, HashSet<Point2D> b) {
        HashSet<Point2D> res = new HashSet<>(a);
        res.addAll(b);
        return res;
    }

    public static HashSet<Point2D> intersection(HashSet<Point2D> a, HashSet<Point2D> b) {
        HashSet<Point2D> res = new HashSet<>(a);
        res.retainAll(b);
        return res;
    }

    public static HashSet<Point2D> difference(HashSet<Point2D> a, HashSet<Point2D> b) {
        HashSet<Point2D> res = new HashSet<>(a);
        res.removeAll(b);
        return res;
    }

    public static int removeFarPoints(HashSet<Point2D> points, double maxRadius) {
        int removed = 0;
        Iterator<Point2D> it = points.iterator();
        while (it.hasNext()) {
            Point2D p = it.next();
            if (p.distanceFromOrigin() > maxRadius) {
                it.remove();
                removed++;
            }
        }
        return removed;
    }
}

public class Task1UniquePointsAndSets {
    public static void main(String[] args) {
        System.out.println("================ 📡 ГЕОДЕЗИЧНИЙ РАДАР: HASHSET ТА ITERATOR 📡 ================");
        ArrayList<Point2D> rawA = new ArrayList<>(Arrays.asList(
                new Point2D(0, 0), new Point2D(3, 4), new Point2D(1, 2),
                new Point2D(3, 4), new Point2D(6, 8), new Point2D(5, 0), new Point2D(1, 2)
        ));
        ArrayList<Point2D> rawB = new ArrayList<>(Arrays.asList(
                new Point2D(3, 4), new Point2D(5, 0), new Point2D(2, 2),
                new Point2D(8, 6), new Point2D(2, 2), new Point2D(0, 10)
        ));

        HashSet<Point2D> setA = new HashSet<>(rawA);
        HashSet<Point2D> setB = new HashSet<>(rawB);

        System.out.println("Сенсор A: отримано " + rawA.size() + " точок -> унікальних (HashSet): " + setA.size() + " " + setA);
        System.out.println("Сенсор B: отримано " + rawB.size() + " точок -> унікальних (HashSet): " + setB.size() + " " + setB);

        HashSet<Point2D> unionSet = PointSetUtils.union(setA, setB);
        System.out.println("\n--- Операції над множинами (HashSet) ---");
        System.out.println("Об'єднання (A U B) [" + unionSet.size() + "]:  " + unionSet);
        System.out.println("Перетин (A ∩ B) [" + PointSetUtils.intersection(setA, setB).size() + "]:     " + PointSetUtils.intersection(setA, setB));
        System.out.println("Різниця (A \\ B) [" + PointSetUtils.difference(setA, setB).size() + "]:     " + PointSetUtils.difference(setA, setB));

        System.out.println("\n--- Фільтрація через Iterator (R_max = 7.0) ---");
        int removedCount = PointSetUtils.removeFarPoints(unionSet, 7.0);
        System.out.println("Видалено точок поза радіусом: " + removedCount);
        System.out.println("Залишилось у зоні [" + unionSet.size() + "]:   " + unionSet);
        System.out.println("==============================================================================");
    }
}