package Practice05;

public class task40 {
    public static void main(String[] args) {
        double[][][] weather = new double[3][7][2];
        String[] cities = {"Київ", "Львів", "Одеса"};

        for (int c = 0; c < 3; c++) {
            for (int d = 0; d < 7; d++) {
                weather[c][d][0] = 15.0 + Math.random() * 10; // День
                weather[c][d][1] = 5.0 + Math.random() * 8;   // Ніч
            }
        }

        double overallMinNight = Double.MAX_VALUE;

        System.out.println("Аналітика температур:");
        for (int c = 0; c < 3; c++) {
            double daySum = 0;
            for (int d = 0; d < 7; d++) {
                daySum += weather[c][d][0];
                if (weather[c][d][1] < overallMinNight) {
                    overallMinNight = weather[c][d][1];
                }
            }
            System.out.printf("Середня денна температура в місті %s: %.2f°C\n", cities[c], (daySum / 7));
        }
        System.out.printf("Найхолодніша ніч зафіксована на рівні: %.2f°C\n", overallMinNight);
    }
}
