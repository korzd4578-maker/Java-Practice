package Practice07;

public class LineSegment {
    private Point start;
    private Point end;

    public LineSegment(Point start, Point end) {
        this.start = start;
        this.end = end;
    }

    public LineSegment(double x1, double y1, double x2, double y2) {
        this(new Point(x1, y1), new Point(x2, y2));
    }

    public double getLength() {

        double dx = end.getX() - start.getX();
        double dy = end.getY() - start.getY();

        return Math.sqrt(dx * dx + dy * dy);
    }

    public Point getMidPoint() {

        double middleX = (start.getX() + end.getX()) / 2;
        double middleY = (start.getY() + end.getY()) / 2;

        return new Point(middleX, middleY);
    }

    public void printSegment() {

        System.out.println("Початкова точка: (" +
                start.getX() + "; " + start.getY() + ")");

        System.out.println("Кінцева точка: (" +
                end.getX() + "; " + end.getY() + ")");

        System.out.println("Довжина відрізка: " + getLength());
    }
}
