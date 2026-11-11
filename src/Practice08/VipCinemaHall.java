package Practice08;

public class VipCinemaHall extends CinemaHall {
    private double complimentaryBarCost;

    public VipCinemaHall(String hallName, int rows,
                         int cols, double baseTicketPrice,
                         double complimentaryBarCost) {

        super(hallName, rows, cols, baseTicketPrice);

        this.complimentaryBarCost =
                Math.max(0, complimentaryBarCost);
    }

    @Override
    public double calculateRevenue() {

        return super.calculateRevenue()
                + getLastRowOccupiedCount() * complimentaryBarCost;
    }

    @Override
    public String toString() {

        return "VIP " + super.toString() +
                "\nДоплата за VIP-ряд: " +
                complimentaryBarCost + " грн";
    }
}
