package Practice08;

public class Task39 {
    public static void main(String[] args) {
        CharacterUnit warrior = new CharacterUnit(
                "Воїн",
                100,
                100,
                10
        );

        ShieldedPaladin paladin = new ShieldedPaladin(
                "Паладин",
                150,
                150,
                20,
                80
        );

        System.out.println("======= ПОЧАТКОВИЙ СТАН =======");

        System.out.println(warrior);

        System.out.println(paladin);

        System.out.println("-------------------");

        System.out.println("Атака на 50 шкоди:");

        warrior.takeDamage(50);

        paladin.takeDamage(50);

        System.out.println("Звичайний воїн:");
        System.out.println(warrior);

        System.out.println("Паладин із щитом:");
        System.out.println(paladin);

        System.out.println("-------------------");

        System.out.println("Сильна атака на 100 шкоди:");

        paladin.takeDamage(100);

        System.out.println(paladin);

        System.out.println("===============================");
    }
}
