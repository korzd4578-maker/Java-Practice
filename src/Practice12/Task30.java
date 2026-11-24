package Practice12;
import java.util.*;
public class Task30 {
    interface ElementFilter<T> {
        boolean accept(T element);
    }

    static class FilteredIterator<T> implements Iterator<T> {

        private final Iterator<T> source;
        private final ElementFilter<T> filter;

        private T nextElement;
        private boolean ready = false;

        public FilteredIterator(
                Iterator<T> source,
                ElementFilter<T> filter) {

            this.source = source;
            this.filter = filter;

            advance();
        }

        private void advance() {

            ready = false;

            while (source.hasNext()) {

                T element = source.next();

                if (filter.accept(element)) {

                    nextElement = element;
                    ready = true;

                    return;
                }
            }
        }

        @Override
        public boolean hasNext() {
            return ready;
        }

        @Override
        public T next() {

            if (!ready) {
                throw new NoSuchElementException();
            }

            T result = nextElement;

            advance();

            return result;
        }
    }

    static class Student {

        private final String name;
        private final double gpa;

        public Student(String name, double gpa) {
            this.name = name;
            this.gpa = gpa;
        }

        @Override
        public String toString() {
            return name + " | GPA: " + gpa;
        }
    }

    public static void main(String[] args) {

        List<Student> students = Arrays.asList(
                new Student("Ivan", 95),
                new Student("Alex", 85),
                new Student("Maria", 98),
                new Student("John", 75),
                new Student("Olena", 92)
        );

        FilteredIterator<Student> studentIterator =
                new FilteredIterator<>(
                        students.iterator(),
                        student -> student.gpa >= 90
                );

        System.out.println("Студенты с GPA >= 90:");

        while (studentIterator.hasNext()) {
            System.out.println(studentIterator.next());
        }

        Set<Integer> numbers = new HashSet<>(
                Arrays.asList(7, 10, 14, 21, 25, 28, 35, 40)
        );

        FilteredIterator<Integer> numberIterator =
                new FilteredIterator<>(
                        numbers.iterator(),
                        number -> number % 7 == 0
                );

        System.out.println("\nЧисла, кратные 7:");

        while (numberIterator.hasNext()) {
            System.out.println(numberIterator.next());
        }
    }
}
