package Practice08;

public class Task24 {
    public static void main(String[] args) {
        Coffee coffee = new Coffee(
                "Середнє",
                250,
                55
        );

        LatteWithAddons latte = new LatteWithAddons(
                "Середнє",
                350,
                60,
                "Рослинне",
                2
        );

        System.out.println("Звичайна кава:");
        System.out.println(coffee);

        System.out.println("-------------------");

        System.out.println("Лате з додатками:");
        System.out.println(latte);
    }
}
