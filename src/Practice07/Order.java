package Practice07;

public class Order {
    private Customer customer;
    private Product[] items;
    private int itemCount;

    public Order(Customer customer, int maxItems) {

        this.customer = customer;
        this.items = new Product[Math.max(0, maxItems)];
        this.itemCount = 0;
    }

    public void addProduct(Product p) {

        if (p != null && itemCount < items.length) {

            items[itemCount] = p;
            itemCount++;

            System.out.println("Товар додано: " + p.getTitle());

        } else {

            System.out.println("Неможливо додати товар!");
        }
    }

    public double calculateTotal() {

        double total = 0;

        for (int i = 0; i < itemCount; i++) {
            total += items[i].getPrice();
        }

        return total;
    }

    public boolean checkout() {

        double total = calculateTotal();

        if (customer != null && customer.pay(total)) {

            System.out.println("======= ЧЕК ПОКУПКИ =======");

            System.out.println("Покупець: " + customer.getName());

            for (int i = 0; i < itemCount; i++) {

                System.out.println(
                        items[i].getTitle() + " — " +
                                items[i].getPrice() + " грн"
                );
            }

            System.out.println("---------------------------");

            System.out.println("Разом: " + total + " грн");

            System.out.println("Залишок на рахунку: "
                    + customer.getWalletBalance() + " грн");

            System.out.println("===========================");

            return true;

        } else {

            System.out.println("Помилка: недостатньо коштів для покупки!");

            return false;
        }
    }
}
