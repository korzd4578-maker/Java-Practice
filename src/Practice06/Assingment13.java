package Practice06;

public class Assingment13 {
    public static void main(String[] args) {

        Player player = new Player();

        player.nickname = "Warrior";

        System.out.println("Початкове здоров'я: " + player.health);

        player.takeDamage(40);
        System.out.println("Після отримання шкоди: " + player.health);

        player.heal(25);
        System.out.println("Після лікування: " + player.health);

        player.takeDamage(100);
        System.out.println("Фінальне здоров'я: " + player.health);

    }
}
