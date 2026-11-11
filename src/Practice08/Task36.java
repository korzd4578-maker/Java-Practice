package Practice08;

public class Task36 {
    public static void main(String[] args) {
        double[] prices = {1000, 1200, 1100, 1300};

        WarehouseItem item = new WarehouseItem(
                "Монітор",
                10,
                prices
        );

        DiscountedWarehouseItem discounted =
                new DiscountedWarehouseItem(
                        "Монітор",
                        10,
                        prices,
                        "Пошкоджена упаковка",
                        20
                );

        System.out.println("Звичайний товар:");
        System.out.println(item);

        System.out.println("-------------------");

        System.out.println("Уцінений товар:");
        System.out.println(discounted);
    }
}
