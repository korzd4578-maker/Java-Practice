package Practice07;

public class Task17 {
    public static void main(String[] args) {
        MathOperations math = new MathOperations();

        System.out.println("Додавання цілих чисел: " + math.add(5, 10));

        System.out.println("Додавання дробових чисел: " + math.add(2.5, 3.5));

        System.out.println("Додавання трьох чисел: " + math.add(1, 2, 3));

        System.out.println("Додавання рядків: " + math.add("Hello", "Java"));

        System.out.println("-------------------");

        System.out.println("Множення цілих чисел: " + math.multiply(4, 5));

        System.out.println("Множення дробових чисел: " + math.multiply(2.5, 4.0));

        System.out.println("Повторення рядка: " + math.multiply("Java ", 3));
    }
}
