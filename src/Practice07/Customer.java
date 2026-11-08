package Practice07;

public class Customer {
    private String name;
    private double walletBalance;

    public Customer(String name, double walletBalance) {

        this.name = name;
        this.walletBalance = Math.max(0, walletBalance);
    }

    public boolean pay(double amount) {

        if (amount > 0 && walletBalance >= amount) {

            walletBalance -= amount;

            return true;
        }

        return false;
    }

    public String getName() {
        return name;
    }

    public double getWalletBalance() {
        return walletBalance;
    }
}
