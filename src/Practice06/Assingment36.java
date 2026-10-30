package Practice06;

public class Assingment36 {
    public static void main(String[] args) {

        TemperatureTracker tracker = new TemperatureTracker();

        double[] temperatures = {18.5, 20.0, 22.5, 19.0, 25.0, 27.5, 23.0};

        tracker.setTemps(temperatures);

        System.out.println("Днів вище 20°C: " + tracker.countDaysAbove(20));

        tracker.printWeeklyReport();

    }
}
