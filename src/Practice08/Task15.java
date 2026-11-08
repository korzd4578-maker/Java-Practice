package Practice08;

public class Task15 {
    public static void main(String[] args) {
        PrintedBook printedBook = new PrintedBook(
                "Кобзар",
                "Тарас Шевченко",
                1840,
                320,
                "Тверда"
        );

        AudioBook audioBook = new AudioBook(
                "1984",
                "Джордж Орвелл",
                1949,
                615,
                "Іван Петренко"
        );

        System.out.println("Друкована книга:");
        System.out.println(printedBook);

        System.out.println("-------------------");

        System.out.println("Аудіокнига:");
        System.out.println(audioBook);
    }
}
