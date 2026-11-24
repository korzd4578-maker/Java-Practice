package Homework;
class Fraction {
    private int numerator;
    private int denominator;

    public void setValues(int num, int den) {
        if (den == 0) {
            System.out.println("Помилка: знаменник не може дорівнювати 0!");
            this.numerator = num;
            this.denominator = 1;
            return;
        }
        if (den < 0) {
            this.numerator = -num;
            this.denominator = -den;
        } else {
            this.numerator = num;
            this.denominator = den;
        }
    }

    private int gcd(int a, int b) {
        a = Math.abs(a);
        b = Math.abs(b);
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public void simplify() {
        int common = gcd(numerator, denominator);
        numerator /= common;
        denominator /= common;
    }

    public double toDecimal() {
        return (double) numerator / denominator;
    }

    public void add(int otherNum, int otherDen) {
        this.numerator = this.numerator * otherDen + otherNum * this.denominator;
        this.denominator = this.denominator * otherDen;
        simplify();
    }

    public void printFraction() {
        if (denominator == 1) {
            System.out.print(numerator);
        } else {
            System.out.print(numerator + "/" + denominator);
        }
    }
}

public class Task1Fraction {
    public static void main(String[] args) {
        System.out.println("=== КАЛЬКУЛЯТОР ЗВИЧАЙНИХ ДРОБІВ ===");
        Fraction f1 = new Fraction();
        f1.setValues(8, 12);

        System.out.print("Дріб 1: ");
        f1.printFraction();
        System.out.println();

        f1.simplify();
        System.out.print("Після скорочення: ");
        f1.printFraction();
        System.out.printf(" (десятковий вигляд: %.4f)\n\n", f1.toDecimal());

        System.out.println("Додаємо дріб 3/4 до 2/3...");
        f1.add(3, 4);
        System.out.print("Результат додавання: ");
        f1.printFraction();
        System.out.printf(" (десятковий вигляд: %.4f)\n", f1.toDecimal());
        System.out.println("=====================================");
    }
}
