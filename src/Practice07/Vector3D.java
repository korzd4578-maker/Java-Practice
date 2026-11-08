package Practice07;

public class Vector3D {
    private double x;
    private double y;
    private double z;

    public Vector3D(double x, double y, double z) {

        this.x = x;
        this.y = y;
        this.z = z;
    }

    public Vector3D() {
        this(0, 0, 0);
    }

    public Vector3D add(Vector3D other) {

        return new Vector3D(
                this.x + other.x,
                this.y + other.y,
                this.z + other.z
        );
    }

    public double dotProduct(Vector3D other) {

        return this.x * other.x
                + this.y * other.y
                + this.z * other.z;
    }

    public Vector3D crossProduct(Vector3D other) {

        double newX = this.y * other.z - this.z * other.y;

        double newY = this.z * other.x - this.x * other.z;

        double newZ = this.x * other.y - this.y * other.x;

        return new Vector3D(newX, newY, newZ);
    }

    public boolean isOrthogonalTo(Vector3D other) {

        return Math.abs(dotProduct(other)) < 0.000000001;
    }

    public boolean isEqualTo(Vector3D other) {

        return Math.abs(this.x - other.x) < 0.000000001
                && Math.abs(this.y - other.y) < 0.000000001
                && Math.abs(this.z - other.z) < 0.000000001;
    }

    public String toString() {

        return "(" + x + ", " + y + ", " + z + ")";
    }
}
