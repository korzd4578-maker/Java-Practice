package Practice08;

public class Task17 {
    public static void main(String[] args) {
        Manager manager = new Manager(
                "Дмитро",
                30000,
                10000
        );

        SalesPerson seller = new SalesPerson(
                "Максим",
                20000,
                150000,
                5
        );

        System.out.println("Менеджер:");
        System.out.println(manager);

        System.out.println("Зарплата: "
                + manager.calculateMonthlyPay() + " грн");

        System.out.println("-------------------");

        System.out.println("Менеджер з продажів:");
        System.out.println(seller);

        System.out.println("Зарплата: "
                + seller.calculateMonthlyPay() + " грн");
    }
}
