package Practice08;

public class Task9 {
    public static void main(String[] args) {
        Employee employee = new Employee(
                "Дмитро",
                25000
        );

        Developer developer = new Developer(
                "Максим",
                35000,
                "Java"
        );

        System.out.println("Працівник:");
        System.out.println(employee);

        System.out.println("-------------------");

        System.out.println("Розробник:");
        System.out.println(developer);
    }
}
