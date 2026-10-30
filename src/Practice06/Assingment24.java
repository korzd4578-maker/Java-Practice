package Practice06;

public class Assingment24 {
    public static void main(String[] args) {

        Triangle triangle = new Triangle();

        triangle.a = 3;
        triangle.b = 4;
        triangle.c = 5;

        System.out.println("Трикутник існує: " + triangle.isValid());
        System.out.println("Периметр: " + triangle.getPerimeter());
        System.out.println("Площа: " + triangle.getArea());

    }
}
