package Practice08;

public class ShieldedPaladin extends CharacterUnit {
    private int shieldPoints;

    public ShieldedPaladin(String name, int hp,
                           int maxHp, int armor,
                           int shieldPoints) {

        super(name, hp, maxHp, armor);

        this.shieldPoints = Math.max(0, shieldPoints);
    }

    @Override
    public void takeDamage(int rawDamage) {

        if (rawDamage <= 0 || hp <= 0) {
            return;
        }

        int remainingDamage = rawDamage;

        if (shieldPoints > 0) {

            if (remainingDamage <= shieldPoints) {

                shieldPoints -= remainingDamage;

                remainingDamage = 0;

            } else {

                remainingDamage -= shieldPoints;

                shieldPoints = 0;
            }
        }

        if (remainingDamage > 0) {

            super.takeDamage(remainingDamage);
        }
    }

    @Override
    public String toString() {

        return "ShieldedPaladin{" +
                super.toString() +
                ", Shield=[" + shieldPoints + "]}";
    }
}
