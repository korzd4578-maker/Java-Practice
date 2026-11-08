package Practice07;

public class Hero {
    private String name;
    private int health;
    private int attackPower;
    private int defense;

    public Hero(String name, int health, int attackPower, int defense) {

        this.name = name;
        this.health = Math.max(0, health);
        this.attackPower = Math.max(0, attackPower);
        this.defense = Math.max(0, defense);
    }

    public void attack(Hero target) {

        if (target == null || !isAlive() || !target.isAlive()) {
            return;
        }

        int damage = this.attackPower - target.defense;

        if (damage <= 0) {
            damage = 1;
        }

        target.health -= damage;

        if (target.health < 0) {
            target.health = 0;
        }

        System.out.println(this.name + " атакує "
                + target.name + " та завдає " + damage + " шкоди!");

        System.out.println("Здоров'я " + target.name + ": "
                + target.health + " HP");

        System.out.println("-------------------");
    }

    public boolean isAlive() {

        return this.health > 0;
    }

    public String getName() {
        return name;
    }
}
