package PracticeHomework01;

public class Task1CurrencyExchange {

    public static void main(String[] args) {
        int usdAmount = 250;
        final double EXCHANGE_RATE = 41.25;
        final double COMMISSION_PERCENT = 1.5;

        double totalUah = usdAmount * EXCHANGE_RATE;
        double commission = totalUah * COMMISSION_PERCENT / 100;
        double result = totalUah - commission;

        long cash = Math.round(result);

        System.out.println();
        System.out.println("╔══════════════════════════════════════╗");
        System.out.println("║            ОБМІН ВАЛЮТИ              ║");
        System.out.println("╠══════════════════════════════════════╣");
        System.out.println("║ Клієнт обмінює: " + usdAmount +" USD");
        System.out.println("║ Курс: " + EXCHANGE_RATE + " UAH/USD");
        System.out.println("╠══════════════════════════════════════╣");
        System.out.printf("║ До комісії: %.2f UAH%n", totalUah);
        System.out.printf("║ Комісія:    %.2f UAH%n", commission);
        System.out.println("╠══════════════════════════════════════╣");
        System.out.printf("║ До видачі:  %.2f UAH%n", result);
        System.out.println("║ Готівкою:   " + cash + " UAH");
        System.out.println("╚══════════════════════════════════════╝");

        System.out.println();
        System.out.printf("Банк потужно утримав %.2f UAH комісії.%n", commission);
    }
}
