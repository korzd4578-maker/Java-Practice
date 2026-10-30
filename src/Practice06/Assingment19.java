package Practice06;

public class Assingment19 {
    public static void main(String[] args) {

        TemperatureConverter converter = new TemperatureConverter();

        double fahrenheit = converter.celsiusToFahrenheit(25);
        double celsius = converter.fahrenheitToCelsius(fahrenheit);

        System.out.println("25 градусів Цельсія = " + fahrenheit + " °F");
        System.out.println(fahrenheit + " °F = " + celsius + " °C");

    }
}

