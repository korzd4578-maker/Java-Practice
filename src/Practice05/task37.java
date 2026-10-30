package Practice05;
import java.util.Arrays;
public class task37 {
    public static void main(String[] args) {
        String[][] weekSchedule = new String[5][];
        weekSchedule[0] = new String[]{"Вища математика", "Основи програмування", "Физика"};
        weekSchedule[1] = new String[]{"Англійська мова", "Історія України"};
        weekSchedule[2] = new String[]{"Основи програмування", "Основи програмування", "Бази даних", "Фізвиховання"};
        weekSchedule[3] = new String[]{"Дискретна математика"};
        weekSchedule[4] = new String[]{"Філософія", "Основи алгоритмізації", "Практикум"};

        String[] dayNames = {"Понеділок", "Вівторок", "Середа", "Четвер", "П'ятниця"};
        System.out.println("Розклад на тиждень:");
        for (int i = 0; i < weekSchedule.length; i++) {
            System.out.println(dayNames[i] + " (" + weekSchedule[i].length + " пар(и)): " + Arrays.toString(weekSchedule[i]));
        }
    }
}
