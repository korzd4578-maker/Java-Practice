package Practice08;

public class Box3D extends Rectangle {
    private double depth;

    public Box3D(double width, double height, double depth) {

        super(width, height);

        this.depth = Math.max(0, depth);
    }

    public double getVolume() {
        return super.getArea() * depth;
    }

    @Override
    public String toString() {

        return String.format(
                "Box3D{%s, depth=%.2f, volume=%.2f}",
                super.toString(), depth, getVolume()
        );
    }
}
