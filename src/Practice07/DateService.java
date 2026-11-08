package Practice07;

public class DateService {
        private int day;
        private int month;
        private int year;

    public DateService( int day, int month, int year){

            this.day = Math.max(1, Math.min(30, day));
            this.month = Math.max(1, Math.min(12, month));
            this.year = year;
        }

        public void add ( int days){
            add(days, 0, 0);
        }

        public void add ( int days, int months){
            add(days, months, 0);
        }

        public void add ( int days, int months, int years){

            int totalDays = day - 1 + days;

            int extraMonths = Math.floorDiv(totalDays, 30);

            day = Math.floorMod(totalDays, 30) + 1;

            int totalMonths = month - 1 + months + extraMonths;

            year += years + Math.floorDiv(totalMonths, 12);

            month = Math.floorMod(totalMonths, 12) + 1;
            }
    public void printDate() {
        System.out.printf("%02d.%02d.%d%n", this.day, this.month, this.year);
        }
    }
