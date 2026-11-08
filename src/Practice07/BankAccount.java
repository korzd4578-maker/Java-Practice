package Practice07;

public class BankAccount {
    private String accountNumber;
    private String ownerName;
    private double balance;

    public BankAccount(String accountNumber, String ownerName, double initialBalance) {
        this.accountNumber = accountNumber;
        this.ownerName = ownerName;

        if (initialBalance < 0) {
            this.balance = 0.0;
        } else {
            this.balance = initialBalance;
        }
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Рахунок поповнено на " + amount + " грн");
        }
    }

    public boolean withdraw(double amount) {
        if (amount > 0 && balance >= amount) {
            balance -= amount;
            System.out.println("Знято: " + amount + " грн");
            return true;
        }

        System.out.println("Помилка! Недостатньо коштів.");
        return false;
    }

    public void printAccount() {
        System.out.println("Номер рахунку: " + accountNumber);
        System.out.println("Власник: " + ownerName);
        System.out.println("Баланс: " + balance + " грн");
    }
}
