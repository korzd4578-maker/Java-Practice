package Practice08;

public class Parcel {
    private String trackingCode;
    private double weightKg;

    public Parcel(String trackingCode, double weightKg) {

        this.trackingCode = trackingCode;
        this.weightKg = Math.max(0, weightKg);
    }

    public double calculateShippingCost() {

        return 50.0 + weightKg * 12.0;
    }

    public String getTrackingCode() {
        return trackingCode;
    }

    @Override
    public String toString() {

        return String.format(
                "Parcel{code='%s', weight=%.2f kg, shipping=%.2f грн}",
                trackingCode, weightKg, calculateShippingCost()
        );
    }
}
