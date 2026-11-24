package Practice11;
import java.util.ArrayList;
public class Task26 {
    public static void demonstrateVarDiamondDanger() {

        var unsafeList = new ArrayList<>();

        // Компилятор визначає тип ArrayList<Object>.

        unsafeList.add(42);
        unsafeList.add("Java");
        unsafeList.add(true);

        System.out.println(
                "Список без конкретного типу: " + unsafeList
        );

        try {

            Integer wrong = (Integer) unsafeList.get(1);

            System.out.println(wrong);

        } catch (ClassCastException e) {

            System.out.println(
                    "Помилка приведення типу: у списку "
                            + "під індексом 1 зберігається рядок, "
                            + "а не Integer."
            );
        }

        var safeList = new ArrayList<Integer>();

        safeList.add(42);
        safeList.add(100);

        System.out.println(
                "Типобезпечний список Integer: " + safeList
        );
    }

    public static void main(String[] args) {
        demonstrateVarDiamondDanger();
    }
}
