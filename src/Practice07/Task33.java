package Practice07;

public class Task33 {
    public static void main(String[] args) {
        LineSegment segment = new LineSegment(1, 2, 5, 5);

        segment.printSegment();

        System.out.println("-------------------");

        Point middle = segment.getMidPoint();

        System.out.println("Середина відрізка:");
        System.out.println("X: " + middle.getX());
        System.out.println("Y: " + middle.getY());
    }
}
