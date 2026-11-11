package Practice08;

public class VipTicket extends Ticket {
    private boolean includesBackstage;
    private double loungeFee;

    public VipTicket(String eventName, double basePrice,
                     boolean includesBackstage, double loungeFee) {

        super(eventName, basePrice);

        this.includesBackstage = includesBackstage;
        this.loungeFee = Math.max(0, loungeFee);
    }

    @Override
    public double getFinalPrice() {

        return super.getFinalPrice() + loungeFee;
    }

    @Override
    public String toString() {

        return "VipTicket{" + super.toString() +
                ", backstage=" + includesBackstage +
                ", loungeFee=" + loungeFee +
                ", finalPrice=" + getFinalPrice() + " грн}";
    }
}
