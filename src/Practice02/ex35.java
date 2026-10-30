package Practice02;

public class ex35 {
    public static void main(String[] args) {

        double dayTemp = 18.5;
        double nightTemp = -3.2;

        double difference = Math.abs(dayTemp - nightTemp);
        double maximum = Math.max(dayTemp, nightTemp);
        double minimum = Math.min(dayTemp, nightTemp);

        System.out.println("Перепад температури: " + difference);
        System.out.println("Максимальна температура: " + maximum);
        System.out.println("Мінімальна температура: " + minimum);

    }
}
