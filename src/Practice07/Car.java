package Practice07;

public class Car {
    private String brand;
    private String model;
    private int year;
    private double mileage;
    private boolean engineStarted;

    public Car(String brand, String model, int year, double mileage) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.mileage = Math.max(0, mileage);
        this.engineStarted = false;
    }

    public Car(String brand, String model, int year) {
        this(brand, model, year, 0.0);
    }

    public Car() {
        this("Unknown", "Standard", 2024);
    }

    public void startEngine() {
        engineStarted = true;
        System.out.println("Двигун запущено!");
    }

    public void stopEngine() {
        engineStarted = false;
        System.out.println("Двигун зупинено!");
    }

    public void drive(double distance) {

        if (engineStarted && distance > 0) {
            mileage += distance;
            System.out.println("Автомобіль проїхав " + distance + " км.");
        } else if (!engineStarted) {
            System.out.println("Спершу заведіть двигун!");
        } else {
            System.out.println("Некоректна відстань!");
        }
    }

    public void printInfo() {
        System.out.println("Марка: " + brand);
        System.out.println("Модель: " + model);
        System.out.println("Рік: " + year);
        System.out.println("Пробіг: " + mileage + " км");
    }
}
