package Practice07;

public class Task10 {
    public static void main(String[] args) {

            Fraction fraction1 = new Fraction(8, 12);
            Fraction fraction2 = new Fraction(5);
            Fraction fraction3 = new Fraction();

            System.out.println("Перший дріб:");
            fraction1.print();
            System.out.println("Десяткове значення: " + fraction1.toDouble());

            System.out.println("-------------------");

            System.out.println("Другий дріб:");
            fraction2.print();
            System.out.println("Десяткове значення: " + fraction2.toDouble());

            System.out.println("-------------------");

            System.out.println("Третій дріб:");
            fraction3.print();
            System.out.println("Десяткове значення: " + fraction3.toDouble());

    }
}
