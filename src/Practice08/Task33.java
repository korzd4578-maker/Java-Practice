package Practice08;

public class Task33 {
    public static void main(String[] args) {
        ArithmeticProgression arithmetic =
                new ArithmeticProgression(2, 3);

        GeometricProgression geometric =
                new GeometricProgression(2, 2);

        System.out.println("Арифметична прогресія:");
        System.out.println(arithmetic);

        System.out.println("-------------------");

        System.out.println("Геометрична прогресія:");
        System.out.println(geometric);
    }
}
