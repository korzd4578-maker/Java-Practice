package Practice07;

public class Task19 {
    public static void main(String[] args) {
        AreaCalculator calculator = new AreaCalculator();

        System.out.println("Площа квадрата: "
                + calculator.calculateArea(5));

        System.out.println("Площа прямокутника: "
                + calculator.calculateArea(4, 6));

        System.out.println("Площа круга: "
                + calculator.calculateArea(3, true));

        System.out.println("Площа трикутника: "
                + calculator.calculateArea(3, 4, 5));

        System.out.println("Площа трапеції: "
                + calculator.calculateTrapezoidArea(4, 6, 5));
    }
}
