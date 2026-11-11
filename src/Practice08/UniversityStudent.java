package Practice08;

public class UniversityStudent extends Person {
    private String studentId;
    private String major;
    private int scholarship;

    public UniversityStudent(String fullName, int birthYear,
                             String studentId, String major,
                             int scholarship) {

        super(fullName, birthYear);

        this.studentId = studentId;
        this.major = major;
        this.scholarship = Math.max(0, scholarship);
    }

    @Override
    public String toString() {

        return "UniversityStudent{" + super.toString() +
                ", studentId='" + studentId +
                "', major='" + major +
                "', scholarship=" + scholarship + "}";
    }
}
