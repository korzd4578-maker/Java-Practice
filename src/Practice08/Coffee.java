package Practice08;

public class Coffee {
    private String roastType;
    private int volumeMl;
    private double basePrice;

    public Coffee(String roastType, int volumeMl, double basePrice) {

        this.roastType = roastType;
        this.volumeMl = Math.max(0, volumeMl);
        this.basePrice = Math.max(0, basePrice);
    }

    public double calculatePrice() {
        return basePrice;
    }

    public double calculateCalories() {
        return volumeMl * 0.5;
    }

    public String getRoastType() {
        return roastType;
    }

    public int getVolumeMl() {
        return volumeMl;
    }

    @Override
    public String toString() {

        return "Coffee{roast='" + roastType +
                "', volume=" + volumeMl +
                " ml, price=" + calculatePrice() + " грн}";
    }
}
