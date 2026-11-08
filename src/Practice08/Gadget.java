package Practice08;

public class Gadget {
    private String brand;
    private double price;

    public Gadget(String brand, double price) {

        this.brand = brand;
        this.price = Math.max(0, price);
    }

    public String getBrand() {
        return brand;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {

        return String.format(
                "Gadget{brand='%s', price=%.2f грн}",
                brand, price
        );
    }
}
