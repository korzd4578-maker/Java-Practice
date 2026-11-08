package Practice07;

public class Employee {
    private int id;
    private String fullName;
    private String position;
    private double monthlySalary;

    public Employee(int id, String fullName, String position, double monthlySalary) {
        this.id = id;
        this.fullName = fullName;
        this.position = position;
        this.monthlySalary = monthlySalary < 0 ? 0 : monthlySalary;
    }

    public void raiseSalary(double percent) {
        if (percent > 0) {
            monthlySalary += monthlySalary * percent / 100;
        }
    }

    public double getAnnualSalary() {
        return monthlySalary * 12;
    }

    public void printBadge() {
        System.out.println("ID: " + id);
        System.out.println("ПІБ: " + fullName);
        System.out.println("Посада: " + position);
        System.out.println("Місячна зарплата: " + monthlySalary + " грн");
        System.out.println("Річна зарплата: " + getAnnualSalary() + " грн");
    }
}
