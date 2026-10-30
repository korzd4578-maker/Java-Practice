package Practice06;

public class DiscountCard {
    private String ownerName;
    private double totalSpent;
    private int discountPercent;

    public DiscountCard(String ownerName) {
        this.ownerName = ownerName;
        this.totalSpent = 0;
        this.discountPercent = 1;
    }
    public void addPurchase(double cost) {
        if (cost > 0) {
            totalSpent += cost;

            if (totalSpent >= 10000) {
                discountPercent = 10;
            } else if (totalSpent >= 5000) {
                discountPercent = 5;
            } else {
                discountPercent = 1;
            }
        }
    }
    public void printCardInfo() {
        System.out.println("Власник картки: " + ownerName);
        System.out.println("Витрачено: " + totalSpent + " грн");
        System.out.println("Поточна знижка: " + discountPercent + "%");
    }
}
