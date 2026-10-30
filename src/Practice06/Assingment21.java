package Practice06;

public class Assingment21 {
    public static void main(String[] args) {

        CurrencyExchange exchange = new CurrencyExchange();

        double dollars = exchange.toUSD(10000);

        System.out.printf("10000 грн = %.2f USD%n", dollars);
        System.out.printf("100 USD = %.2f грн%n", exchange.toUAH(100));

    }
}
