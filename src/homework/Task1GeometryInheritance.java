package Homework;
class Circle {
    private double radius;

    public Circle(double radius) {
        setRadius(radius);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if (radius <= 0) {
            System.out.println("Попередження: радіус має бути > 0. Встановлено 1.0");
            this.radius = 1.0;
        } else {
            this.radius = radius;
        }
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public double getCircumference() {
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString() {
        return String.format("Circle[r=%.2f, S=%.2f, C=%.2f]", radius, getArea(), getCircumference());
    }
}

class Cylinder extends Circle {
    private double height;

    public Cylinder(double radius, double height) {
        super(radius);
        this.height = (height <= 0) ? 1.0 : height;
    }

    public double getVolume() {
        return super.getArea() * height;
    }

    public double getTotalSurfaceArea() {
        return 2 * super.getArea() + super.getCircumference() * height;
    }

    @Override
    public String toString() {
        return String.format("Cylinder[base=%s, h=%.2f, V=%.2f, TotalArea=%.2f]",
                super.toString(), height, getVolume(), getTotalSurfaceArea());
    }
}

class Cone extends Circle {
    private double height;

    public Cone(double radius, double height) {
        super(radius);
        this.height = (height <= 0) ? 1.0 : height;
    }

    public double getSlantHeight() {
        return Math.sqrt(getRadius() * getRadius() + height * height);
    }

    public double getVolume() {
        return (1.0 / 3.0) * super.getArea() * height;
    }

    public double getTotalSurfaceArea() {
        return super.getArea() + Math.PI * getRadius() * getSlantHeight();
    }

    @Override
    public String toString() {
        return String.format("Cone[base=%s, h=%.2f, l=%.2f, V=%.2f, TotalArea=%.2f]",
                super.toString(), height, getSlantHeight(), getVolume(), getTotalSurfaceArea());
    }
}

public class Task1GeometryInheritance {
    public static void main(String[] args) {
        System.out.println("================ ГЕОМЕТРІЯ ТІЛ ОБЕРТАННЯ ================");
        Circle circle = new Circle(5.0);
        Cylinder cylinder = new Cylinder(5.0, 10.0);
        Cone cone = new Cone(3.0, 4.0);

        System.out.println("Базове коло:\n" + circle + "\n");
        System.out.println("Циліндр (успадковано від Circle):\n" + cylinder + "\n");
        System.out.println("Конус (успадковано від Circle):\n" + cone);
        System.out.println("=========================================================");
    }
}
