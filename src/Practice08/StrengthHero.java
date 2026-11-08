package Practice08;

public class StrengthHero extends DotaHero{
    private int strength;

    public StrengthHero(String name, int baseHp, int strength) {

        super(name, "Strength", baseHp);

        this.strength = Math.max(0, strength);
    }

    @Override
    public int getMaxHp() {

        return super.getMaxHp() + strength * 22;
    }

    @Override
    public String toString() {

        return "StrengthHero{" + super.toString() +
                ", strength=" + strength + "}";
    }
}
