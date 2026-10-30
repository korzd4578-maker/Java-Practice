package Practice06;

public class Assingment23 {
    public static void main(String[] args) {

        TextFormatter formatter = new TextFormatter();

        String text = "Програмування";

        System.out.println(formatter.formatTitle(text));
        System.out.println("Кількість голосних: " + formatter.countVowels(text));

    }
}
