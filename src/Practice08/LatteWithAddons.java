package Practice08;

public class LatteWithAddons extends Coffee {
    private String milkType;
    private int syrupPumps;

    public LatteWithAddons(String roastType, int volumeMl,
                           double basePrice, String milkType,
                           int syrupPumps) {

        super(roastType, volumeMl, basePrice);

        this.milkType = milkType;
        this.syrupPumps = Math.max(0, syrupPumps);
    }

    @Override
    public double calculatePrice() {

        double price = super.calculatePrice();

        if (milkType.equalsIgnoreCase("Рослинне")) {
            price += 20;
        }

        price += syrupPumps * 12;

        return price;
    }

    @Override
    public double calculateCalories() {

        double calories = super.calculateCalories();

        if (milkType.equalsIgnoreCase("Рослинне")) {
            calories += 30;
        }

        calories += syrupPumps * 25;

        return calories;
    }

    @Override
    public String toString() {

        return "========= ЧЕК КАВ'ЯРНІ =========\n" +
                "Напій: Лате\n" +
                "Обсмаження: " + getRoastType() + "\n" +
                "Об'єм: " + getVolumeMl() + " мл\n" +
                "Молоко: " + milkType + "\n" +
                "Сироп: " + syrupPumps + " натискань\n" +
                "Калорійність: " + calculateCalories() + " ккал\n" +
                "До сплати: " + calculatePrice() + " грн\n" +
                "===============================";
    }

}
