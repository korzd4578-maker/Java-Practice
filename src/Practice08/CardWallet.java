package Practice08;

public class CardWallet {
    private String cardNumber;
    private String pinCode;
    private double balance;

    public CardWallet(String cardNumber, String pinCode, double balance) {

        if (cardNumber != null && cardNumber.matches("\\d{16}")) {
            this.cardNumber = cardNumber;
        } else {
            this.cardNumber = "0000000000000000";
        }

        this.pinCode = pinCode;
        this.balance = Math.max(0, balance);
    }

    public boolean changePin(String oldPin, String newPin) {

        if (pinCode.equals(oldPin) &&
                newPin != null && newPin.matches("\\d{4}")) {

            pinCode = newPin;

            return true;
        }

        return false;
    }

    @Override
    public String toString() {

        String maskedCard = "**** **** **** "
                + cardNumber.substring(12);

        return String.format(
                "CardWallet{card='%s', balance=%.2f UAH}",
                maskedCard, balance
        );
    }
}
