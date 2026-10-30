package Practice05;

public class task14 {
    public static void main(String[] args) {
        int[] salaries = {18000, 25000, 32000, 15000, 41000, 29000};
        int sum = 0;
        for (int sal : salaries) sum += sal;
        double average = (double) sum / salaries.length;
        System.out.println("Середня зарплата: " + average);
        System.out.print("Зарплати вищі за середню: ");
        for (int sal : salaries) {
            if (sal > average) System.out.print(sal + " ");
        }
        System.out.println();
    }
}
