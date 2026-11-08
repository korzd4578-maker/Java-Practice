package Practice08;

public class Task5 {
    public static void main(String[] args) {
        SensorNode sensor = new SensorNode(
                "TEMP-001",
                2.5,
                24.5
        );

        System.out.println("Ідентифікатор датчика: "
                + sensor.getSensorId());

        System.out.println(sensor);

        System.out.println("-------------------");
    }
}
