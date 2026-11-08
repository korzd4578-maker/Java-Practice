package Practice07;

public class Task14 {
    public static void main(String[] args) {
        CoffeeOrder order1 = new CoffeeOrder("Еспресо");

        CoffeeOrder order2 = new CoffeeOrder("Капучино", "Large");

        CoffeeOrder order3 = new CoffeeOrder("Лате", "Medium", 2, true);

        order1.printReceipt();

        order2.printReceipt();

        order3.printReceipt();
    }
}
