package Practice08;

public class Task21 {
    public static void main(String[] args) {
        Parcel parcel = new Parcel(
                "UA123456",
                5
        );

        FragileParcel fragile = new FragileParcel(
                "UA987654",
                5,
                true,
                10000
        );

        System.out.println("Звичайна посилка:");
        System.out.println(parcel);

        System.out.println("-------------------");

        System.out.println("Крихка посилка:");
        System.out.println(fragile);

        System.out.println("Вартість доставки: "
                + fragile.calculateShippingCost() + " грн");
    }
}
