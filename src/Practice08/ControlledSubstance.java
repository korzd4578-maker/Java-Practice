package Practice08;

public class ControlledSubstance extends PrescriptionMedicine {
    private int patientAge;

    public ControlledSubstance(String name, double price,
                               boolean isExpired,
                               String doctorLicense,
                               int patientAge) {

        super(name, price, isExpired, doctorLicense);

        this.patientAge = Math.max(0, patientAge);
    }

    @Override
    public boolean canSell(boolean hasPrescription) {

        return super.canSell(hasPrescription)
                && patientAge >= 18;
    }

    @Override
    public String toString() {

        return "ControlledSubstance{" + super.toString() +
                ", patientAge=" + patientAge + "}";
    }
}
