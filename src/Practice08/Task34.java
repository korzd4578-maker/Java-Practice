package Practice08;

public class Task34 {
    public static void main(String[] args) {
        int[] grades = {90, 75, 100, 85};

        double[] weights = {0.2, 0.1, 0.4, 0.3};

        GradeSheet regular = new GradeSheet(
                "Дмитро",
                grades
        );

        WeightedGradeSheet weighted = new WeightedGradeSheet(
                "Дмитро",
                grades,
                weights
        );

        System.out.println("Звичайний рейтинг:");
        System.out.println(regular);

        System.out.println("-------------------");

        System.out.println("Зважений рейтинг:");
        System.out.println(weighted);

        System.out.println("-------------------");

        System.out.println("Звичайний бал: "
                + regular.calculateScore());

        System.out.println("Зважений бал: "
                + weighted.calculateScore());
    }
}
