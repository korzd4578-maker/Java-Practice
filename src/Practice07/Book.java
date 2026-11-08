package Practice07;

public class Book {
    private String title;
    private String author;
    private int year;
    private double price;

    public Book() {
        this.title = "Невідомо";
        this.author = "Невідомий";
        this.year = 2000;
        this.price = 0.0;
    }

    public Book(String title, String author, int year, double price) {
        this.title = title;
        this.author = author;
        this.year = year < 0 ? 2000 : year;
        this.price = price < 0 ? 0.0 : price;
    }

    public void printInfo() {
        System.out.println("Назва: " + title);
        System.out.println("Автор: " + author);
        System.out.println("Рік: " + year);
        System.out.println("Ціна: " + price + " грн");
    }
}
