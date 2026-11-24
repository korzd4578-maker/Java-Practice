package Practice11;

public class Task05 {
    public static void testIntegerPool() {

        Integer a = 100;
        Integer b = 100;

        Integer x = 250;
        Integer y = 250;

        System.out.println(
                "Порівняння значень у кешованому діапазоні:"
        );

        System.out.println("a == b: " + (a == b));

        System.out.println(
                "a.equals(b): " + a.equals(b)
        );

        System.out.println(
                "\nПорівняння значень поза кешованим діапазоном:"
        );

        System.out.println("x == y: " + (x == y));

        System.out.println(
                "x.equals(y): " + x.equals(y)
        );

        System.out.println(
                "Пояснення: == порівнює посилання, "
                        + "а equals() — числові значення."
        );
    }

    public static void main(String[] args) {
        testIntegerPool();
    }
}
