package Practice06;

public class Assingment33 {
    public static void main(String[] args) {
        GradeBook book = new GradeBook();

        int[] grades = {85, 92, 78, 96, 65};

        book.setData("Дмитро", grades);

        System.out.println("Середній бал: " + book.getAverage());
        System.out.println("Найвища оцінка: " + book.getHighestGrade());
        System.out.println("Найнижча оцінка: " + book.getLowestGrade());
    }
}
