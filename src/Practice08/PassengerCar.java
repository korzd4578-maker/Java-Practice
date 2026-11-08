package Practice08;

public class PassengerCar extends Vehicle {
    private int passengerSeats;

    public PassengerCar(String brand, int maxSpeed,
                        double fuelTankCapacity, int passengerSeats) {

        super(brand, maxSpeed, fuelTankCapacity);

        this.passengerSeats = Math.max(1, passengerSeats);
    }

    @Override
    public String toString() {

        return "PassengerCar{" + super.toString() +
                ", seats=" + passengerSeats + "}";
    }
}
