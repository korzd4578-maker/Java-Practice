package Practice08;

public class Rectangle {
    private double width;
    private double height;

    public Rectangle(double width, double height) {

        this.width = Math.max(0, width);
        this.height = Math.max(0, height);
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public double getArea() {
        return width * height;
    }

    @Override
    public String toString() {

        return String.format(
                "Rectangle{width=%.2f, height=%.2f, area=%.2f}",
                width, height, getArea()
        );
    }
}
