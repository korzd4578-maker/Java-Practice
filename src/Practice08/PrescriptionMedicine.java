package Practice08;

public class PrescriptionMedicine extends Medicine {
    private String doctorLicense;

    public PrescriptionMedicine(String name, double price,
                                boolean isExpired,
                                String doctorLicense) {

        super(name, price, isExpired);

        this.doctorLicense = doctorLicense;
    }

    public boolean canSell(boolean hasPrescription) {

        return !isExpired() && hasPrescription;
    }

    @Override
    public String toString() {

        return "PrescriptionMedicine{" + super.toString() +
                ", license='" + doctorLicense + "'}";
    }
}
