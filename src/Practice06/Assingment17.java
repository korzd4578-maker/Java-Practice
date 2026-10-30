package Practice06;

public class Assingment17 {
    public static void main(String[] args) {

        SimpleCalculator calculator = new SimpleCalculator();

        int sum = calculator.add(10, 5);
        int difference = calculator.subtract(10, 5);
        int multiplication = calculator.multiply(10, 5);
        double division = calculator.divide(10, 5);

        System.out.println("Сума: " + sum);
        System.out.println("Різниця: " + difference);
        System.out.println("Добуток: " + multiplication);
        System.out.println("Ділення: " + division);

    }
}
