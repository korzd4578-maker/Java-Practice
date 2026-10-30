package Practice02;

public class ex40 {
    public static void main(String[] args) {

        double principal = 10000.0;
        double annualRate = 12.0;
        int years = 3;

        double finalAmount = principal * Math.pow(1 + annualRate / 100, years);
        double profit = finalAmount - principal;

        System.out.println("+------------------------------------+");
        System.out.println("|       ДЕПОЗИТНИЙ КАЛЬКУЛЯТОР       |");
        System.out.println("+------------------------------------+");
        System.out.println("Початкова сума: " + principal + " грн");
        System.out.println("Термін: " + years + " роки під " + annualRate + "% річних");
        System.out.printf(java.util.Locale.US, "Підсумкова сума: %.2f грн%n", finalAmount);
        System.out.printf(java.util.Locale.US, "Чистий прибуток: %.2f грн%n", profit);
        System.out.println("+------------------------------------+");

    }
}
