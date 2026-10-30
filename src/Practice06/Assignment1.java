package Practice06;

public class Assignment1 {

    public static void main(String[] args) {

        Student student = new Student();

        student.name = "Дмитро";
        student.age = 18;
        student.gpa = 4.75;

        System.out.println("Ім'я: " + student.name);
        System.out.println("Вік: " + student.age);
        System.out.println("Середній бал: " + student.gpa);
    }
}
