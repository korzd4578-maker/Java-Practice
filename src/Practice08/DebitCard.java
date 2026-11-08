package Practice08;

public class DebitCard extends PaymentCard {
    private double dailyLimit;

    public DebitCard(String cardHolder, double balance,
                     double dailyLimit) {

        super(cardHolder, balance);

        this.dailyLimit = Math.max(0, dailyLimit);
    }

    @Override
    public boolean pay(double amount) {

        if (amount > dailyLimit) {
            System.out.println("Перевищено денний ліміт!");
            return false;
        }

        return super.pay(amount);
    }

    @Override
    public String toString() {

        return "DebitCard{" + super.toString() +
                ", dailyLimit=" + dailyLimit + " грн}";
    }
}
