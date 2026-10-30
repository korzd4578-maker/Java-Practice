package Practice06;

public class Assingment4 {
    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle();

        rectangle.width = 7.5;
        rectangle.height = 4.0;

        double area = rectangle.width * rectangle.height;
        double perimeter = 2 * (rectangle.width + rectangle.height);

        System.out.println("Площа: " + area);
        System.out.println("Периметр: " + perimeter);

    }
}
