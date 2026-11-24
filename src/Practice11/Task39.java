package Practice11;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
public class Task39 {
    public static void main(String[] args) {

        final int count = 20_000;

        List<Integer> arrayList = new ArrayList<>();

        List<Integer> linkedList = new LinkedList<>();

        long startArrayInsert = System.nanoTime();

        for (int i = 0; i < count; i++) {

            arrayList.add(0, i);
        }

        long arrayInsertTime =
                System.nanoTime() - startArrayInsert;

        long startLinkedInsert = System.nanoTime();

        for (int i = 0; i < count; i++) {

            linkedList.add(0, i);
        }

        long linkedInsertTime =
                System.nanoTime() - startLinkedInsert;

        long startArrayGet = System.nanoTime();

        long checksum = 0;

        for (int i = 0; i < count; i++) {

            checksum += arrayList.get(arrayList.size() / 2);
        }

        long arrayGetTime =
                System.nanoTime() - startArrayGet;

        long startLinkedGet = System.nanoTime();

        for (int i = 0; i < count; i++) {

            checksum += linkedList.get(linkedList.size() / 2);
        }

        long linkedGetTime =
                System.nanoTime() - startLinkedGet;

        System.out.printf(
                "Вставка на початок ArrayList: %.3f мс%n",
                arrayInsertTime / 1_000_000.0
        );

        System.out.printf(
                "Вставка на початок LinkedList: %.3f мс%n",
                linkedInsertTime / 1_000_000.0
        );

        System.out.printf(
                "Доступ get() ArrayList: %.3f мс%n",
                arrayGetTime / 1_000_000.0
        );

        System.out.printf(
                "Доступ get() LinkedList: %.3f мс%n",
                linkedGetTime / 1_000_000.0
        );

        System.out.println(
                "Контрольна сума, щоб результати читання використовувалися: "
                        + checksum
        );

        System.out.println(
                "Пояснення: ArrayList зсуває елементи "
                        + "при вставці на початок, а LinkedList "
                        + "проходить вузли послідовно під час get(index)."
        );
    }
}
