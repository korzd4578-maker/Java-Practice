package Practice08;

public class StaffMember {
    protected String name;
    protected double baseSalary;

    public StaffMember(String name, double baseSalary) {

        this.name = name;
        this.baseSalary = Math.max(0, baseSalary);
    }

    public double calculateMonthlyPay() {
        return baseSalary;
    }

    @Override
    public String toString() {

        return String.format(
                "StaffMember{name='%s', baseSalary=%.2f, totalPay=%.2f}",
                name, baseSalary, calculateMonthlyPay()
        );
    }
}
