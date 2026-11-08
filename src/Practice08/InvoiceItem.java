package Practice08;

public class InvoiceItem {
    private String description;
    private int quantity;
    private double unitPrice;
    private double discountPercent;

    public InvoiceItem(String description, int quantity,
                       double unitPrice, double discountPercent) {

        this.description = description;

        this.quantity = Math.max(0, quantity);

        this.unitPrice = Math.max(0, unitPrice);

        if (discountPercent >= 0 && discountPercent <= 50) {
            this.discountPercent = discountPercent;
        } else {
            this.discountPercent = 0;
        }
    }

    public double getFinalAmount() {

        double total = quantity * unitPrice;

        return total - total * discountPercent / 100;
    }

    @Override
    public String toString() {

        return String.format(
                "%s | Кількість: %d | Ціна: %.2f грн | Знижка: %.1f%% | Разом: %.2f грн",
                description, quantity, unitPrice,
                discountPercent, getFinalAmount()
        );
    }
}
