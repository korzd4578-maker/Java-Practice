package Practice06;

public class Assingment20 {
    public static void main(String[] args) {

        NumberChecker checker = new NumberChecker();

        int[] numbers = {7, 12, -5};

        for (int number : numbers) {
            System.out.println("Число: " + number);
            System.out.println("Парне: " + checker.isEven(number));
            System.out.println("Додатне: " + checker.isPositive(number));
            System.out.println("Просте: " + checker.isPrime(number));
            System.out.println("----------------------");
        }

    }
}
