package Practice08;

public class BaseVehicle {
    protected String brand;
    protected int year;

    public BaseVehicle(String brand, int year) {

        this.brand = brand;
        this.year = year;
    }

    @Override
    public String toString() {

        return "BaseVehicle{brand='" + brand +
                "', year=" + year + "}";
    }
}
