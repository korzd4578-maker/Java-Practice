package Practice07;

public class Task15 {
    public static void main(String[] args) {
        Box originalBox = new Box(5, "Картон");

        Box copiedBox = new Box(originalBox);

        System.out.println("Оригінальна коробка:");
        originalBox.printBox();

        System.out.println("-------------------");

        System.out.println("Копія коробки:");
        copiedBox.printBox();

        System.out.println("-------------------");

        System.out.println("Об'єми однакові: "
                + (originalBox.getVolume() == copiedBox.getVolume()));
    }
}
