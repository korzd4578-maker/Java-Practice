package Practice12;
import java.util.*;
public class Task25 {
    static class ArithmeticProgression implements Iterable<Double> {

        private final double first;
        private final double step;
        private final int count;

        public ArithmeticProgression(
                double first, double step, int count) {

            if (count < 0) {
                throw new IllegalArgumentException(
                        "Количество не может быть отрицательным"
                );
            }

            this.first = first;
            this.step = step;
            this.count = count;
        }

        @Override
        public Iterator<Double> iterator() {

            return new Iterator<>() {

                private int index = 0;

                @Override
                public boolean hasNext() {
                    return index < count;
                }

                @Override
                public Double next() {

                    if (!hasNext()) {
                        throw new NoSuchElementException();
                    }

                    return first + index++ * step;
                }
            };
        }
    }

    public static void main(String[] args) {

        double first = 2.0;
        double step = 3.0;
        int count = 10;

        ArithmeticProgression progression =
                new ArithmeticProgression(first, step, count);

        double sum = 0;

        System.out.println("Арифметическая прогрессия:");

        for (double value : progression) {
            System.out.print(value + " ");
            sum += value;
        }

        double formula = count *
                (2 * first + (count - 1) * step) / 2;

        System.out.println("\nСумма через цикл: " + sum);
        System.out.println("Сумма по формуле: " + formula);
    }
}
