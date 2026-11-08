package Practice07;

public class FleetCar {
    private String vinCode;
    private double currentMileage;

    private static int totalCars = 0;
    private static double totalCompanyMileage = 0.0;

    public FleetCar(String vinCode, double initialMileage) {

        this.vinCode = vinCode;
        this.currentMileage = Math.max(0, initialMileage);

        totalCars++;
        totalCompanyMileage += this.currentMileage;
    }

    public void addTrip(double km) {

        if (km > 0) {
            this.currentMileage += km;
            totalCompanyMileage += km;

            System.out.println(vinCode + ": додано " + km + " км.");
        }
    }

    public static void printFleetSummary() {

        System.out.println("======= СТАТИСТИКА АВТОПАРКУ =======");
        System.out.println("Кількість автомобілів: " + totalCars);
        System.out.println("Загальний пробіг: " + totalCompanyMileage + " км");
        System.out.println("====================================");
    }
}
