package Practice12;
import java.util.*;
public class Task39 {
    interface Poisonable {

        boolean isPoisoned();

        void tickPoison();
    }

    interface Regenerating {
        void healTurn();
    }

    static abstract class RpgHero {

        private final String name;
        protected int hp;

        private final Set<String> activeBuffs = new HashSet<>();

        public RpgHero(String name, int hp) {
            this.name = name;
            this.hp = hp;
        }

        public String getName() {
            return name;
        }

        public int getHp() {
            return hp;
        }

        public void addBuff(String buff) {
            activeBuffs.add(buff);
        }

        public Set<String> getActiveBuffsCopy() {
            return new HashSet<>(activeBuffs);
        }

        public void takeDamage(int damage) {
            hp -= damage;
        }

        @Override
        public String toString() {
            return name + " | HP: " + hp
                    + " | Buffs: " + activeBuffs;
        }
    }

    static class Warrior extends RpgHero
            implements Regenerating {

        public Warrior(String name, int hp) {
            super(name, hp);
        }

        @Override
        public void healTurn() {
            hp += 15;
        }
    }

    static class Mage extends RpgHero
            implements Poisonable, Regenerating {

        private boolean poisoned = true;

        public Mage(String name, int hp) {
            super(name, hp);
        }

        @Override
        public boolean isPoisoned() {
            return poisoned;
        }

        @Override
        public void tickPoison() {

            if (poisoned) {
                hp -= 10;
            }
        }

        @Override
        public void healTurn() {
            hp += 5;
        }
    }

    static class Ranger extends RpgHero implements Poisonable {

        private boolean poisoned = false;

        public Ranger(String name, int hp) {
            super(name, hp);
        }

        @Override
        public boolean isPoisoned() {
            return poisoned;
        }

        @Override
        public void tickPoison() {

            if (poisoned) {
                hp -= 5;
            }
        }
    }

    public static void main(String[] args) {

        List<RpgHero> party = new ArrayList<>();

        party.add(new Warrior("Warrior", 100));
        party.add(new Mage("Mage", 60));
        party.add(new Ranger("Ranger", 80));

        for (int turn = 1; turn <= 3; turn++) {

            System.out.println("\n========== ХОД " + turn + " ==========");

            Iterator<RpgHero> it = party.iterator();

            while (it.hasNext()) {

                RpgHero hero = it.next();

                hero.addBuff("HASTE");

                if (hero instanceof Poisonable poisonable
                        && poisonable.isPoisoned()) {

                    poisonable.tickPoison();
                }

                if (hero instanceof Regenerating regenerating) {
                    regenerating.healTurn();
                }

                if (turn == 2 && hero instanceof Warrior) {
                    hero.takeDamage(120);
                }

                if (hero.getHp() <= 0) {

                    System.out.println(
                            hero.getName() + " выбыл из боя!"
                    );

                    it.remove();

                } else {

                    System.out.println(hero);
                }
            }
        }

        System.out.println("\nОставшиеся герои:");

        for (RpgHero hero : party) {
            System.out.println(hero);
        }
    }
}
