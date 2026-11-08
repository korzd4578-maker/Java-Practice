package Practice07;

public class Task2 {
    public static void main(String[] args) {
        Student student1 = new Student("Дмитро", 18, 4.8);
        Student student2 = new Student("Максим", 12, 6.5);

        System.out.println("Перший студент:");
        student1.printStudent();

        System.out.println("-------------------");

        System.out.println("Другий студент:");
        student2.printStudent();
    }
}
