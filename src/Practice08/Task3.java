package Practice08;

public class Task3 {
    public static void main(String[] args) {
        Circle circle1 = new Circle(5.0);

        Circle circle2 = new Circle(-10.0);

        System.out.println("Перше коло:");
        System.out.println(circle1);

        System.out.println("-------------------");

        System.out.println("Друге коло:");
        System.out.println(circle2);

        System.out.println("-------------------");

        circle1.setRadius(-5);

        System.out.println("Після зміни радіуса:");
        System.out.println(circle1);
    }
}
