package Practice07;

public class Task7 {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(5, 10);
        Rectangle square = new Rectangle(5);

        System.out.println("Прямокутник:");
        System.out.println("Площа: " + rectangle.getArea());
        System.out.println("Периметр: " + rectangle.getPerimeter());
        System.out.println("Це квадрат: " + rectangle.isSquare());

        System.out.println("-------------------");

        System.out.println("Квадрат:");
        System.out.println("Площа: " + square.getArea());
        System.out.println("Периметр: " + square.getPerimeter());
        System.out.println("Це квадрат: " + square.isSquare());

        System.out.println("-------------------");

        System.out.println("Порівняння площ:");
        System.out.println(rectangle.getArea() > square.getArea()
                ? "Площа прямокутника більша"
                : "Площа квадрата більша або рівна");
    }
}
