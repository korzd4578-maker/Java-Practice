package Practice08;

public class Task6 {
    public static void main(String[] args) {
        double[] temperatures = {
                18.5, 20.0, 21.5, 19.0,
                23.0, 25.5, 24.0, 22.5
        };

        WeatherDay weather = new WeatherDay(
                "07.11.2026",
                temperatures
        );

        System.out.println(weather);

        System.out.println("-------------------");

        System.out.println("Мінімальна температура: "
                + weather.getMinTemp());

        System.out.println("Максимальна температура: "
                + weather.getMaxTemp());

        System.out.println("Середня температура: "
                + weather.getAverageTemp());

        System.out.println("-------------------");

        temperatures[0] = -100;

        System.out.println("Після зміни зовнішнього масиву:");
        System.out.println(weather);
    }
}
