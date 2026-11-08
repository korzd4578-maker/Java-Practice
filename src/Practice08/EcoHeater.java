package Practice08;

public class EcoHeater extends Appliance{
    private boolean ecoModeActive;

    public EcoHeater(String model, double powerWatts,
                     boolean ecoModeActive) {

        super(model, powerWatts);

        this.ecoModeActive = ecoModeActive;
    }

    @Override
    public double getDailyConsumptionKWh(int hours) {

        double consumption = super.getDailyConsumptionKWh(hours);

        if (ecoModeActive) {
            consumption *= 0.75;
        }

        return consumption;
    }

    @Override
    public String toString() {

        return "EcoHeater{" + super.toString() +
                ", ecoMode=" + ecoModeActive + "}";
    }
}

