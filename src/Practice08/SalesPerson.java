package Practice08;

public class SalesPerson extends StaffMember{
    private double salesVolume;
    private double commissionRate;

    public SalesPerson(String name, double baseSalary,
                       double salesVolume, double commissionRate) {

        super(name, baseSalary);

        this.salesVolume = Math.max(0, salesVolume);
        this.commissionRate = Math.max(0, commissionRate);
    }

    @Override
    public double calculateMonthlyPay() {

        return super.calculateMonthlyPay()
                + salesVolume * (commissionRate / 100.0);
    }

    @Override
    public String toString() {

        return "SalesPerson{" + super.toString() +
                ", salesVolume=" + salesVolume +
                ", commission=" + commissionRate + "%}";
    }
}
