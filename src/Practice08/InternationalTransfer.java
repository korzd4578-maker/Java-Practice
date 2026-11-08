package Practice08;

public class InternationalTransfer extends StandardTransfer{
    private String countryCode;

    public InternationalTransfer(double amount, String countryCode) {

        super(amount);

        this.countryCode = countryCode;
    }

    @Override
    public double getFee() {

        return super.getFee() * 2 + 15.0;
    }

    @Override
    public String toString() {

        return String.format(
                "InternationalTransfer{country='%s', amount=%.2f, fee=%.2f, total=%.2f}",
                countryCode, amount, getFee(), getTotalWithFee()
        );
    }
}
