package Practice08;

public class LinearFunction {
    protected double k;
    protected double b;

    public LinearFunction(double k, double b) {

        this.k = k;
        this.b = b;
    }

    public double evaluate(double x) {

        return k * x + b;
    }

    @Override
    public String toString() {

        return "f(x) = " + k + "x + " + b;
    }
}
