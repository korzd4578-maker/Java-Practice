package Practice12;
import java.util.*;
public class Task40 {
    static final class Product {

        private final String id;
        private final String name;
        private final double price;

        public Product(String id, String name, double price) {
            this.id = id;
            this.name = name;
            this.price = price;
        }

        @Override
        public boolean equals(Object obj) {

            if (this == obj) return true;

            if (!(obj instanceof Product other)) {
                return false;
            }

            return Objects.equals(id, other.id);
        }

        @Override
        public int hashCode() {
            return Objects.hash(id);
        }

        @Override
        public String toString() {
            return name + " | " + price + " грн";
        }
    }

    interface Discountable {
        double getDiscount();
    }

    static abstract class ShopItem {

        private final String name;
        protected double price;

        public ShopItem(String name, double price) {
            this.name = name;
            this.price = price;
        }

        public String getName() {
            return name;
        }

        public abstract double calculatePrice();
    }

    static class DiscountProduct extends ShopItem
            implements Discountable {

        private final double discount;

        public DiscountProduct(
                String name, double price, double discount) {

            super(name, price);
            this.discount = discount;
        }

        @Override
        public double getDiscount() {
            return discount;
        }

        @Override
        public double calculatePrice() {
            return price - price * discount / 100;
        }
    }

    static class ProductCatalog implements Iterable<Product> {

        private final List<Product> products = new ArrayList<>();

        public void addProduct(Product product) {
            products.add(product);
        }

        public void removeExpensiveProducts(double maxPrice) {

            Iterator<Product> it = products.iterator();

            while (it.hasNext()) {

                Product product = it.next();

                if (product.price > maxPrice) {
                    it.remove();
                }
            }
        }

        @Override
        public Iterator<Product> iterator() {
            return products.iterator();
        }
    }

    public static void runFinalSummary() {

        System.out.println("========== LIST TO SET ==========");

        List<Product> rawProducts = new ArrayList<>();

        rawProducts.add(new Product("P1", "Laptop", 30000));
        rawProducts.add(new Product("P2", "Mouse", 500));
        rawProducts.add(new Product("P3", "Keyboard", 1500));
        rawProducts.add(new Product("P1", "Laptop Duplicate", 30000));

        Set<Product> uniqueProducts = new HashSet<>(rawProducts);

        System.out.println("Список: " + rawProducts);
        System.out.println("Уникальные продукты: " + uniqueProducts);

        System.out.println("\n========== SET OPERATIONS ==========");

        Set<String> categoryA = new HashSet<>(
                Arrays.asList("Laptop", "Mouse", "Keyboard")
        );

        Set<String> categoryB = new HashSet<>(
                Arrays.asList("Mouse", "Monitor", "Keyboard")
        );

        Set<String> union = new HashSet<>(categoryA);
        union.addAll(categoryB);

        Set<String> intersection = new HashSet<>(categoryA);
        intersection.retainAll(categoryB);

        Set<String> difference = new HashSet<>(categoryA);
        difference.removeAll(categoryB);

        System.out.println("Объединение: " + union);
        System.out.println("Пересечение: " + intersection);
        System.out.println("Разность: " + difference);

        System.out.println("\n========== ITERABLE ==========");

        ProductCatalog catalog = new ProductCatalog();

        for (Product product : rawProducts) {
            catalog.addProduct(product);
        }

        catalog.removeExpensiveProducts(10000);

        for (Product product : catalog) {
            System.out.println(product);
        }

        System.out.println("\n========== POLYMORPHISM ==========");

        List<ShopItem> items = new ArrayList<>();

        items.add(new DiscountProduct("Phone", 20000, 10));
        items.add(new DiscountProduct("Tablet", 15000, 15));
        items.add(new DiscountProduct("Headphones", 3000, 5));

        for (ShopItem item : items) {

            System.out.println(
                    item.getName()
                            + " | Цена: "
                            + item.calculatePrice()
            );

            if (item instanceof Discountable discountable) {

                System.out.println(
                        "Скидка: " + discountable.getDiscount() + "%"
                );
            }
        }

        System.out.println("\n========== FINAL SUMMARY ==========");
        System.out.println("Практическая работа №12 завершена!");
    }

    public static void main(String[] args) {

        runFinalSummary();
    }
}
