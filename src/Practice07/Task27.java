package Practice07;

public class Task27 {
    public static void main(String[] args) {
        System.out.println("PI = " + MathUtils.PI);
        System.out.println("E = " + MathUtils.E);

        System.out.println("-------------------");

        System.out.println("Факторіал 5: "
                + MathUtils.factorial(5));

        System.out.println("2 у степені -3: "
                + MathUtils.power(2, -3));

        System.out.println("НСД чисел 48 та 18: "
                + MathUtils.gcd(48, 18));

        System.out.println("Обмеження числа 120 у діапазоні 0–100: "
                + MathUtils.clamp(120, 0, 100));
    }
}
