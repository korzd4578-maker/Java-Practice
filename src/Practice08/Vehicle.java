package Practice08;

public class Vehicle {
    protected String brand;
    protected int maxSpeed;
    protected double fuelTankCapacity;

    public Vehicle(String brand, int maxSpeed, double fuelTankCapacity) {

        this.brand = brand;
        this.maxSpeed = Math.max(0, maxSpeed);
        this.fuelTankCapacity = Math.max(0, fuelTankCapacity);
    }

    @Override
    public String toString() {

        return String.format(
                "Vehicle{brand='%s', maxSpeed=%d km/h, tank=%.1f L}",
                brand, maxSpeed, fuelTankCapacity
        );
    }
}
