package Practice07;

public class Task3 {
    public static void main(String[] args) {
        BankAccount account = new BankAccount("UA123456", "Дмитро", 5000);

        account.printAccount();

        System.out.println("-------------------");

        account.deposit(2000);

        account.withdraw(2000);

        System.out.println("-------------------");

        account.printAccount();
    }
}
