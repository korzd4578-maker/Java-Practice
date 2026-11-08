package Practice08;

public class Task30 {
    public static void main(String[] args) {
        Segment1D segment = new Segment1D(5);

        Square2D square = new Square2D(5);

        Cube3D cube = new Cube3D(5);

        System.out.println("Відрізок:");
        System.out.println(segment);

        System.out.println("-------------------");

        System.out.println("Квадрат:");
        System.out.println(square);

        System.out.println("-------------------");

        System.out.println("Куб:");
        System.out.println(cube);
    }
}
