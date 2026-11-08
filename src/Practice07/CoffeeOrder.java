package Practice07;

public class CoffeeOrder {
    private String type;
    private String size;
    private int sugarCount;
    private boolean withSyrup;
    private double finalPrice;

    public CoffeeOrder(String type, String size, int sugarCount, boolean withSyrup) {

        this.type = type;
        this.size = size;
        this.sugarCount = Math.max(0, sugarCount);
        this.withSyrup = withSyrup;

        this.finalPrice = calculatePrice();
    }

    public CoffeeOrder(String type, String size) {
        this(type, size, 0, false);
    }

    public CoffeeOrder(String type) {
        this(type, "Medium");
    }

    private double calculatePrice() {

        double basePrice;

        if (type.equalsIgnoreCase("Еспресо")) {
            basePrice = 40;
        } else if (type.equalsIgnoreCase("Капучино")) {
            basePrice = 55;
        } else if (type.equalsIgnoreCase("Лате")) {
            basePrice = 60;
        } else {
            basePrice = 0;
        }

        double sizeMultiplier;

        if (size.equalsIgnoreCase("Small")) {
            sizeMultiplier = 1.0;
        } else if (size.equalsIgnoreCase("Medium")) {
            sizeMultiplier = 1.3;
        } else if (size.equalsIgnoreCase("Large")) {
            sizeMultiplier = 1.6;
        } else {
            sizeMultiplier = 1.0;
        }

        double price = basePrice * sizeMultiplier;

        if (withSyrup) {
            price += 15;
        }

        return price;
    }

    public void printReceipt() {

        System.out.println("========= ЧЕК =========");
        System.out.println("Кава: " + type);
        System.out.println("Розмір: " + size);
        System.out.println("Цукор: " + sugarCount);
        System.out.println("Сироп: " + (withSyrup ? "Так" : "Ні"));
        System.out.println("До сплати: " + finalPrice + " грн");
        System.out.println("=======================");
    }
}
