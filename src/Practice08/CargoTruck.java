package Practice08;

public class CargoTruck extends Vehicle {
    private double maxLoadTons;

    public CargoTruck(String brand, int maxSpeed,
                      double fuelTankCapacity, double maxLoadTons) {

        super(brand, maxSpeed, fuelTankCapacity);

        this.maxLoadTons = Math.max(0, maxLoadTons);
    }

    public double calculateFuelConsumption() {

        return 10 + maxLoadTons * 2;
    }

    @Override
    public String toString() {

        return "CargoTruck{" + super.toString() +
                ", maxLoad=" + maxLoadTons +
                " tons, fuelConsumption=" +
                calculateFuelConsumption() + " L/100km}";
    }
}
