package Practice08;

public class FragileParcel extends Parcel {

    private boolean requiresWoodenBox;
    private double insuranceValue;

    public FragileParcel(String trackingCode, double weightKg,
                         boolean requiresWoodenBox,
                         double insuranceValue) {

        super(trackingCode, weightKg);

        this.requiresWoodenBox = requiresWoodenBox;
        this.insuranceValue = Math.max(0, insuranceValue);
    }

    @Override
    public double calculateShippingCost() {

        double cost = super.calculateShippingCost();

        cost += insuranceValue * 0.015;

        if (requiresWoodenBox) {
            cost += 120.0;
        }

        return cost;
    }

    @Override
    public String toString() {

        return String.format(
                "FragileParcel{%s, woodenBox=%s, insurance=%.2f грн, total=%.2f грн}",
                super.toString(), requiresWoodenBox,
                insuranceValue, calculateShippingCost()
        );
    }
}