package Practice12;
import java.util.*;
public class Task13 {
    static class StudentRecord {

        private final String studentId;
        private String fullName;
        private double gpa;

        public StudentRecord(
                String studentId,
                String fullName,
                double gpa) {

            this.studentId = studentId;
            this.fullName = fullName;
            this.gpa = gpa;
        }

        @Override
        public boolean equals(Object obj) {

            if (this == obj) return true;

            if (!(obj instanceof StudentRecord other)) {
                return false;
            }

            return Objects.equals(studentId, other.studentId);
        }

        @Override
        public int hashCode() {
            return Objects.hash(studentId);
        }

        @Override
        public String toString() {
            return studentId + " | " + fullName + " | GPA: " + gpa;
        }
    }

    public static void main(String[] args) {

        Set<StudentRecord> students = new HashSet<>();

        students.add(new StudentRecord("ST001", "Ivan Petrov", 90.5));
        students.add(new StudentRecord("ST002", "Alex Smith", 85.0));
        students.add(new StudentRecord("ST003", "Maria Ivanova", 95.0));
        students.add(new StudentRecord("ST004", "John Brown", 88.0));

        boolean added = students.add(
                new StudentRecord("ST001", "Ivan Petrov", 99.0)
        );

        System.out.println("Дубликат добавлен: " + added);

        System.out.println("\nРеестр студентов:");

        for (StudentRecord student : students) {
            System.out.println(student);
        }

        System.out.println("\nКоличество студентов: "
                + students.size());
    }
}
