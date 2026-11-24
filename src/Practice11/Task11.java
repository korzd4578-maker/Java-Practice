package Practice11;
import java.util.Arrays;
public class Task11 {
    public static Object[] growArrayManually(Object[] oldData) {

        int newCapacity =
                oldData.length + (oldData.length >> 1);

        Object[] newData = new Object[newCapacity];

        System.arraycopy(
                oldData, 0,
                newData, 0,
                oldData.length
        );

        if (newData.length > oldData.length) {

            newData[oldData.length] = 11;
        }

        return newData;
    }

    public static void main(String[] args) {

        Object[] oldData = new Object[10];

        for (int i = 0; i < oldData.length; i++) {
            oldData[i] = i + 1;
        }

        Object[] grown = growArrayManually(oldData);

        System.out.println(
                "Початковий масив: "
                        + Arrays.toString(oldData)
        );

        System.out.println(
                "Розширений масив: "
                        + Arrays.toString(grown)
        );

        Object[] source = {1, 2, 3, 4, 5, null};

        System.arraycopy(source, 2, source, 3, 3);

        source[2] = "Новий елемент";

        System.out.println(
                "Масив після вставки на індекс 2: "
                        + Arrays.toString(source)
        );
    }
}
