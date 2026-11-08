package Practice07;

public class CarWithEngine {
    private String brand;
    private String model;
    private Engine engine;

    public CarWithEngine(String brand, String model, Engine engine) {

        this.brand = brand;
        this.model = model;
        this.engine = engine;
    }

    public void startCar() {

        this.engine.start();

        System.out.println(brand + " готовий до руху!");
    }

    public void turnOff() {

        this.engine.stop();
    }

    public void printSpecs() {

        System.out.println("Марка: " + brand);
        System.out.println("Модель: " + model);

        System.out.println("Серійний номер двигуна: "
                + engine.getSerialNumber());

        System.out.println("Потужність: "
                + engine.getHorsePower() + " к.с.");

        System.out.println("Стан двигуна: "
                + (engine.isRunning() ? "Працює" : "Вимкнений"));
    }
}
