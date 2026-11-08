package Practice07;

public class Task29 {
    public static void main(String[] args) {
        FleetCar car1 = new FleetCar("VIN001", 12000);
        FleetCar car2 = new FleetCar("VIN002", 25000);
        FleetCar car3 = new FleetCar("VIN003", 8000);

        car1.addTrip(150);
        car2.addTrip(320);
        car3.addTrip(90);

        System.out.println("-------------------");

        FleetCar.printFleetSummary();
    }
}
