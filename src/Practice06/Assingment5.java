package Practice06;

public class Assingment5 {
    public static void main(String[] args) {

        Product product = new Product();

        product.name = "Монітор";
        product.price = 6500.0;
        product.quantity = 8;

        double totalCost = product.price * product.quantity;

        System.out.println("Товар: " + product.name);
        System.out.println("Ціна: " + product.price + " грн");
        System.out.println("Кількість: " + product.quantity);
        System.out.println("Загальна вартість: " + totalCost + " грн");

    }
}
