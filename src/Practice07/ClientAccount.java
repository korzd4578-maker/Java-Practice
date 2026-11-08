package Practice07;

public class ClientAccount {
    private String iban;
    private String owner;
    private double balance;

    public ClientAccount(String iban, String owner, double balance) {

        this.iban = iban;
        this.owner = owner;
        this.balance = Math.max(0, balance);
    }

    public boolean transferTo(ClientAccount recipient, double amount) {

        if (recipient == null || recipient == this) {
            return false;
        }

        if (amount <= 0 || balance < amount) {
            return false;
        }

        this.balance -= amount;

        recipient.balance += amount;

        System.out.println("Успішний переказ!");
        System.out.println("Відправник: " + this.owner);
        System.out.println("Отримувач: " + recipient.owner);
        System.out.println("Сума: " + amount + " грн");

        return true;
    }

    public void printAccount() {

        System.out.println("IBAN: " + iban);
        System.out.println("Власник: " + owner);
        System.out.println("Баланс: " + balance + " грн");
        System.out.println("-------------------");
    }
}
