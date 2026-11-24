package Practice11;
import java.util.ArrayList;
public class Task02 {
    public static void showCompilerUnderTheHood() {

        System.out.println(
                "Неявне автопакування та авторозпакування:"
        );

        int a = 42;

        Integer boxed = a;

        ArrayList<Integer> list = new ArrayList<>();

        list.add(100);

        int unboxed = list.get(0);

        System.out.println("Integer boxed = " + boxed);
        System.out.println("int unboxed = " + unboxed);

        System.out.println(
                "\nЯвні виклики, які відповідають роботі компілятора:"
        );

        Integer explicitlyBoxed = Integer.valueOf(a);

        ArrayList<Integer> explicitList = new ArrayList<>();

        explicitList.add(Integer.valueOf(100));

        int explicitlyUnboxed =
                explicitList.get(0).intValue();

        System.out.println(
                "Integer.valueOf(a) = " + explicitlyBoxed
        );

        System.out.println(
                "list.get(0).intValue() = " + explicitlyUnboxed
        );

        Double boxedDouble = Double.valueOf(3.14);
        double unboxedDouble = boxedDouble.doubleValue();

        Boolean boxedBoolean = Boolean.valueOf(true);
        boolean unboxedBoolean = boxedBoolean.booleanValue();

        System.out.println(
                "Double: " + boxedDouble + " -> " + unboxedDouble
        );

        System.out.println(
                "Boolean: " + boxedBoolean + " -> " + unboxedBoolean
        );
    }

    public static void main(String[] args) {
        showCompilerUnderTheHood();
    }
}
