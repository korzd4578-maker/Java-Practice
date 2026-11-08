package Practice08;

public class Task12 {
    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle(5, 10);

        Box3D box = new Box3D(5, 10, 4);

        System.out.println("Прямокутник:");
        System.out.println(rectangle);

        System.out.println("-------------------");

        System.out.println("Паралелепіпед:");
        System.out.println(box);

        System.out.println("Об'єм: " + box.getVolume());
    }
}
