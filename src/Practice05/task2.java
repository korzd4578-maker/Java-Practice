package Practice05;
import java.util.Arrays;
public class task2 {
    public static void main(String[] args) {
        String[] days = {"Понеділок", "Вівторок", "Середа", "Четвер", "П'ятниця", "Субота", "Неділя"};
        System.out.println("Кількість днів: " + days.length);
        System.out.println("Перший день: " + days[0]);
        System.out.println("Останній день: " + days[days.length - 1]);

        days[5] = "Вихідний (Сб)";
        days[6] = "Вихідний (Нд)";
        System.out.println("Оновлений список: " + Arrays.toString(days));
    }
}
