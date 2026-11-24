package Practice11;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;
import java.util.Vector;
public class Task29 {
    public static void main(String[] args) {

        ArrayList<String> arrayList = new ArrayList<>();

        arrayList.add("Перший");
        arrayList.add("Другий");

        System.out.println(
                "ArrayList: елемент за індексом 1 — "
                        + arrayList.get(1)
        );

        LinkedList<String> linkedList = new LinkedList<>();

        linkedList.addFirst("На початку");
        linkedList.addLast("У кінці");

        System.out.println(
                "LinkedList після addFirst/addLast: "
                        + linkedList
        );

        Vector<String> vector = new Vector<>();

        vector.addElement("Запис 1");
        vector.addElement("Запис 2");

        System.out.println(
                "Vector, елемент 0: " + vector.elementAt(0)
        );

        Stack<String> books = new Stack<>();

        books.push("Java для початківців");

        books.push("Об'єктно-орієнтоване програмування");

        books.push("Алгоритми");

        System.out.println(
                "Верхня книга: " + books.peek()
        );

        System.out.println("Зняття книг зі стеку:");

        while (!books.empty()) {

            System.out.println(books.pop());
        }
    }
}
