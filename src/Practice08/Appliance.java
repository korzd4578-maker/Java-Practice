package Practice08;

public class Appliance {
    private String model;
    private double powerWatts;

    public Appliance(String model, double powerWatts) {

        this.model = model;
        this.powerWatts = Math.max(0, powerWatts);
    }

    public double getDailyConsumptionKWh(int hours) {

        return (powerWatts * Math.max(0, hours)) / 1000.0;
    }

    public String getModel() {
        return model;
    }

    @Override
    public String toString() {

        return "Appliance{model='" + model +
                "', power=" + powerWatts + " W}";
    }
}
