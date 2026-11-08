package Practice08;

public class Product {
    private String sku;
    private String title;
    private double price;
    private int stock;

    public Product(String sku, String title, double price, int stock) {

        this.sku = sku;
        this.title = title;

        this.price = Math.max(0, price);
        this.stock = Math.max(0, stock);
    }

    public double getTotalCost() {
        return price * stock;
    }

    public void setPrice(double price) {

        if (price >= 0) {
            this.price = price;
        }
    }

    public void setStock(int stock) {

        if (stock >= 0) {
            this.stock = stock;
        }
    }

    @Override
    public String toString() {

        return String.format(
                "[SKU: %s] %s | Ціна: %.2f грн | Залишок: %d шт. | Разом: %.2f грн",
                sku, title, price, stock, getTotalCost()
        );
    }
    
}
