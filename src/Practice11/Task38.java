package Practice11;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
public class Task38 {
    public static void main(String[] args) {

        List<String> receiptLines = List.of(
                "Хліб: 35",
                "Молоко: 48",
                "Помилка сканера: N/A",
                "Кава: 240",
                "Пакет: 5",
                "Сир: 185"
        );

        var prices = new ArrayList<Integer>();

        for (String line : receiptLines) {

            try {

                String priceText = line.substring(
                        line.indexOf(':') + 1
                ).trim();

                prices.add(Integer.parseInt(priceText));

            } catch (
                    NumberFormatException
                    | StringIndexOutOfBoundsException e
            ) {

                System.out.println(
                        "Рядок пропущено через помилку ціни: "
                                + line
                );
            }
        }

        System.out.println(
                "Розпізнані ціни: " + prices
        );

        Iterator<Integer> it = prices.iterator();

        while (it.hasNext()) {

            if (it.next() < 40) {

                it.remove();
            }
        }

        int total = 0;

        for (int price : prices) {

            total += price;
        }

        System.out.println(
                "Ціни після видалення покупок дешевше 40 грн: "
                        + prices
        );

        System.out.println(
                "Сума до сплати: " + total + " грн"
        );
    }
}
