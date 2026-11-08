package Practice08;

public class Task1 {
    public static void main(String[] args) {
        Student student = new Student("Дмитро", 1, 95.5);

        System.out.println(student);

        System.out.println("-------------------");

        student.setCourse(7);
        student.setGpa(120);

        System.out.println("Після перевірки даних:");
        System.out.println(student);
    }
}
