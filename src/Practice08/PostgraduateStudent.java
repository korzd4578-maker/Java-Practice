package Practice08;

public class PostgraduateStudent extends StudentUser {
    private String thesisTopic;
    private String supervisorName;

    public PostgraduateStudent(int id, String email,
                               String groupCode, double gpa,
                               String thesisTopic,
                               String supervisorName) {

        super(id, email, groupCode, gpa);

        this.thesisTopic = thesisTopic;
        this.supervisorName = supervisorName;
    }

    public boolean canDefendThesis() {

        return gpa >= 85.0
                && thesisTopic != null
                && !thesisTopic.trim().isEmpty();
    }

    @Override
    public String toString() {

        return "PostgraduateStudent{" + super.toString() +
                ", thesisTopic='" + thesisTopic +
                "', supervisor='" + supervisorName +
                "', canDefend=" + canDefendThesis() + "}";
    }
}
