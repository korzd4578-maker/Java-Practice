package Practice08;

public class Cube3D extends Square2D {
    public Cube3D(double length) {

        super(length);
    }

    @Override
    public double getArea() {

        return 6 * super.getArea();
    }

    public double getVolume() {

        return length * length * length;
    }

    @Override
    public String toString() {

        return "Cube3D{" + super.toString() +
                ", totalSurfaceArea=" + getArea() +
                ", volume=" + getVolume() + "}";
    }
}
