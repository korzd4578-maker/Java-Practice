package Practice05;
public class task8 {
    public static void main(String[] args) {
        int[] grades = {95, 84, 70, 99, 65, 88, 92};
        int sum = 0;
        for (int grade : grades) {
            sum += grade;
        }
        double average = (double) sum / grades.length;
        System.out.println("Сума: " + sum + ", Середній бал: " + average);
    }
}
