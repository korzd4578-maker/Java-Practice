package Practice08;

public class ElectricCar extends MotorCar {
    private double batteryCapacityKWh;
    private int rangeKm;

    public ElectricCar(String brand, int year,
                       int horsePower, int doorsCount,
                       double batteryCapacityKWh, int rangeKm) {

        super(brand, year, horsePower, doorsCount);

        this.batteryCapacityKWh = Math.max(0, batteryCapacityKWh);
        this.rangeKm = Math.max(0, rangeKm);
    }

    @Override
    public String toString() {

        return "ElectricCar{" + super.toString() +
                ", battery=" + batteryCapacityKWh +
                " kWh, range=" + rangeKm + " km}";
    }
}
