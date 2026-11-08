package Practice07;

public class Task22 {
    public static void main(String[] args) {
        DateService date = new DateService(15, 3, 2024);

        System.out.println("Початкова дата:");
        date.printDate();

        System.out.println("-------------------");

        System.out.println("Після додавання 20 днів:");
        date.add(20);
        date.printDate();

        System.out.println("-------------------");

        System.out.println("Після додавання 3 місяців:");
        date.add(0, 3);
        date.printDate();

        System.out.println("-------------------");

        System.out.println("Після додавання 5 днів, 1 місяця та 2 років:");
        date.add(5, 1, 2);
        date.printDate();
    }
}
