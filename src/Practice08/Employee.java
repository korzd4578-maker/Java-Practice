package Practice08;

public class Employee {
    private String name;
    protected double salary;

    public Employee(String name, double salary) {

        this.name = name;
        this.salary = Math.max(0, salary);
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {

        return String.format(
                "Employee{name='%s', salary=%.2f}",
                name,
                salary
        );
    }
}
