package Practice08;

public class WeightedGradeSheet extends GradeSheet {
    private double[] weights;

    public WeightedGradeSheet(String studentName,
                              int[] grades,
                              double[] weights) {

        super(studentName, grades);

        this.weights = new double[this.grades.length];

        for (int i = 0; i < this.weights.length; i++) {

            if (weights != null &&
                    i < weights.length &&
                    weights[i] >= 0) {

                this.weights[i] = weights[i];

            } else {

                this.weights[i] = 0;
            }
        }
    }

    @Override
    public double calculateScore() {

        double weightedSum = 0;
        double totalWeight = 0;

        for (int i = 0; i < grades.length; i++) {

            weightedSum += grades[i] * weights[i];

            totalWeight += weights[i];
        }

        if (totalWeight == 0) {
            return 0;
        }

        return weightedSum / totalWeight;
    }

    @Override
    public String toString() {

        return "WeightedGradeSheet{student='" +
                getStudentName() +
                "', grades=" +
                java.util.Arrays.toString(grades) +
                ", weights=" +
                java.util.Arrays.toString(weights) +
                ", weightedScore=" + calculateScore() + "}";
    }
}
