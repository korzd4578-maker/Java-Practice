package Practice06;

public class TemperatureTracker {
    private double[] dailyTemps = new double[7];

    public void setTemps(double[] temps) {
        if (temps != null && temps.length == 7) {
            dailyTemps = temps;
        } else {
            System.out.println("Помилка: потрібно передати температури за 7 днів!");
        }
    }

    public int countDaysAbove(double threshold) {
        int count = 0;

        for (double temp : dailyTemps) {
            if (temp > threshold) {
                count++;
            }
        }

        return count;
    }

    public void printWeeklyReport() {
        String[] days = {
                "Понеділок", "Вівторок", "Середа",
                "Четвер", "П'ятниця", "Субота", "Неділя"
        };

        int warmestDay = 0;

        for (int i = 0; i < dailyTemps.length; i++) {
            System.out.println(days[i] + ": " + dailyTemps[i] + " °C");

            if (dailyTemps[i] > dailyTemps[warmestDay]) {
                warmestDay = i;
            }
        }

        System.out.println("Найтепліший день: " + days[warmestDay]);
        System.out.println("Температура: " + dailyTemps[warmestDay] + " °C");
    }
}
