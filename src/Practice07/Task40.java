package Practice07;

public class Task40 {
    public static void main(String[] args) {
        LibraryCatalog library = new LibraryCatalog(5);

        BookItem book1 = new BookItem(
                "978-1",
                "Кобзар",
                "Тарас Шевченко"
        );

        BookItem book2 = new BookItem(
                "978-2",
                "1984",
                "Джордж Орвелл"
        );

        BookItem book3 = new BookItem(
                "978-3",
                "Маленький принц",
                "Антуан де Сент-Екзюпері"
        );

        System.out.println("Додавання книг:");

        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);

        System.out.println("-------------------");

        System.out.println("Початковий каталог:");

        library.printCatalog();

        System.out.println("Видача книги 1984:");

        library.borrowBook("1984");

        System.out.println("-------------------");

        System.out.println("Повторна видача книги 1984:");

        library.borrowBook("1984");

        System.out.println("-------------------");

        System.out.println("Повернення книги:");

        BookItem foundBook = library.findBookByTitle("1984");

        if (foundBook != null) {
            foundBook.returnBook();
        }

        System.out.println("-------------------");

        System.out.println("Фінальний каталог:");

        library.printCatalog();
    }
}
