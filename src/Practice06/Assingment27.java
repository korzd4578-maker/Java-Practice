package Practice06;

public class Assingment27 {
    public static void main(String[] args) {

        BankAccount account = new BankAccount("UA123456789", 5000);

        System.out.println("Початковий баланс: " + account.getBalance());

        account.deposit(1000);

        if (account.withdraw(2000)) {
            System.out.println("Гроші успішно знято!");
        } else {
            System.out.println("Недостатньо коштів!");
        }

        if (account.withdraw(10000)) {
            System.out.println("Гроші успішно знято!");
        } else {
            System.out.println("Недостатньо коштів!");
        }

        System.out.println("Залишок: " + account.getBalance());

    }
}
