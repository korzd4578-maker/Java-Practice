package PracticeHomework01;

public class Task5DotaHero {
    public static void main(String[] args) {
        String PlayerName = "Shadow Fiend(Nevermore)";
        String PlayerClass = "Agility / Спритність";

        int strength = 19 + (int) (Math.random()) * 5 ;
        int agility = 20 + (int) (Math.random()) * 5 ;
        int intelligence = 18 + (int) (Math.random()) *5 ;

        int hp = strength * 10 + agility * 2;
        int mp = intelligence * 15;
        int armor = agility / 2 ;

        int dice1 = (int) (Math.random() * 6) + 1;
        int dice2 = (int) (Math.random() * 6) + 1;

        int playerAttack = dice1 + dice2 + strength;

        final int MONSTER_ATTACK = 26;

        boolean isPlayerVictory = playerAttack > MONSTER_ATTACK;
        // Потужний вивод
        System.out.println("/**************************************************\\");
        System.out.println("|                 ПАСПОРТ ГЕРОЯ DOTA2               |");
        System.out.println("\\**************************************************/");
        System.out.printf("Ім'я персонажа:         %s\n", PlayerName);
        System.out.printf("Клас:                   %s\n\n", PlayerClass);

        System.out.println("[ХАРАКТЕРИСТИКИ]");
        System.out.printf("Сила (STR):             %d\n", strength);
        System.out.printf("Спритність (AGI):       %d\n", agility);
        System.out.printf("Інтелект (INT):         %d\n\n", intelligence);

        System.out.println("[ПОХІДНІ АТРИБУТИ]");
        System.out.printf("Очки здоров'я (HP):     %d\n", hp);
        System.out.printf("Очки мани (MP):         %d\n", mp);
        System.out.printf("Клас броні (Armor):     %d\n\n", armor);

        System.out.println("[СИМУЛЯЦІЯ БОЮ]");
        System.out.printf("Кидок кубиків гравця:   %d + %d (бонус сили: +%d)\n", dice1, dice2, strength);
        System.out.printf("Загальна атака гравця:  %d\n", playerAttack);
        System.out.printf("Сила удару монстра:     %d\n", MONSTER_ATTACK);
        System.out.printf("Чи переміг гравець?     %b\n", isPlayerVictory);
        System.out.println("\\**************************************************/");

    }
}
