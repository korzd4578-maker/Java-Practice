package Practice06;

public class Assingment22 {
    public static void main(String[] args) {
        Employee employee = new Employee();

        employee.name = "Дмитро";
        employee.baseSalary = 30000;
        employee.bonusPercentage = 15;

        double totalSalary = employee.calculateTotalSalary();
        double tax = employee.calculateTax();

        System.out.println("Працівник: " + employee.name);
        System.out.println("Зарплата з бонусом: " + totalSalary + " грн");
        System.out.println("Податок: " + tax + " грн");
        System.out.println("Зарплата після податків: " + (totalSalary - tax) + " грн");
    }
}
