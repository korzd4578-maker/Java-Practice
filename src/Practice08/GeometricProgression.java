package Practice08;

public class GeometricProgression extends ArithmeticProgression {
    public GeometricProgression(double firstTerm, double ratio) {

        super(firstTerm, ratio);
    }

    @Override
    public double getTerm(int n) {

        return firstTerm * Math.pow(step, n - 1);
    }

    @Override
    public String toString() {

        return "GeometricProgression{b1=" + firstTerm +
                ", q=" + step +
                ", firstTerms=" +
                java.util.Arrays.toString(generateFirstN(5)) + "}";
    }
}
