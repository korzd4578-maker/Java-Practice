package Practice07;

public class BookItem {
    private String isbn;
    private String title;
    private String author;
    private boolean isAvailable;

    public BookItem(String isbn, String title, String author) {

        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.isAvailable = true;
    }

    public boolean borrowBook() {

        if (isAvailable) {

            isAvailable = false;

            return true;
        }

        return false;
    }

    public void returnBook() {

        isAvailable = true;

        System.out.println("Книгу повернуто до бібліотеки!");
    }

    public void printBook() {

        System.out.println("ISBN: " + isbn);
        System.out.println("Назва: " + title);
        System.out.println("Автор: " + author);

        System.out.println("Статус: "
                + (isAvailable ? "Доступна" : "Видана"));

        System.out.println("-------------------");
    }

    public String getTitle() {
        return title;
    }
}
