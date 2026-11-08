package Practice07;

public class Task37 {
    public static void main(String[] args) {
        Hero knight = new Hero("Лицар", 100, 25, 8);

        Hero orc = new Hero("Орк", 120, 20, 5);

        System.out.println("===== ПОЧАТОК ДУЕЛІ =====");

        while (knight.isAlive() && orc.isAlive()) {

            knight.attack(orc);

            if (orc.isAlive()) {
                orc.attack(knight);
            }
        }

        System.out.println("===== РЕЗУЛЬТАТ ДУЕЛІ =====");

        if (knight.isAlive()) {
            System.out.println("Переможець: " + knight.getName());
        } else {
            System.out.println("Переможець: " + orc.getName());
        }
    }
}
