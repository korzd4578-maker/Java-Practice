package Practice08;

public class GradeSheet {
    private String studentName;
    protected int[] grades;

    public GradeSheet(String studentName, int[] grades) {

        this.studentName = studentName;

        if (grades == null) {

            this.grades = new int[0];

        } else {

            this.grades = new int[grades.length];

            for (int i = 0; i < grades.length; i++) {
                this.grades[i] = grades[i];
            }
        }
    }

    public String getStudentName() {
        return studentName;
    }

    public double calculateScore() {

        if (grades.length == 0) {
            return 0;
        }

        double sum = 0;

        for (int grade : grades) {
            sum += grade;
        }

        return sum / grades.length;
    }

    @Override
    public String toString() {

        return "GradeSheet{student='" + studentName +
                "', grades=" +
                java.util.Arrays.toString(grades) +
                ", score=" + calculateScore() + "}";
    }
}
