package Practice08;

public class Task7 {
    public static void main(String[] args) {
        IntRange range1 = new IntRange(10, 50);

        IntRange range2 = new IntRange(100, 20);

        System.out.println("Перший діапазон:");
        System.out.println(range1);

        System.out.println("-------------------");

        System.out.println("Другий діапазон після перевірки:");
        System.out.println(range2);

        System.out.println("-------------------");

        System.out.println("Число 30 входить у діапазон: "
                + range1.contains(30));

        System.out.println("Число 70 входить у діапазон: "
                + range1.contains(70));
    }
}
