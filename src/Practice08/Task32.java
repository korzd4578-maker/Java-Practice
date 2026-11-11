package Practice08;

public class Task32 {
    public static void main(String[] args) {
        PrescriptionMedicine medicine = new PrescriptionMedicine(
                "Препарат А", 250, false, "DOC-123"
        );

        ControlledSubstance controlled = new ControlledSubstance(
                "Препарат Б", 500, false, "DOC-456", 20
        );

        ControlledSubstance underage = new ControlledSubstance(
                "Препарат В", 300, false, "DOC-789", 16
        );

        System.out.println("Звичайний рецептурний препарат:");
        System.out.println(medicine);

        System.out.println("Продаж із рецептом: "
                + medicine.canSell(true));

        System.out.println("-------------------");

        System.out.println("Контрольований препарат:");
        System.out.println(controlled);

        System.out.println("Продаж повнолітньому: "
                + controlled.canSell(true));

        System.out.println("-------------------");

        System.out.println("Продаж неповнолітньому: "
                + underage.canSell(true));
    }
}
