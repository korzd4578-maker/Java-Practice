package Practice08;

public class CashbackPlatinumCard extends DebitCard {
    private double cashbackPercent;
    private double accumulatedCashback;

    public CashbackPlatinumCard(String cardHolder, double balance,
                                double dailyLimit, double cashbackPercent) {

        super(cardHolder, balance, dailyLimit);

        this.cashbackPercent = Math.max(0, cashbackPercent);
        this.accumulatedCashback = 0;
    }

    @Override
    public boolean pay(double amount) {

        boolean successful = super.pay(amount);

        if (successful) {

            double cashback = amount * cashbackPercent / 100;

            accumulatedCashback += cashback;

            System.out.println("Кешбек нараховано: "
                    + cashback + " грн");
        }

        return successful;
    }

    @Override
    public String toString() {

        return "CashbackPlatinumCard{" + super.toString() +
                ", cashback=" + cashbackPercent +
                "%, accumulated=" + accumulatedCashback + " грн}";
    }
}
