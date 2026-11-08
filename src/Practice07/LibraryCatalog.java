package Practice07;

public class LibraryCatalog {
    private BookItem[] books;
    private int size;

    public LibraryCatalog(int capacity) {

        this.books = new BookItem[Math.max(0, capacity)];

        this.size = 0;
    }

    public void addBook(BookItem book) {

        if (book != null && size < books.length) {

            books[size] = book;

            size++;

            System.out.println("Книгу додано до каталогу!");

        } else {

            System.out.println("Неможливо додати книгу!");
        }
    }

    public BookItem findBookByTitle(String title) {

        if (title == null) {
            return null;
        }

        for (int i = 0; i < size; i++) {

            if (books[i].getTitle().equalsIgnoreCase(title)) {

                return books[i];
            }
        }

        return null;
    }

    public boolean borrowBook(String title) {

        BookItem book = findBookByTitle(title);

        if (book != null && book.borrowBook()) {

            System.out.println("Книгу \"" + title + "\" успішно видано!");

            return true;
        }

        System.out.println("Книгу неможливо видати!");

        return false;
    }

    public void printCatalog() {

        System.out.println("======= КАТАЛОГ БІБЛІОТЕКИ =======");

        for (int i = 0; i < size; i++) {

            books[i].printBook();
        }

        System.out.println("=================================");
    }
}
