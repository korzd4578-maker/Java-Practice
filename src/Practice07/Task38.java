package Practice07;

public class Task38 {
    public static void main(String[] args) {
        Product product1 = new Product(1, "Клавіатура", 1200);

        Product product2 = new Product(2, "Мишка", 700);

        Product product3 = new Product(3, "Навушники", 1500);

        Customer customer1 = new Customer("Дмитро", 5000);

        Customer customer2 = new Customer("Максим", 1000);

        System.out.println("===== ПЕРШЕ ЗАМОВЛЕННЯ =====");

        Order order1 = new Order(customer1, 5);

        order1.addProduct(product1);
        order1.addProduct(product2);
        order1.addProduct(product3);

        order1.checkout();

        System.out.println("\n===== ДРУГЕ ЗАМОВЛЕННЯ =====");

        Order order2 = new Order(customer2, 5);

        order2.addProduct(product1);
        order2.addProduct(product2);

        order2.checkout();
    }
}
