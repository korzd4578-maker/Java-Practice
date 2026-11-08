package Practice07;

public class Task23 {
    public static void main(String[] args) {
        SalaryCalculator calculator = new SalaryCalculator();

        System.out.println("Базова зарплата: "
                + calculator.calculate(30000) + " грн");

        System.out.println("Зарплата з фіксованою премією: "
                + calculator.calculate(30000, 5000) + " грн");

        System.out.println("Зарплата з бонусом 10% та податком: "
                + calculator.calculate(30000, 10, true) + " грн");

        System.out.println("Зарплата з понаднормовими годинами: "
                + calculator.calculate(30000, 8, 250) + " грн");
    }
}
