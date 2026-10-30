package Practice06;

public class Assingment34 {
    public static void main(String[] args) {

        ArrayStats stats = new ArrayStats();

        int[] numbers = {5, 8, 12, 7, 3, 10, 15, 20, 6, 9};

        stats.setNumbers(numbers);

        System.out.println("Парних чисел: " + stats.countEvens());
        System.out.println("Непарних чисел: " + stats.countOdds());
        System.out.println("Сума елементів: " + stats.calculateSum());

    }
}
