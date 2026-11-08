package Practice07;

public class Task5 {
    public static void main(String[] args) {
        Product product = new Product(
                "Ноутбук", 30000, 5, "Електроніка");

        System.out.println("До знижки:");
        product.printProduct();

        System.out.println("-------------------");

        product.applyDiscount(20);

        System.out.println("Після знижки 20%:");
        product.printProduct();
    }
}
