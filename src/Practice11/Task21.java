package Practice11;
import java.util.ArrayList;
import java.util.Arrays;
public class Task21 {
    public static void manageTaskList() {

        ArrayList<String> tasks = new ArrayList<>();

        System.out.println(
                "Чи порожній список: " + tasks.isEmpty()
        );

        tasks.add("Підготувати звіт");
        tasks.add("Перевірити пошту");
        tasks.add("Оновити документацію");
        tasks.add("Написати тести");
        tasks.add("Надіслати результат");

        tasks.add(0, "Терміново: виправити помилку");

        System.out.println("Список задач: " + tasks);

        System.out.println(
                "Задача за індексом 2: " + tasks.get(2)
        );

        String oldText = tasks.set(
                2,
                "Перевірити пошту та відповісти"
        );

        System.out.println(
                "Замінено задачу: " + oldText
        );

        System.out.println(
                "Чи є задача з тестами: "
                        + tasks.contains("Написати тести")
        );

        tasks.remove("Оновити документацію");

        tasks.remove(0);

        System.out.println(
                "Після видалення: " + tasks
        );

        System.out.println(
                "Кількість задач: " + tasks.size()
        );

        Object[] export = tasks.toArray();

        System.out.println(
                "Експорт у масив: " + Arrays.toString(export)
        );

        tasks.clear();

        System.out.println(
                "Після очищення: " + tasks
                        + "; порожній список: " + tasks.isEmpty()
        );
    }

    public static void main(String[] args) {
        manageTaskList();
    }
}
