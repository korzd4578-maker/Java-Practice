package Practice04;
import java.util.Scanner;
public class Task31 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть слово з 5 символів: ");
        String word = scanner.nextLine();

        if (word.length() != 5) {
            System.out.println("Слово повинно містити 5 символів!");
            scanner.close();
            return;
        }

        String encrypted = "";

        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            char newChar = (char) (ch + 1);
            encrypted += newChar;
        }

        System.out.println("Початкове слово: " + word);
        System.out.println("Зашифроване слово: " + encrypted);

        scanner.close();
    }
}
