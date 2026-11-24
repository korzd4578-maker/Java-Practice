package Homework;

interface Scalable2D {
    double MIN_SCALE_FACTOR = 0.1;
    void scale(double factor);
}

interface Rotatable2D {
    void rotate(double deltaDegrees);
    double getRotationAngle();
}

abstract class AbstractShape2D {
    private final String name;
    private double centerX;
    private double centerY;

    public AbstractShape2D(String name, double centerX, double centerY) {
        this.name = name;
        this.centerX = centerX;
        this.centerY = centerY;
    }

    public String getName() { return name; }
    public double getCenterX() { return centerX; }
    public double getCenterY() { return centerY; }

    public abstract double getArea();
    public abstract double getPerimeter();

    public final double getIsoperimetricQuotient() {
        double p = getPerimeter();
        return (4 * Math.PI * getArea()) / (p * p);
    }
}

class CircleShape extends AbstractShape2D implements Scalable2D {
    private double radius;

    public CircleShape(String name, double x, double y, double radius) {
        super(name, x, y);
        this.radius = (radius > 0) ? radius : 1.0;
    }

    @Override
    public double getArea() { return Math.PI * radius * radius; }

    @Override
    public double getPerimeter() { return 2 * Math.PI * radius; }

    @Override
    public void scale(double factor) {
        double f = Math.max(MIN_SCALE_FACTOR, factor);
        this.radius *= f;
        System.out.printf("   [Scalable2D] '%s' масштабовано в %.1f разів (новий r=%.2f)\n", getName(), f, radius);
    }

    @Override
    public String toString() {
        return String.format("CircleShape['%s', center=(%.1f; %.1f), r=%.2f | S=%.2f, P=%.2f, Q=%.4f]",
                getName(), getCenterX(), getCenterY(), radius, getArea(), getPerimeter(), getIsoperimetricQuotient());
    }
}

class RectangleShape extends AbstractShape2D implements Scalable2D, Rotatable2D {
    private double width;
    private double height;
    private double rotationAngle = 0.0;

    public RectangleShape(String name, double x, double y, double width, double height) {
        super(name, x, y);
        this.width = (width > 0) ? width : 1.0;
        this.height = (height > 0) ? height : 1.0;
    }

    @Override
    public double getArea() { return width * height; }

    @Override
    public double getPerimeter() { return 2 * (width + height); }

    @Override
    public void scale(double factor) {
        double f = Math.max(MIN_SCALE_FACTOR, factor);
        this.width *= f;
        this.height *= f;
        System.out.printf("   [Scalable2D] '%s' масштабовано в %.1f разів (%.2fx%.2f)\n", getName(), f, width, height);
    }

    @Override
    public void rotate(double deltaDegrees) {
        this.rotationAngle = (this.rotationAngle + deltaDegrees) % 360.0;
        System.out.printf("   [Rotatable2D] '%s' повернуто на +%.1f° (поточний кут: %.1f°)\n",
                getName(), deltaDegrees, rotationAngle);
    }

    @Override
    public double getRotationAngle() { return rotationAngle; }

    @Override
    public String toString() {
        return String.format("RectangleShape['%s', center=(%.1f; %.1f), %.2fx%.2f, angle=%.1f° | S=%.2f, P=%.2f, Q=%.4f]",
                getName(), getCenterX(), getCenterY(), width, height, rotationAngle, getArea(), getPerimeter(), getIsoperimetricQuotient());
    }
}

final class ImmutableReferenceSquare extends AbstractShape2D {
    private final double side;

    public ImmutableReferenceSquare(String name, double x, double y, double side) {
        super(name, x, y);
        this.side = (side > 0) ? side : 1.0;
    }

    @Override
    public double getArea() { return side * side; }

    @Override
    public double getPerimeter() { return 4 * side; }

    @Override
    public String toString() {
        return String.format("ImmutableReferenceSquare['%s', center=(%.1f; %.1f), side=%.2f | S=%.2f, P=%.2f, Q=%.4f]",
                getName(), getCenterX(), getCenterY(), side, getArea(), getPerimeter(), getIsoperimetricQuotient());
    }
}

public class Task1PolymorphicShapesAndTransforms {
    public static double calculateTotalArea(AbstractShape2D[] shapes) {
        double sum = 0;
        for (AbstractShape2D s : shapes) sum += s.getArea();
        return sum;
    }

    public static void transformScene(AbstractShape2D[] shapes, double scaleFactor, double rotateDeg) {
        for (AbstractShape2D shape : shapes) {
            boolean transformed = false;
            if (shape instanceof Scalable2D s) {
                s.scale(scaleFactor);
                transformed = true;
            }
            if (shape instanceof Rotatable2D r) {
                r.rotate(rotateDeg);
                transformed = true;
            }
            if (!transformed) {
                System.out.printf("   [Info] '%s' (final class) пропущено — не підтримує трансформації.\n", shape.getName());
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("================ ПОЛІМОРФНА ГЕОМЕТРІЯ ТА ІНТЕРФЕЙСИ ТРАНСФОРМАЦІЙ ================");
        AbstractShape2D[] shapes = {
                new CircleShape("Коло-Лінза", 0.0, 0.0, 5.0),
                new RectangleShape("Рамка-А", 2.0, 3.0, 4.0, 6.0),
                new ImmutableReferenceSquare("Еталон-Квадрат", 10.0, 10.0, 5.0)
        };

        System.out.println("[СТАН СЦЕНИ ДО ТРАНСФОРМАЦІЇ]:");
        for (int i = 0; i < shapes.length; i++) System.out.println("  " + (i + 1) + ". " + shapes[i]);
        System.out.printf("Сумарна площа сцени: %.2f кв.од.\n\n", calculateTotalArea(shapes));

        System.out.println("-> Виконуємо пакетну трансформацію (scale x2.0, rotate +45.0°) через instanceof...");
        transformScene(shapes, 2.0, 45.0);

        System.out.println("\n[СТАН СЦЕНИ ПІСЛЯ ТРАНСФОРМАЦІЇ]:");
        for (int i = 0; i < shapes.length; i++) System.out.println("  " + (i + 1) + ". " + shapes[i]);
        System.out.printf("Нова сумарна площа сцени: %.2f кв.од.\n", calculateTotalArea(shapes));
        System.out.println("==================================================================================");
    }
}
