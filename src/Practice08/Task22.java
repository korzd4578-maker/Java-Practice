package Practice08;

public class Task22 {
    public static void main(String[] args) {
        Appliance appliance = new Appliance(
                "Звичайний обігрівач",
                2000
        );

        EcoHeater heater = new EcoHeater(
                "Eco Heater",
                2000,
                true
        );

        System.out.println(appliance);

        System.out.println("Споживання за 8 годин: "
                + appliance.getDailyConsumptionKWh(8) + " кВт·год");

        System.out.println("-------------------");

        System.out.println(heater);

        System.out.println("Споживання за 8 годин: "
                + heater.getDailyConsumptionKWh(8) + " кВт·год");
    }
}
