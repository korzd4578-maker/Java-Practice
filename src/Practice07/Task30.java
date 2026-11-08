package Practice07;

public class Task30 {
    public static void main(String[] args) {
        String text = "А роза упала на лапу Азора";

        System.out.println("Перевірка паліндрому:");
        System.out.println(StringUtils.isPalindrome(text));

        System.out.println("-------------------");

        System.out.println("Перевернутий рядок:");
        System.out.println(StringUtils.reverse("Java Programming"));

        System.out.println("-------------------");

        System.out.println("Кількість голосних:");
        System.out.println(StringUtils.countVowels("Programming"));

        System.out.println("-------------------");

        System.out.println("Номер картки:");
        System.out.println(StringUtils.maskCardNumber("1234 5678 9012 3456"));
    }
}
