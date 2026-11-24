package Practice11;
import java.util.ArrayList;
import java.util.List;
public class Task16 {
    public static ArrayList<Integer> extractPassedScores(
            List<Integer> allScores,
            int minPassScore) {

        ArrayList<Integer> passed = new ArrayList<>();

        for (int i = 0; i < allScores.size(); i++) {

            if (allScores.get(i) >= minPassScore) {

                passed.add(allScores.get(i));
            }
        }

        return passed;
    }

    public static void main(String[] args) {

        ArrayList<Integer> scores = new ArrayList<>(
                List.of(45, 88, 92, 59, 74, 100, 38, 65)
        );

        ArrayList<Integer> passed =
                extractPassedScores(scores, 60);

        System.out.println("Початкові оцінки: " + scores);

        System.out.println(
                "Початкова кількість: " + scores.size()
        );

        System.out.println(
                "Не склали: " + (scores.size() - passed.size())
        );

        System.out.println(
                "Зараховані студенти: " + passed
        );
    }
}
