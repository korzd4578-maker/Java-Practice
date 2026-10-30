package Practice02;

public class ex30 {
    public static void main(String[] args) {

        int number = 30;
        boolean isDivisibleByBoth = (number % 3 == 0) && (number % 5 == 0);

        System.out.println(number + ": " + isDivisibleByBoth);

        number = 25;
        isDivisibleByBoth = (number % 3 == 0) && (number % 5 == 0);

        System.out.println(number + ": " + isDivisibleByBoth);

    }
}
