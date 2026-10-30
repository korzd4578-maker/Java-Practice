package Practice06;

public class Player {
    public String nickname;
    public int health = 100;

    public void takeDamage(int damage) {
        health -= damage;

        if (health < 0) {
            health = 0;
        }

        if (health == 0) {
            System.out.println(nickname + " загинув!");
        }
    }

    public void heal(int amount) {
        health += amount;

        if (health > 100) {
            health = 100;
        }
    }
}
