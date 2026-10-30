package PracticeHomework01;

public class Task3Trikutnik {
    public static void main(String[] args) {
        double a = 3.0;
        double b = 4.0;
        double c = 5.0;
        boolean exists = (a + b > c) && (a + c > b) && (b + c > a);
        boolean isEquilateral = exists && (a == b && b == c);
        boolean isIsosceles = exists && (a == b || b == c || a == c);

        boolean isRightAngled = exists && (
                (a * a + b * b == c * c) ||
                        (a * a + c * c == b * b) ||
                        (b * b + c * c == a * a));
        System.out.printf("Сторони трикутника: a = %.1f, b = %.1f, c = %.1f\n", a, b, c);
        System.out.println("----------------------------------------");
        System.out.printf("Чи існує такий трикутник:   %b\n", exists);
        System.out.printf("Чи є рівностороннім:        %b\n", isEquilateral);
        System.out.printf("Чи є рівнобедреним:         %b\n", isIsosceles);
        System.out.printf("Чи є прямокутним:           %b\n", isRightAngled);
    }
}
