package Practice07;

public class FlightTicket {
    private String ticketNumber;
    private String passengerName;
    private String flightNumber;
    private String departureCity;
    private String arrivalCity;
    private String seatNumber;
    private boolean hasBaggage;

    public FlightTicket(String ticketNumber, String passengerName,
                        String flightNumber, String departureCity,
                        String arrivalCity, String seatNumber,
                        boolean hasBaggage) {

        this.ticketNumber = ticketNumber;
        this.passengerName = passengerName;
        this.flightNumber = flightNumber;
        this.departureCity = departureCity;
        this.arrivalCity = arrivalCity;
        this.seatNumber = seatNumber;
        this.hasBaggage = hasBaggage;
    }

    public FlightTicket(String ticketNumber, String passengerName,
                        String flightNumber, String departureCity,
                        String arrivalCity) {

        this(ticketNumber, passengerName, flightNumber,
                departureCity, arrivalCity, "UNASSIGNED", false);
    }

    public void assignSeat(String seat) {
        this.seatNumber = seat;
    }

    public void printBoardingPass() {

        System.out.println("======= ПОСАДКОВИЙ ТАЛОН =======");
        System.out.println("Номер квитка: " + ticketNumber);
        System.out.println("Пасажир: " + passengerName);
        System.out.println("Рейс: " + flightNumber);
        System.out.println("Звідки: " + departureCity);
        System.out.println("Куди: " + arrivalCity);
        System.out.println("Місце: " + seatNumber);
        System.out.println("Багаж: " + (hasBaggage ? "Так" : "Ні"));
        System.out.println("================================");
    }
}
