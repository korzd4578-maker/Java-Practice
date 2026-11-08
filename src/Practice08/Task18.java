package Practice08;

public class Task18 {
    public static void main(String[] args) {
        StandardTransfer standard = new StandardTransfer(10000);

        InternationalTransfer international =
                new InternationalTransfer(10000, "PL");

        System.out.println("Звичайний переказ:");
        System.out.println(standard);

        System.out.println("-------------------");

        System.out.println("Міжнародний переказ:");
        System.out.println(international);
    }
}
