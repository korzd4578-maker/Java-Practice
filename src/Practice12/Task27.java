package Practice12;
import java.util.*;
public class Task27 {
    interface Scalable {
        void scale(double factor);
    }

    static abstract class AbstractShape {

        protected String name;

        public AbstractShape(String name) {
            this.name = name;
        }

        public abstract double area();

        @Override
        public String toString() {
            return name + " | Площадь: " + area();
        }
    }

    static class Circle extends AbstractShape implements Scalable {

        private double radius;

        public Circle(String name, double radius) {
            super(name);
            this.radius = radius;
        }

        @Override
        public double area() {
            return Math.PI * radius * radius;
        }

        @Override
        public void scale(double factor) {
            radius *= factor;
        }
    }

    static class Rectangle extends AbstractShape implements Scalable {

        private double width;
        private double height;

        public Rectangle(String name, double width, double height) {
            super(name);
            this.width = width;
            this.height = height;
        }

        @Override
        public double area() {
            return width * height;
        }

        @Override
        public void scale(double factor) {
            width *= factor;
            height *= factor;
        }
    }

    static final class FixedStampSquare extends AbstractShape {

        private final double side;

        public FixedStampSquare(String name, double side) {
            super(name);
            this.side = side;
        }

        @Override
        public double area() {
            return side * side;
        }
    }

    public static void main(String[] args) {

        List<AbstractShape> shapes = new ArrayList<>();

        shapes.add(new Circle("Circle 1", 2));
        shapes.add(new Circle("Circle 2", 3));
        shapes.add(new Rectangle("Rectangle 1", 4, 5));
        shapes.add(new Rectangle("Rectangle 2", 2, 3));
        shapes.add(new FixedStampSquare("Square 1", 4));
        shapes.add(new FixedStampSquare("Square 2", 2));

        Iterator<AbstractShape> it = shapes.iterator();

        while (it.hasNext()) {

            AbstractShape shape = it.next();

            if (shape.area() < 15.0) {
                it.remove();
            }
        }

        for (AbstractShape shape : shapes) {

            if (shape instanceof Scalable sc) {
                sc.scale(1.5);
            }
        }

        System.out.println("Фигуры после обработки:");

        for (AbstractShape shape : shapes) {
            System.out.println(shape);
        }
    }
}
