package Practice08;

public class Smartphone extends Gadget{
    private int memoryGb;
    private boolean has5G;

    public Smartphone(String brand, double price,
                      int memoryGb, boolean has5G) {

        super(brand, price);

        this.memoryGb = Math.max(1, memoryGb);
        this.has5G = has5G;
    }

    public Smartphone(String brand, double price, int memoryGb) {

        this(brand, price, memoryGb, true);
    }

    public Smartphone(String brand) {

        this(brand, 9999.0, 128, false);
    }

    @Override
    public String toString() {

        return "Smartphone{" + super.toString() +
                ", memory=" + memoryGb +
                " GB, 5G=" + has5G + "}";
    }
}
