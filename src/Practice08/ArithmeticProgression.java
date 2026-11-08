package Practice08;

public class ArithmeticProgression extends Progression {
    public ArithmeticProgression(double firstTerm, double difference) {

        super(firstTerm, difference);
    }

    @Override
    public double getTerm(int n) {

        return firstTerm + (n - 1) * step;
    }

    @Override
    public String toString() {

        return "ArithmeticProgression{a1=" + firstTerm +
                ", d=" + step +
                ", firstTerms=" +
                java.util.Arrays.toString(generateFirstN(5)) + "}";
    }
}
