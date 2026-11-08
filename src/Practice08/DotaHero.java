package Practice08;

public class DotaHero {
    private String name;
    private String primaryAttribute;
    private int baseHp;

    public DotaHero(String name, String primaryAttribute, int baseHp) {

        this.name = name;
        this.primaryAttribute = primaryAttribute;
        this.baseHp = Math.max(1, baseHp);
    }

    public String getName() {
        return name;
    }

    public int getMaxHp() {
        return baseHp;
    }

    @Override
    public String toString() {

        return "DotaHero{name='" + name +
                "', attribute='" + primaryAttribute +
                "', maxHP=" + getMaxHp() + "}";
    }
}
