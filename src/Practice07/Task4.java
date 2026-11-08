package Practice07;

public class Task4 {
    public static void main(String[] args) {
        Point2D point1 = new Point2D();
        Point2D point2 = new Point2D(3, 4);
        Point2D point3 = new Point2D(6, 8);

        point1.printPoint();
        point2.printPoint();
        point3.printPoint();

        System.out.println("-------------------");

        System.out.println("Відстань до початку координат: "
                + point2.distanceToOrigin());

        System.out.println("Відстань між точками: "
                + point2.distanceTo(6, 8));
    }
}
