package Practice06;

public class Thermometer {
    private double temperature;

    public void setTemperature(double t) {
        if (t < -273.15) {
            System.out.println("Помилка: температура нижче абсолютного нуля!");
        } else {
            temperature = t;
        }
    }

    public double getTemperature() {
        return temperature;
    }
}
