package Practice11;
import java.util.*;
public class Task01 {
    public static void demonstrateWrapperTwins() {

        Byte byteValue = Byte.valueOf((byte) 10);
        Short shortValue = Short.valueOf((short) 500);
        Integer intValue = Integer.valueOf(42);
        Long longValue = Long.valueOf(100L);
        Float floatValue = Float.valueOf(3.14f);
        Double doubleValue = Double.valueOf(2.718);
        Character charValue = Character.valueOf('Я');
        Boolean booleanValue = Boolean.valueOf(true);

        Object[] wrappers = {
                byteValue, shortValue, intValue, longValue,
                floatValue, doubleValue, charValue, booleanValue
        };

        System.out.println("Вісім класів-обгорток:");

        for (Object value : wrappers) {
            System.out.println(
                    value.getClass().getSimpleName() + ": " + value
            );
        }

        // ArrayList<int> numbers = new ArrayList<>();
        // Колекції Java працюють з посилальними типами.

        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(10);
        numbers.add(20);

        System.out.println("Список Integer: " + numbers);
    }

    public static void main(String[] args) {
        demonstrateWrapperTwins();
    }
}
