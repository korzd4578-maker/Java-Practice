package Practice08;

public class Weapon {
    private String title;
    private int baseDamage;

    public Weapon(String title, int baseDamage) {

        this.title = title;
        this.baseDamage = Math.max(0, baseDamage);
    }

    public int calculateDamage() {
        return baseDamage;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {

        return "Weapon{title='" + title +
                "', physicalDamage=" + baseDamage + "}";
    }
}
