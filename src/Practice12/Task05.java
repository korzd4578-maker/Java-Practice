package Practice12;
import java.util.*;
public class Task05 {
    public static void main(String[] args) {
        String text = "Java is fast, Java is safe! "
                + "Collections: List, Set, and Iterator.";

        String cleaned = text
                .replaceAll("[^a-zA-Zа-яА-ЯёЁ0-9\\s]", "")
                .toLowerCase();

        String[] words = cleaned.trim().split("\\s+");

        TreeSet<String> uniqueWords = new TreeSet<>(
                Arrays.asList(words)
        );

        int totalWords = words.length;
        int uniqueCount = uniqueWords.size();

        double diversity = (double) uniqueCount / totalWords * 100;

        System.out.println("Всего слов: " + totalWords);
        System.out.println("Уникальных слов: " + uniqueCount);

        System.out.println("Первое слово: " + uniqueWords.first());
        System.out.println("Последнее слово: " + uniqueWords.last());

        System.out.printf("Лексическое разнообразие: %.2f%%\n",
                diversity);
    }
}
