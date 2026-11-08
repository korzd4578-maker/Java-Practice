package Practice08;

public class CinemaHall {
    private String hallName;

    protected boolean[][] seats;

    protected double baseTicketPrice;

    public CinemaHall(String hallName, int rows,
                      int cols, double baseTicketPrice) {

        this.hallName = hallName;

        this.seats = new boolean[Math.max(0, rows)][Math.max(0, cols)];

        this.baseTicketPrice = Math.max(0, baseTicketPrice);
    }

    public boolean bookSeat(int row, int col) {

        if (row < 0 || row >= seats.length ||
                col < 0 || col >= seats[row].length) {

            System.out.println("Некоректне місце!");

            return false;
        }

        if (seats[row][col]) {

            System.out.println("Місце вже зайняте!");

            return false;
        }

        seats[row][col] = true;

        return true;
    }

    public int getOccupiedCount() {

        int count = 0;

        for (int i = 0; i < seats.length; i++) {

            for (int j = 0; j < seats[i].length; j++) {

                if (seats[i][j]) {
                    count++;
                }
            }
        }

        return count;
    }

    public int getLastRowOccupiedCount() {

        if (seats.length == 0) {
            return 0;
        }

        int count = 0;

        int lastRow = seats.length - 1;

        for (int j = 0; j < seats[lastRow].length; j++) {

            if (seats[lastRow][j]) {
                count++;
            }
        }

        return count;
    }

    public double calculateRevenue() {

        return getOccupiedCount() * baseTicketPrice;
    }

    @Override
    public String toString() {

        String result = "CinemaHall: " + hallName + "\n";

        for (int i = 0; i < seats.length; i++) {

            for (int j = 0; j < seats[i].length; j++) {

                result += seats[i][j] ? "[X]" : "[O]";
            }

            result += "\n";
        }

        result += "Зайнято місць: " + getOccupiedCount();

        result += "\nДохід: " + calculateRevenue() + " грн";

        return result;
    }
}
