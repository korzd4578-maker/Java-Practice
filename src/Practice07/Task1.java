package Practice07;

public class Task1 {
    public static void main(String[] args) {
        Book book1 = new Book();
        Book book2 = new Book("Кобзар", "Тарас Шевченко", 1840, 350);

        System.out.println("Перша книга:");
        book1.printInfo();

        System.out.println("-------------------");

        System.out.println("Друга книга:");
        book2.printInfo();
    }
}
