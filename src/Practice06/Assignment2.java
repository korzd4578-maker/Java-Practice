package Practice06;

public class Assignment2 {
    public static void main(String[] args) {

        Car car1 = new Car();
        Car car2 = new Car();

        car1.brand = "Toyota";
        car1.model = "Camry";
        car1.year = 2021;
        car1.speed = 180;

        car2.brand = "BMW";
        car2.model = "M5";
        car2.year = 2023;
        car2.speed = 250;

        System.out.println(car1.brand + " " + car1.model + ", " + car1.year + ", " + car1.speed + " км/год");
        System.out.println(car2.brand + " " + car2.model + ", " + car2.year + ", " + car2.speed + " км/год");

        if (car1.year > car2.year) {
            System.out.println("Новіший автомобіль: " + car1.brand);
        } else if (car2.year > car1.year) {
            System.out.println("Новіший автомобіль: " + car2.brand);
        } else {
            System.out.println("Автомобілі одного року випуску");
        }

    }
}
