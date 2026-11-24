package Practice12;
import java.util.*;
public class Task37 {
    interface InternationalFlight {
        String getDestinationCountry();
    }

    static abstract class AbstractFlight {

        private final String flightCode;
        private final int delayMinutes;

        public AbstractFlight(String flightCode, int delayMinutes) {
            this.flightCode = flightCode;
            this.delayMinutes = delayMinutes;
        }

        public String getFlightCode() {
            return flightCode;
        }

        public int getDelayMinutes() {
            return delayMinutes;
        }

        @Override
        public boolean equals(Object obj) {

            if (this == obj) return true;

            if (!(obj instanceof AbstractFlight other)) {
                return false;
            }

            return Objects.equals(flightCode, other.flightCode);
        }

        @Override
        public int hashCode() {
            return Objects.hash(flightCode);
        }
    }

    static class DomesticFlight extends AbstractFlight {

        private final String destinationCity;

        public DomesticFlight(
                String code, int delay, String destinationCity) {

            super(code, delay);
            this.destinationCity = destinationCity;
        }

        @Override
        public String toString() {
            return getFlightCode() + " -> " + destinationCity;
        }
    }

    static class InternationalCharterFlight
            extends AbstractFlight
            implements InternationalFlight {

        private final String destinationCountry;

        public InternationalCharterFlight(
                String code, int delay, String country) {

            super(code, delay);
            this.destinationCountry = country;
        }

        @Override
        public String getDestinationCountry() {
            return destinationCountry;
        }

        @Override
        public String toString() {
            return getFlightCode() + " -> " + destinationCountry;
        }
    }

    public static void main(String[] args) {

        Set<AbstractFlight> schedule = new LinkedHashSet<>();

        schedule.add(new DomesticFlight("UA101", 30, "Київ"));
        schedule.add(new DomesticFlight("UA102", 200, "Львів"));

        schedule.add(new InternationalCharterFlight(
                "UA201", 45, "Poland"
        ));

        schedule.add(new InternationalCharterFlight(
                "UA202", 210, "Germany"
        ));

        schedule.add(new InternationalCharterFlight(
                "UA203", 60, "France"
        ));

        Iterator<AbstractFlight> it = schedule.iterator();

        while (it.hasNext()) {

            AbstractFlight flight = it.next();

            if (flight.getDelayMinutes() > 180) {
                it.remove();
            }
        }

        TreeSet<String> countries = new TreeSet<>();

        System.out.println("Активные рейсы:");

        for (AbstractFlight flight : schedule) {

            System.out.println(flight);

            if (flight instanceof InternationalFlight international) {

                countries.add(
                        international.getDestinationCountry()
                );
            }
        }

        System.out.println("\nСтраны назначения: " + countries);
    }
}
