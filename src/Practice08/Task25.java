package Practice08;

public class Task25 {
    public static void main(String[] args) {
        DotaHero hero = new DotaHero(
                "Pudge",
                "Strength",
                600
        );

        StrengthHero strengthHero = new StrengthHero(
                "Axe",
                600,
                30
        );

        AlchemistHero alchemist = new AlchemistHero(
                "Alchemist",
                600,
                40,
                300
        );

        System.out.println("Базовий герой:");
        System.out.println(hero);

        System.out.println("-------------------");

        System.out.println("Герой сили:");
        System.out.println(strengthHero);

        System.out.println("-------------------");

        System.out.println("Alchemist:");
        System.out.println(alchemist);

        System.out.println(alchemist.chemicalRage());
    }
}
