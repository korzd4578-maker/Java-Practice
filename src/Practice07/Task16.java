package Practice07;

public class Task16 {
    public static void main(String[] args) {
        FlightTicket ticket = new FlightTicket(
                "UA12345",
                "Дмитро Корж",
                "PS101",
                "Київ",
                "Львів"
        );

        ticket.assignSeat("12A");

        ticket.printBoardingPass();

        System.out.println("-------------------");

        FlightTicket ticket2 = new FlightTicket(
                "UA67890",
                "Максим",
                "PS202",
                "Київ",
                "Прага",
                "5B",
                true
        );

        ticket2.printBoardingPass();
    }
}
