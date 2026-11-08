package Practice08;

public class StudentUser extends User {
    protected String groupCode;
    protected double gpa;

    public StudentUser(int id, String email,
                       String groupCode, double gpa) {

        super(id, email);

        this.groupCode = groupCode;

        if (gpa >= 0 && gpa <= 100) {
            this.gpa = gpa;
        } else {
            this.gpa = 60.0;
        }
    }

    @Override
    public String toString() {
        return "StudentUser{" + super.toString() +
                ", group='" + groupCode +
                "', GPA=" + gpa + "}";
    }
}
