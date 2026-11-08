package Practice07;

public class Task18 {
    public static void main(String[] args) {
        DocumentPrinter printer = new DocumentPrinter();

        printer.print("Звичайне текстове повідомлення");

        printer.print(123);

        printer.print(123.456789, 2);

        String[] lines = {
                "Перший рядок",
                "Другий рядок",
                "Третій рядок"
        };

        printer.print(lines);

        printer.print("java programming", true);
    }
}
