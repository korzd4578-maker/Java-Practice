package Practice07;

public class Task35 {
    public static void main(String[] args) {
        Engine engine = new Engine("ENG-001", 250);

        CarWithEngine car = new CarWithEngine(
                "BMW",
                "M5",
                engine
        );

        System.out.println("Інформація про автомобіль:");

        car.printSpecs();

        System.out.println("-------------------");

        car.startCar();

        System.out.println("-------------------");

        car.printSpecs();

        System.out.println("-------------------");

        car.turnOff();
    }
}
