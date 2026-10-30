package Practice06;

public class Assingment28 {
    public static void main(String[] args) {

        Thermometer thermometer = new Thermometer();

        thermometer.setTemperature(25.5);
        System.out.println("Температура: " + thermometer.getTemperature() + " °C");

        thermometer.setTemperature(-300);
        System.out.println("Температура після перевірки: "
                + thermometer.getTemperature() + " °C");

    }
}
