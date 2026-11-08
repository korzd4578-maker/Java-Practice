package Practice08;

public class Task16 {
    public static void main(String[] args) {
        Gamer gamer = new Gamer(
                "dezz1we",
                4000
        );

        ProEsportsPlayer pro = new ProEsportsPlayer(
                "Dmytro",
                6000,
                "SWAROVSKI FAMQ",
                15000,
                5
        );

        System.out.println("Звичайний гравець:");
        System.out.println(gamer);

        System.out.println("-------------------");

        System.out.println("Професійний гравець:");
        System.out.println(pro);
    }
}
