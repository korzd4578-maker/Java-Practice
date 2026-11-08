package Practice07;

public class CurrencyExchange {
    private static double usdToUahRate = 41.5;
    private static double eurToUahRate = 45.2;

    public static void updateRates(double newUsd, double newEur) {

        if (newUsd > 0 && newEur > 0) {
            usdToUahRate = newUsd;
            eurToUahRate = newEur;

            System.out.println("Курси валют успішно оновлено!");
        } else {
            System.out.println("Помилка: курс має бути більшим за нуль!");
        }
    }

    public static double uahToUsd(double uah) {
        return uah / usdToUahRate;
    }

    public static double usdToUah(double usd) {
        return usd * usdToUahRate;
    }

    public static double eurToUah(double eur) {
        return eur * eurToUahRate;
    }
}
