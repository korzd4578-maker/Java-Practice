package Practice12;
import java.util.*;
public class Task07 {
    public static void main(String[] args) {
        TreeSet<Double> temperatures = new TreeSet<>(
                Arrays.asList(
                        -4.5, 0.0, 12.3, 18.7, 22.1,
                        25.0, 31.4, 36.6, 40.2, 15.5
                )
        );

        System.out.println("Все температуры: " + temperatures);

        System.out.println("Минимум: " + temperatures.first());
        System.out.println("Максимум: " + temperatures.last());

        System.out.println("Ниже 20: "
                + temperatures.headSet(20.0));

        System.out.println("Комфортный диапазон: "
                + temperatures.subSet(15.0, 32.0));

        System.out.println("От 25 и выше: "
                + temperatures.tailSet(25.0));

        System.out.println("Ближайшая температура сверху: "
                + temperatures.ceiling(20.0));

        System.out.println("Ближайшая температура снизу: "
                + temperatures.floor(20.0));
    }
}
