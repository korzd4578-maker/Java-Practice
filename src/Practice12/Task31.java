package Practice12;
import java.util.*;
public class Task31 {
    static final class Book {

        private final String isbn;
        private final String title;
        private final int year;

        public Book(String isbn, String title, int year) {
            this.isbn = isbn;
            this.title = title;
            this.year = year;
        }

        public int getYear() {
            return year;
        }

        @Override
        public boolean equals(Object obj) {

            if (this == obj) return true;

            if (!(obj instanceof Book other)) {
                return false;
            }

            return Objects.equals(isbn, other.isbn);
        }

        @Override
        public int hashCode() {
            return Objects.hash(isbn);
        }

        @Override
        public String toString() {
            return title + " (" + year + ") ISBN: " + isbn;
        }
    }

    public static void main(String[] args) {

        Set<Book> hashSet = new HashSet<>();

        hashSet.add(new Book("111", "Java Basics", 2020));
        hashSet.add(new Book("222", "Clean Code", 2018));
        hashSet.add(new Book("333", "Effective Java", 2022));
        hashSet.add(new Book("444", "Old Java", 2010));
        hashSet.add(new Book("111", "Java Basics Duplicate", 2021));
        hashSet.add(new Book("555", "Algorithms", 2014));
        hashSet.add(new Book("666", "Spring in Action", 2019));

        TreeSet<Book> sortedBooks = new TreeSet<>(
                Comparator.comparingInt(Book::getYear)
                        .reversed()
                        .thenComparing(book -> book.title)
        );

        sortedBooks.addAll(hashSet);

        Iterator<Book> it = sortedBooks.iterator();

        while (it.hasNext()) {

            Book book = it.next();

            if (book.getYear() < 2015) {
                it.remove();
            }
        }

        System.out.println("Книги после фильтрации:");

        for (Book book : sortedBooks) {
            System.out.println(book);
        }
    }
}
