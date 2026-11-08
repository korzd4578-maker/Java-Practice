package Practice07;

public class Task8 {
    public static void main(String[] args) {
        Employee employee = new Employee(
                1,
                "Корж Дмитро Сергійович",
                "Програміст",
                30000
        );
        System.out.println("До підвищення:");
        employee.printBadge();

        System.out.println("-------------------");

        employee.raiseSalary(15);

        System.out.println("Після підвищення на 15%:");
        employee.printBadge();
    }
}
