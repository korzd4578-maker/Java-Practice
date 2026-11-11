package Practice08;

public class WarehouseItem {
    private String name;
    private int quantity;
    private double[] priceHistory;

    public WarehouseItem(String name, int quantity,
                         double[] priceHistory) {

        this.name = name;
        this.quantity = Math.max(0, quantity);

        if (priceHistory == null) {

            this.priceHistory = new double[0];

        } else {

            this.priceHistory = new double[priceHistory.length];

            for (int i = 0; i < priceHistory.length; i++) {
                this.priceHistory[i] = priceHistory[i];
            }
        }
    }

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getAveragePurchasePrice() {

        if (priceHistory.length == 0) {
            return 0;
        }

        double sum = 0;

        for (double price : priceHistory) {
            sum += price;
        }

        return sum / priceHistory.length;
    }

    @Override
    public String toString() {

        return "WarehouseItem{name='" + name +
                "', quantity=" + quantity +
                ", averagePrice=" +
                getAveragePurchasePrice() + " грн}";
    }
}
