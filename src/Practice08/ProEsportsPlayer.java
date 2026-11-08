package Practice08;

public class ProEsportsPlayer extends Gamer {
    private String teamName;
    private double prizeMoneyUSD;
    private int tournamentsWon;

    public ProEsportsPlayer(String nickname, int hoursPlayed,
                            String teamName, double prizeMoneyUSD,
                            int tournamentsWon) {

        super(nickname, hoursPlayed);

        this.teamName = teamName;
        this.prizeMoneyUSD = Math.max(0, prizeMoneyUSD);
        this.tournamentsWon = Math.max(0, tournamentsWon);
    }

    public double getAveragePrizePerWin() {

        if (tournamentsWon == 0) {
            return 0;
        }

        return prizeMoneyUSD / tournamentsWon;
    }

    @Override
    public String toString() {

        return "ProEsportsPlayer{" + super.toString() +
                ", team='" + teamName +
                "', prizeMoney=" + prizeMoneyUSD +
                " USD, tournamentsWon=" + tournamentsWon +
                ", averagePrize=" + getAveragePrizePerWin() + " USD}";
    }
}
