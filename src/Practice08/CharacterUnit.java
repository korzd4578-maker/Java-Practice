package Practice08;

public class CharacterUnit {
    private String name;

    protected int hp;
    protected int maxHp;
    protected int armor;

    public CharacterUnit(String name, int hp,
                         int maxHp, int armor) {

        this.name = name;

        this.maxHp = Math.max(1, maxHp);

        this.hp = Math.max(0, Math.min(hp, this.maxHp));

        this.armor = Math.max(0, armor);
    }

    public void takeDamage(int rawDamage) {

        if (rawDamage <= 0 || hp <= 0) {
            return;
        }

        int actual = Math.max(1, rawDamage - armor);

        hp -= actual;

        if (hp < 0) {
            hp = 0;
        }
    }

    protected String buildHealthBar() {

        int filled = (int) Math.round(
                (double) hp / maxHp * 10
        );

        String result = "[";

        for (int i = 0; i < 10; i++) {

            if (i < filled) {
                result += "█";
            } else {
                result += "░";
            }
        }

        result += "]";

        return result;
    }

    @Override
    public String toString() {

        return "CharacterUnit{name='" + name +
                "', HP=" + buildHealthBar() +
                " " + hp + "/" + maxHp +
                ", armor=" + armor + "}";
    }
}
