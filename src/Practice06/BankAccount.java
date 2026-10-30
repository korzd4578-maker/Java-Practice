package Practice06;

public class BankAccount {
        private String accountNumber;
        private double balance;

    public BankAccount(String accountNumber, double balance) {
            this.accountNumber = accountNumber;
            this.balance = balance;
        }

        public void deposit(double amount) {
            if (amount > 0) {
                balance += amount;
                System.out.println("Рахунок поповнено на " + amount + " грн");
            } else {
                System.out.println("Некоректна сума!");
            }
        }

        public boolean withdraw(double amount) {
            if (amount > 0 && amount <= balance) {
                balance -= amount;
                return true;
            }

            return false;
        }

        public double getBalance() {
            return balance;
        }
    }

