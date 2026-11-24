package Practice11;
import java.util.ArrayList;
public class Task19 {
    public static void main(String[] args) {

        ArrayList<String> cart = new ArrayList<>();

        System.out.println(
                "Кошик порожній: " + cart.isEmpty()
        );

        System.out.println(
                "Кількість товарів: " + cart.size()
        );

        cart.add("Хліб");
        cart.add("Молоко");
        cart.add("Яблука");
        cart.add("Сир");

        System.out.println(
                "Кошик після покупок: " + cart
        );

        System.out.println(
                "Кошик порожній: " + cart.isEmpty()
        );

        System.out.println(
                "Кількість товарів: " + cart.size()
        );

        cart.clear();

        System.out.println(
                "Після оформлення замовлення: " + cart
        );

        System.out.println(
                "Кошик порожній: " + cart.isEmpty()
        );

        System.out.println(
                "Кількість товарів: " + cart.size()
        );

        System.out.println(
                "clear() прибирає посилання на елементи "
                        + "та встановлює size = 0."
        );
    }
}
