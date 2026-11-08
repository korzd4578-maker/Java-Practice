package Practice08;

public class PaymentCard {
    private String cardHolder;
    protected double balance;

    public PaymentCard(String cardHolder, double balance) {

        this.cardHolder = cardHolder;
        this.balance = Math.max(0, balance);
    }

    public boolean pay(double amount) {

        if (amount > 0 && balance >= amount) {

            balance -= amount;

            return true;
        }

        return false;
    }

    public String getCardHolder() {
        return cardHolder;
    }

    @Override
    public String toString() {

        return "PaymentCard{holder='" + cardHolder +
                "', balance=" + balance + " грн}";
    }
}
