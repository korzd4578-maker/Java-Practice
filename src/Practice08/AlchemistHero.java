package Practice08;

public class AlchemistHero extends StrengthHero{
    private int greevilsGreedBonusGold;

    public AlchemistHero(String name, int baseHp,
                         int strength, int bonusGold) {

        super(name, baseHp, strength);

        this.greevilsGreedBonusGold = Math.max(0, bonusGold);
    }

    public String chemicalRage() {

        return getName() + " використовує Chemical Rage!";
    }

    @Override
    public String toString() {

        return "AlchemistHero{" + super.toString() +
                ", bonusGold=" + greevilsGreedBonusGold + "}";
    }
}
