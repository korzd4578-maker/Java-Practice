package Practice07;

public class Product {

    private int id;
    private String name;
    private String title;
    private double price;
    private int quantity;
    private String category;

    public Product(String name, double price, int quantity, String category) {

        this.id = 0;
        this.name = name;
        this.title = name;
        this.price = Math.max(0, price);
        this.quantity = Math.max(0, quantity);
        this.category = category;
    }

    public Product(int id, String title, double price) {

        this.id = id;
        this.name = title;
        this.title = title;
        this.price = Math.max(0, price);
        this.quantity = 1;
        this.category = "Товар";
    }

    public double getTotalValue() {
        return price * quantity;
    }

    public double getPrice() {
        return price;
    }

    public String getTitle() {
        return title;
    }

    public int getId() {
        return id;
    }

    public void applyDiscount(double percent) {

        if (percent >= 0 && percent <= 100) {
            price -= price * percent / 100;
        }
    }

    public void printProduct() {

        System.out.println("Назва: " + name);
        System.out.println("Категорія: " + category);
        System.out.println("Ціна: " + price + " грн");
        System.out.println("Кількість: " + quantity);
        System.out.println("Загальна вартість: " + getTotalValue() + " грн");
    }
}
