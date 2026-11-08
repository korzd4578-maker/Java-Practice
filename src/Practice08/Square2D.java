package Practice08;

public class Square2D extends Segment1D {
    public Square2D(double length) {

        super(length);
    }

    public double getPerimeter() {
        return 4 * length;
    }

    public double getArea() {
        return length * length;
    }

    @Override
    public String toString() {

        return "Square2D{" + super.toString() +
                ", perimeter=" + getPerimeter() +
                ", area=" + getArea() + "}";
    }
}
