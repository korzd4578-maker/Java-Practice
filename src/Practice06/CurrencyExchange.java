package Practice06;

public class CurrencyExchange {
    public double usdRate = 41.5;

    public double toUSD(double uah) {
        return uah / usdRate;
    }

    public double toUAH(double usd) {
        return usd * usdRate;
    }
}
