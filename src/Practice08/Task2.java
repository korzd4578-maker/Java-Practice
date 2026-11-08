package Practice08;

public class Task2 {

    public static void main(String[] args) {

        Product product1 = new Product(
                "A-101", "Монітор", 6499.50, 4);


        Product product2 = new Product(
                "B-202", "Клавіатура", 1500.00, 10
        );

        Product product3 = new Product(
                "C-303", "Миша", 850.75, 6
        );

        System.out.println("======= ТОВАРИ МАГАЗИНУ =======");

        System.out.println(product1);
        System.out.println(product2);
        System.out.println(product3);
    }
}