package Practice07;

public class Task28 {
    public static void main(String[] args) {

        System.out.println("Початкові курси валют:");

        System.out.println("100 USD = "
                + CurrencyExchange.usdToUah(100) + " грн");

        System.out.println("100 EUR = "
                + CurrencyExchange.eurToUah(100) + " грн");

        System.out.println("10000 UAH = "
                + CurrencyExchange.uahToUsd(10000) + " USD");

        System.out.println("-------------------");

        CurrencyExchange.updateRates(42.0, 46.0);

        System.out.println("Нові курси валют:");

        System.out.println("100 USD = "
                + CurrencyExchange.usdToUah(100) + " грн");

        System.out.println("100 EUR = "
                + CurrencyExchange.eurToUah(100) + " грн");
    }
}
