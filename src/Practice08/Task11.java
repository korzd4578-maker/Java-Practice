package Practice08;

public class Task11 {
    public static void main(String[] args) {
        PassengerCar car = new PassengerCar(
                "Toyota",
                220,
                60,
                5
        );

        CargoTruck truck = new CargoTruck(
                "Volvo",
                140,
                300,
                20
        );

        System.out.println("Легковий автомобіль:");
        System.out.println(car);

        System.out.println("-------------------");

        System.out.println("Вантажівка:");
        System.out.println(truck);

        System.out.println("Витрата пального при повному завантаженні: "
                + truck.calculateFuelConsumption() + " л/100 км");
    }
}
