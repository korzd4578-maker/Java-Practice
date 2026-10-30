package Practice06;

public class Assingment29 {
    public static void main(String[] args) {

        CarSpeedometer speedometer = new CarSpeedometer();

        speedometer.accelerate(150);
        System.out.println("Швидкість: " + speedometer.getSpeed());

        speedometer.accelerate(150);
        System.out.println("Після розгону: " + speedometer.getSpeed());

        speedometer.brake(100);
        System.out.println("Після гальмування: " + speedometer.getSpeed());

        speedometer.brake(200);
        System.out.println("Фінальна швидкість: " + speedometer.getSpeed());

    }
}
