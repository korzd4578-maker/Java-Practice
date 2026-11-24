package Practice12;
import java.util.*;
public class Task29 {
    static class PrimeNumberGenerator implements Iterable<Integer> {

        private final int maxLimit;

        public PrimeNumberGenerator(int maxLimit) {
            this.maxLimit = maxLimit;
        }

        private boolean isPrime(int number) {

            if (number < 2) {
                return false;
            }

            for (int i = 2; i <= Math.sqrt(number); i++) {

                if (number % i == 0) {
                    return false;
                }
            }

            return true;
        }

        @Override
        public Iterator<Integer> iterator() {

            return new Iterator<>() {

                private int current = 1;
                private Integer nextPrime = findNext();

                private Integer findNext() {

                    while (current < maxLimit) {

                        current++;

                        if (isPrime(current)) {
                            return current;
                        }
                    }

                    return null;
                }

                @Override
                public boolean hasNext() {
                    return nextPrime != null;
                }

                @Override
                public Integer next() {

                    if (!hasNext()) {
                        throw new NoSuchElementException();
                    }

                    int result = nextPrime;

                    nextPrime = findNext();

                    return result;
                }
            };
        }
    }

    public static void main(String[] args) {

        Set<Integer> primes = new HashSet<>();

        System.out.println("Простые числа до 100:");

        for (int p : new PrimeNumberGenerator(100)) {

            System.out.print(p + " ");

            primes.add(p);
        }

        int number = 84;

        boolean found = false;

        System.out.println("\n\nПроверка гипотезы Гольдбаха для 84:");

        for (int p : primes) {

            int second = number - p;

            if (primes.contains(second) && p <= second) {

                System.out.println(p + " + " + second + " = " + number);

                found = true;
            }
        }

        System.out.println("Пара найдена: " + found);
    }
}
