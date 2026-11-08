package Practice07;

public class Task34 {
    public static void main(String[] args) {
        ClientAccount account1 = new ClientAccount(
                "UA123456789",
                "Іван",
                10000
        );

        ClientAccount account2 = new ClientAccount(
                "UA987654321",
                "Марія",
                2000
        );

        System.out.println("До переказу:");

        account1.printAccount();
        account2.printAccount();

        System.out.println("-------------------");

        account1.transferTo(account2, 3500);

        System.out.println("-------------------");

        System.out.println("Після переказу:");

        account1.printAccount();
        account2.printAccount();
    }
}
