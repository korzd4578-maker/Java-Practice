package Practice08;

public class Point3D extends Point2D {
    private double z;

    public Point3D(double x, double y, double z) {

        super(x, y);

        this.z = z;
    }

    @Override
    public double distanceToOrigin() {

        return Math.sqrt(
                Math.pow(super.distanceToOrigin(), 2) + z * z
        );
    }

    @Override
    public String toString() {

        return "(" + getX() + "; " + getY() + "; " + z + ")";
    }
}
