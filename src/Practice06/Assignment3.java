package Practice06;

public class Assignment3 {
    public static void main(String[] args) {

        Book emptyBook = new Book();

        System.out.println("Назва: " + emptyBook.title);
        System.out.println("Автор: " + emptyBook.author);
        System.out.println("Кількість сторінок: " + emptyBook.pages);
        System.out.println("Прочитана: " + emptyBook.isRead);

    }
}
