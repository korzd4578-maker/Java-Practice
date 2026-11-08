package Practice08;

public class Task14 {
    public static void main(String[] args) {
        Smartphone phone1 = new Smartphone(
                "Samsung",
                25000,
                256,
                true
        );

        Smartphone phone2 = new Smartphone(
                "Xiaomi",
                15000,
                128
        );

        Smartphone phone3 = new Smartphone("Apple");

        System.out.println(phone1);
        System.out.println(phone2);
        System.out.println(phone3);
    }
}
