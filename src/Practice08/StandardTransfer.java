package Practice08;

public class StandardTransfer {
    protected double amount;

    public StandardTransfer(double amount) {

        this.amount = Math.max(0, amount);
    }

    public double getFee() {
        return amount * 0.01;
    }

    public double getTotalWithFee() {
        return amount + getFee();
    }

    @Override
    public String toString() {

        return String.format(
                "StandardTransfer{amount=%.2f, fee=%.2f, total=%.2f}",
                amount, getFee(), getTotalWithFee()
        );
    }
}
