package Practice08;

public class DiscountedWarehouseItem extends WarehouseItem {
    private String markdownReason;
    private double discountPercent;

    public DiscountedWarehouseItem(String name, int quantity,
                                   double[] priceHistory,
                                   String markdownReason,
                                   double discountPercent) {

        super(name, quantity, priceHistory);

        this.markdownReason = markdownReason;

        if (discountPercent >= 0 && discountPercent <= 100) {
            this.discountPercent = discountPercent;
        } else {
            this.discountPercent = 0;
        }
    }

    public double getSalePrice() {

        return getAveragePurchasePrice()
                * (1 - discountPercent / 100);
    }

    public double getTotalSaleValue() {

        return getSalePrice() * getQuantity();
    }

    @Override
    public String toString() {

        return "DiscountedWarehouseItem{" +
                super.toString() +
                ", reason='" + markdownReason +
                "', discount=" + discountPercent +
                "%, salePrice=" + getSalePrice() +
                " грн, total=" + getTotalSaleValue() + " грн}";
    }
}
