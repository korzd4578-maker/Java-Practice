package Practice07;

public class Task21 {
    public static void main(String[] args) {
        ArraySearcher searcher = new ArraySearcher();

        int[] numbers = {10, 20, 30, 40, 50};

        String[] words = {"Java", "Python", "Kotlin", "C++"};

        System.out.println("Пошук числа 30: "
                + searcher.find(numbers, 30));

        System.out.println("Пошук числа 40 з індексу 2: "
                + searcher.find(numbers, 40, 2));

        System.out.println("Пошук слова Python: "
                + searcher.find(words, "Python"));

        System.out.println("Пошук JAVA без урахування регістру: "
                + searcher.find(words, "JAVA", true));

        System.out.println("Пошук відсутнього числа: "
                + searcher.find(numbers, 100));
    }
}
