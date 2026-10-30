package Practice06;

public class Assingment31 {
    public static void main(String[] args) {

        DiscountCard card = new DiscountCard("Дмитро");

        card.addPurchase(3000);
        card.printCardInfo();

        System.out.println("----------------");

        card.addPurchase(4000);
        card.printCardInfo();

    }
}
