package Practice07;

public class Task11 {
    public static void main(String[] args) {
        Car car = new Car("Toyota", "Camry", 2024);

        car.startEngine();

        car.drive(150);

        car.stopEngine();

        System.out.println("-------------------");

        car.printInfo();

        System.out.println("-------------------");

        Car defaultCar = new Car();
        defaultCar.printInfo();
    }
}
