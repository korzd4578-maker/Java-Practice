package Practice08;

public class Medicine {
    private String name;
    private double price;
    private boolean isExpired;

    public Medicine(String name, double price, boolean isExpired) {

        this.name = name;
        this.price = Math.max(0, price);
        this.isExpired = isExpired;
    }

    public boolean isExpired() {
        return isExpired;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {

        return "Medicine{name='" + name +
                "', price=" + price +
                ", expired=" + isExpired + "}";
    }
}
