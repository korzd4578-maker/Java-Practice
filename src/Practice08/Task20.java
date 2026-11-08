package Practice08;

public class Task20 {
    public static void main(String[] args) {
        Weapon weapon = new Weapon(
                "Залізний меч",
                40
        );

        EnchantedSword sword = new EnchantedSword(
                "Меч вогню",
                50,
                "Вогонь",
                20,
                3
        );

        System.out.println("Звичайна зброя:");
        System.out.println(weapon);

        System.out.println("-------------------");

        System.out.println("Зачарований меч:");
        System.out.println(sword);

        System.out.println("Загальна шкода: "
                + sword.calculateDamage());
    }
}
