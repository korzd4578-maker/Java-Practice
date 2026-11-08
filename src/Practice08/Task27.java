package Practice08;

public class Task27 {
    public static void main(String[] args) {
        CashbackPlatinumCard card = new CashbackPlatinumCard(
                "Дмитро Корж",
                20000,
                10000,
                5
        );

        System.out.println("Початковий стан картки:");
        System.out.println(card);

        System.out.println("-------------------");

        boolean payment1 = card.pay(3000);

        System.out.println("Оплата 3000 грн: " + payment1);

        System.out.println("-------------------");

        boolean payment2 = card.pay(15000);

        System.out.println("Оплата 15000 грн: " + payment2);

        System.out.println("-------------------");

        System.out.println("Фінальний стан картки:");
        System.out.println(card);
    }
}
