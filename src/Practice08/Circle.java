package Practice08;

public class Circle {
    private double radius;

    public Circle(double radius) {
        setRadius(radius);
    }

    public void setRadius(double radius) {

        if (radius > 0) {
            this.radius = radius;
        } else {
            System.out.println("Попередження: радіус має бути більшим за нуль!");
            this.radius = 1.0;
        }
    }

    public double getRadius() {
        return radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public double getCircumference() {
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString() {

        return String.format(
                "Circle[r=%.2f, S=%.2f, C=%.2f]",
                radius, getArea(), getCircumference()
        );
    }
}
