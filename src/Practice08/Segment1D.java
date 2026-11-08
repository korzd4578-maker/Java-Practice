package Practice08;

public class Segment1D {
    protected double length;

    public Segment1D(double length) {

        this.length = Math.max(0, length);
    }

    @Override
    public String toString() {

        return "Segment1D{length=" + length + "}";
    }
}
