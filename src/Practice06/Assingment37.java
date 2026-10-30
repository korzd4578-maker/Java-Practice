package Practice06;

public class Assingment37 {
    public static void main(String[] args) {

        ArraySearcher searcher = new ArraySearcher();

        int[] data = {10, 25, 30, 45, 50};

        searcher.setData(data);

        System.out.println("Число 30 існує: " + searcher.contains(30));
        System.out.println("Індекс числа 30: " + searcher.findIndex(30));

        System.out.println("Число 100 існує: " + searcher.contains(100));
        System.out.println("Індекс числа 100: " + searcher.findIndex(100));

    }
}
