package Practice08;

public class Ticket {
    private String eventName;
    private double basePrice;

    public Ticket(String eventName, double basePrice) {

        this.eventName = eventName;
        this.basePrice = Math.max(0, basePrice);
    }

    public double getFinalPrice() {
        return basePrice;
    }

    public String getEventName() {
        return eventName;
    }

    @Override
    public String toString() {

        return String.format(
                "Ticket{event='%s', basePrice=%.2f грн}",
                eventName, basePrice
        );
    }
}
