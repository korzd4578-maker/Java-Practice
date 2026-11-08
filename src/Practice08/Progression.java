package Practice08;

public class Progression {
    protected double firstTerm;
    protected double step;

    public Progression(double firstTerm, double step) {

        this.firstTerm = firstTerm;
        this.step = step;
    }

    public double getTerm(int index) {
        return firstTerm;
    }

    public double[] generateFirstN(int n) {

        if (n < 0) {
            n = 0;
        }

        double[] result = new double[n];

        for (int i = 0; i < n; i++) {
            result[i] = getTerm(i + 1);
        }

        return result;
    }

    @Override
    public String toString() {

        return "Progression{firstTerm=" + firstTerm +
                ", step=" + step + "}";
    }
}
