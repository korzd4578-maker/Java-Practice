package Practice08;

public class Task23 {
    public static void main(String[] args) {
        Point2D point2D = new Point2D(3, 4);

        Point3D point3D = new Point3D(3, 4, 12);

        System.out.println("Точка 2D: " + point2D);
        System.out.println("Відстань: " + point2D.distanceToOrigin());

        System.out.println("-------------------");

        System.out.println("Точка 3D: " + point3D);
        System.out.println("Відстань: " + point3D.distanceToOrigin());
    }
}
