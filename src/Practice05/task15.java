package Practice05;
public class task15 {
    public static void main(String[] args) {
        double[] prices = {42.5, 41.8, 44.1, 40.9, 43.6, 45.0};
        double min = prices[0], max = prices[0];
        for (double price : prices) {
            if (price < min) min = price;
            if (price > max) max = price;
        }
        double range = max - min;
        System.out.printf("Розмах коливань цін: %.2f\n", range);
    }
}
