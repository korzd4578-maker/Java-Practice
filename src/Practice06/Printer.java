package Practice06;

public class Printer {
    public String model;
    public int paperCount;

    public void printDocument(String title, int pages) {
        if (pages <= 0) {
            System.out.println("Помилка: некоректна кількість сторінок!");
        } else if (paperCount >= pages) {
            paperCount -= pages;

            System.out.println("Документ \"" + title + "\" успішно надруковано!");
            System.out.println("Використано сторінок: " + pages);
            System.out.println("Залишилося паперу: " + paperCount);
        } else {
            System.out.println("Помилка: Недостатньо паперу в принтері " + model + "!");
        }
    }
}
