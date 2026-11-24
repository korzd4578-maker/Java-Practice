package Practice12;
import java.util.*;
public class Task28 {
    static abstract class FinancialAsset {

        private final String ticker;
        protected double investedAmount;

        public FinancialAsset(String ticker, double investedAmount) {
            this.ticker = ticker;
            this.investedAmount = investedAmount;
        }

        public String getTicker() {
            return ticker;
        }

        public abstract double annualYieldPercent();

        public final double calculateAnnualProfit() {
            return investedAmount * annualYieldPercent() / 100.0;
        }

        @Override
        public boolean equals(Object obj) {

            if (this == obj) return true;

            if (!(obj instanceof FinancialAsset other)) {
                return false;
            }

            return Objects.equals(ticker, other.ticker);
        }

        @Override
        public int hashCode() {
            return Objects.hash(ticker);
        }
    }

    static class GovernmentBond extends FinancialAsset {

        public GovernmentBond(String ticker, double amount) {
            super(ticker, amount);
        }

        @Override
        public double annualYieldPercent() {
            return 7.5;
        }
    }

    static class TechStock extends FinancialAsset {

        private final double yieldPercent;

        public TechStock(
                String ticker, double amount, double yieldPercent) {

            super(ticker, amount);
            this.yieldPercent = yieldPercent;
        }

        @Override
        public double annualYieldPercent() {
            return yieldPercent;
        }
    }

    public static void main(String[] args) {

        Set<FinancialAsset> portfolio = new HashSet<>();

        portfolio.add(new GovernmentBond("UA-BOND", 10000));
        portfolio.add(new TechStock("NVDA", 15000, 12.5));
        portfolio.add(new TechStock("AAPL", 12000, 8.0));
        portfolio.add(new GovernmentBond("EU-BOND", 8000));

        boolean duplicate = portfolio.add(
                new TechStock("NVDA", 20000, 15.0)
        );

        System.out.println("Дубликат NVDA добавлен: " + duplicate);

        Iterator<FinancialAsset> it = portfolio.iterator();

        while (it.hasNext()) {

            FinancialAsset asset = it.next();

            if (asset.annualYieldPercent() < 5.0) {
                it.remove();
            }
        }

        double totalProfit = 0;

        System.out.println("\nАктивы портфеля:");

        for (FinancialAsset asset : portfolio) {

            double profit = asset.calculateAnnualProfit();

            totalProfit += profit;

            System.out.printf(
                    "%s | Доходность: %.2f%% | Прибыль: %.2f\n",
                    asset.getTicker(),
                    asset.annualYieldPercent(),
                    profit
            );
        }

        System.out.printf("\nОбщая годовая прибыль: %.2f\n",
                totalProfit);
    }
}
