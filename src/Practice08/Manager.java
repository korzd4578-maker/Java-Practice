package Practice08;

public class Manager extends StaffMember {
    private double teamBonus;

    public Manager(String name, double baseSalary, double teamBonus) {

        super(name, baseSalary);

        this.teamBonus = Math.max(0, teamBonus);
    }

    @Override
    public double calculateMonthlyPay() {

        return super.calculateMonthlyPay() + teamBonus;
    }

    @Override
    public String toString() {

        return "Manager{" + super.toString() +
                ", teamBonus=" + teamBonus + "}";
    }
}
