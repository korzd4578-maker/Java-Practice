package Practice12;
import java.util.*;
public class Task36 {
    static class Interval implements Comparable<Interval> {

        private final double start;
        private final double end;

        public Interval(double start, double end) {

            if (start > end) {
                throw new IllegalArgumentException(
                        "Начало интервала не может быть больше конца"
                );
            }

            this.start = start;
            this.end = end;
        }

        @Override
        public int compareTo(Interval other) {

            int result = Double.compare(start, other.start);

            if (result == 0) {
                result = Double.compare(end, other.end);
            }

            return result;
        }

        @Override
        public String toString() {
            return "[" + start + "; " + end + "]";
        }
    }

    public static void main(String[] args) {

        TreeSet<Interval> intervals = new TreeSet<>();

        intervals.add(new Interval(1, 4));
        intervals.add(new Interval(2, 6));
        intervals.add(new Interval(8, 10));
        intervals.add(new Interval(9, 12));
        intervals.add(new Interval(1, 4));
        intervals.add(new Interval(14, 16));
        intervals.add(new Interval(15, 20));

        System.out.println("Исходные интервалы: " + intervals);

        List<Interval> merged = new ArrayList<>();

        Iterator<Interval> it = intervals.iterator();

        if (it.hasNext()) {

            Interval current = it.next();

            double currentStart = current.start;
            double currentEnd = current.end;

            while (it.hasNext()) {

                Interval next = it.next();

                if (next.start <= currentEnd) {

                    currentEnd = Math.max(currentEnd, next.end);

                } else {

                    merged.add(
                            new Interval(currentStart, currentEnd)
                    );

                    currentStart = next.start;
                    currentEnd = next.end;
                }
            }

            merged.add(new Interval(currentStart, currentEnd));
        }

        double totalLength = 0;

        System.out.println("\nОбъединенные интервалы:");

        for (Interval interval : merged) {

            System.out.println(interval);

            totalLength += interval.end - interval.start;
        }

        System.out.println("Общая длина: " + totalLength);
    }
}
