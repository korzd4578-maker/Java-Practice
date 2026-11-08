package Practice08;

public class Task8 {
    public static void main(String[] args) {
        InvoiceItem item = new InvoiceItem(
                "Ноутбук",
                2,
                30000,
                10
        );

        System.out.println("Позиція чека: " + item);

        System.out.println("-------------------");

        InvoiceItem item2 = new InvoiceItem(
                "Миша",
                3,
                850,
                5
        );

        System.out.println("Позиція чека: " + item2);
    }
}
