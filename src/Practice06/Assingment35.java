package Practice06;

public class Assingment35 {
    public static void main(String[] args) {

        ShoppingCart cart = new ShoppingCart();

        cart.addItem(150);
        cart.addItem(250);
        cart.addItem(300);

        System.out.println("Сума до знижки: " + cart.getTotalCost() + " грн");

        cart.applyDiscount(15);

        System.out.println("Сума після знижки: " + cart.getTotalCost() + " грн");

    }
}
