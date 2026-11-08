package Practice07;

public class Fraction {
    private int numerator;
    private int denominator;

    public Fraction(int numerator, int denominator) {

        if (denominator == 0) {
            System.out.println("Помилка: знаменник не може дорівнювати нулю!");
            denominator = 1;
        }

        if (denominator < 0) {
            numerator = -numerator;
            denominator = -denominator;
        }

        int gcd = findGCD(Math.abs(numerator), Math.abs(denominator));

        this.numerator = numerator / gcd;
        this.denominator = denominator / gcd;
    }

    public Fraction(int wholeNumber) {
        this(wholeNumber, 1);
    }

    public Fraction() {
        this(0, 1);
    }

    private int findGCD(int a, int b) {

        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }

        return a == 0 ? 1 : a;
    }

    public void print() {

        if (denominator == 1) {
            System.out.println(numerator);
        } else {
            System.out.println(numerator + "/" + denominator);
        }
    }

    public double toDouble() {
        return (double) numerator / denominator;
    }
}
