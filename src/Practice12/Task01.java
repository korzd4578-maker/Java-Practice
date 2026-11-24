package Practice12;
import java.util.HashSet;
import java.util.Set;
public class Task01 {
    public static void main(String[] args) {
        Set<String> langs = new HashSet<>();

        System.out.println(langs.add("Java"));
        System.out.println(langs.add("Python"));
        System.out.println(langs.add("C++"));
        System.out.println(langs.add("Java"));
        System.out.println(langs.add("Kotlin"));
        System.out.println(langs.add("Python"));

        System.out.println("\nРазмер множества: " + langs.size());

        System.out.println("Есть Java: " + langs.contains("Java"));
        System.out.println("Есть Rust: " + langs.contains("Rust"));

        langs.remove("C++");

        System.out.println("Итоговое множество: " + langs);
    }
}
