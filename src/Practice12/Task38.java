package Practice12;
import java.util.*;
public class Task38 {
    static final class TradeOrder {

        private final String orderId;
        private final String pair;
        private final double price;
        private final double volume;

        public TradeOrder(
                String orderId,
                String pair,
                double price,
                double volume) {

            this.orderId = orderId;
            this.pair = pair;
            this.price = price;
            this.volume = volume;
        }

        @Override
        public boolean equals(Object obj) {

            if (this == obj) return true;

            if (!(obj instanceof TradeOrder other)) {
                return false;
            }

            return Objects.equals(orderId, other.orderId);
        }

        @Override
        public int hashCode() {
            return Objects.hash(orderId);
        }

        @Override
        public String toString() {
            return orderId + " | " + pair
                    + " | Price: " + price
                    + " | Volume: " + volume;
        }
    }

    public static void main(String[] args) {

        Set<String> binancePairs = new HashSet<>(
                Arrays.asList(
                        "BTC/USDT",
                        "ETH/USDT",
                        "SOL/USDT",
                        "BNB/USDT"
                )
        );

        Set<String> krakenPairs = new HashSet<>(
                Arrays.asList(
                        "BTC/USDT",
                        "ETH/USDT",
                        "XRP/USDT",
                        "ADA/USDT"
                )
        );

        Set<String> arbitragePairs = new HashSet<>(binancePairs);
        arbitragePairs.retainAll(krakenPairs);

        Set<String> exclusivePairs = new HashSet<>(binancePairs);
        exclusivePairs.addAll(krakenPairs);

        Set<String> commonPairs = new HashSet<>(binancePairs);
        commonPairs.retainAll(krakenPairs);

        exclusivePairs.removeAll(commonPairs);

        System.out.println("Общие пары: " + arbitragePairs);
        System.out.println("Эксклюзивные пары: " + exclusivePairs);

        List<TradeOrder> orders = new ArrayList<>();

        orders.add(new TradeOrder(
                "ORD-1", "BTC/USDT", 65000, 0.5
        ));

        orders.add(new TradeOrder(
                "ORD-2", "ETH/USDT", 3000, 2
        ));

        orders.add(new TradeOrder(
                "ORD-3", "SOL/USDT", 150, 10
        ));

        orders.add(new TradeOrder(
                "ORD-4", "DOGE/USDT", 0.15, 100
        ));

        orders.add(new TradeOrder(
                "ORD-5", "BTC/USDT", 65000, 0
        ));

        Iterator<TradeOrder> it = orders.iterator();

        while (it.hasNext()) {

            TradeOrder order = it.next();

            if (!arbitragePairs.contains(order.pair)
                    || order.volume <= 0) {

                it.remove();
            }
        }

        double totalLiquidity = 0;

        System.out.println("\nАктивные ордера:");

        for (TradeOrder order : orders) {

            System.out.println(order);

            totalLiquidity += order.price * order.volume;
        }

        System.out.printf(
                "\nОбщая ликвидность: %.2f\n",
                totalLiquidity
        );
    }
}
