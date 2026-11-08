package Practice08;

public class Task13 {
    public static void main(String[] args) {
        UniversityStudent student = new UniversityStudent(
                "Корж Дмитро Сергійович",
                2008,
                "ST001",
                "Комп'ютерні науки",
                2000
        );

        Professor professor = new Professor(
                "Іван Петренко",
                1980,
                "Доктор наук",
                45
        );

        System.out.println("Студент:");
        System.out.println(student);

        System.out.println("Вік: " + student.getAge(2026));

        System.out.println("-------------------");

        System.out.println("Професор:");
        System.out.println(professor);

        System.out.println("Вік: " + professor.getAge(2026));
    }
}
