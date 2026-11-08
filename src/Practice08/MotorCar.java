package Practice08;

public class MotorCar extends BaseVehicle {
    protected int horsePower;
    protected int doorsCount;

    public MotorCar(String brand, int year,
                    int horsePower, int doorsCount) {

        super(brand, year);

        this.horsePower = Math.max(0, horsePower);
        this.doorsCount = Math.max(0, doorsCount);
    }

    @Override
    public String toString() {

        return "MotorCar{" + super.toString() +
                ", horsePower=" + horsePower +
                ", doors=" + doorsCount + "}";
    }
}
