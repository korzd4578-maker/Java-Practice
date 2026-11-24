package Practice11;
import java.util.ArrayList;
public class Task15 {

    public static void main(String[] args) {

        ArrayList<String> logs = new ArrayList<>(500);

        System.out.println(
                "Створено ArrayList з початковою ємністю 500."
        );

        System.out.println(
                "Коли кількість елементів відома заздалегідь, "
                        + "це зменшує потребу в розширеннях масиву."
        );

        logs.ensureCapacity(1000);

        System.out.println(
                "Викликано ensureCapacity(1000): "
                        + "список підготував місце щонайменше для 1000 елементів."
        );

        logs.add("Запис 1");
        logs.add("Запис 2");
        logs.add("Запис 3");

        System.out.println(
                "Кількість фактичних записів: " + logs.size()
        );

        logs.trimToSize();

        System.out.println(
                "Викликано trimToSize(): "
                        + "внутрішню ємність обрізано до поточного розміру."
        );

        System.out.println("Вміст списку: " + logs);
    }
}
