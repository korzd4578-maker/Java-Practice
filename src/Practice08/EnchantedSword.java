package Practice08;

public class EnchantedSword extends Weapon {
    private String element;
    private int magicPower;
    private int enchantmentLevel;

    public EnchantedSword(String title, int baseDamage,
                          String element, int magicPower,
                          int enchantmentLevel) {

        super(title, baseDamage);

        this.element = element;
        this.magicPower = Math.max(0, magicPower);
        this.enchantmentLevel = Math.max(0, enchantmentLevel);
    }

    @Override
    public int calculateDamage() {

        return super.calculateDamage()
                + magicPower * enchantmentLevel;
    }

    @Override
    public String toString() {

        return "EnchantedSword{" + super.toString() +
                ", element='" + element +
                "', magicDamage=" + magicPower * enchantmentLevel +
                ", totalDamage=" + calculateDamage() + "}";
    }
}
