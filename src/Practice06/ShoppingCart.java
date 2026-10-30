package Practice06;

public class ShoppingCart {
    private double[] itemPrices = new double[10];
    private int count;

    public void addItem(double price) {
        if (price > 0 && count < itemPrices.length) {
            itemPrices[count] = price;
            count++;
        } else {
            System.out.println("Неможливо додати товар!");
        }
    }

    public double getTotalCost() {
        double total = 0;

        for (int i = 0; i < count; i++) {
            total += itemPrices[i];
        }

        return total;
    }

    public void applyDiscount(double percent) {
        if (percent >= 0 && percent <= 100) {
            for (int i = 0; i < count; i++) {
                itemPrices[i] -= itemPrices[i] * percent / 100;
            }
        }
    }
}
