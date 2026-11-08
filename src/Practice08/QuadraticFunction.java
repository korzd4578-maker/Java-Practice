package Practice08;

public class QuadraticFunction extends LinearFunction {
    private double a;

    public QuadraticFunction(double a, double k, double b) {

        super(k, b);

        this.a = a;
    }

    @Override
    public double evaluate(double x) {

        return a * x * x + super.evaluate(x);
    }

    public double getVertexX() {

        if (a == 0) {
            return 0;
        }

        return -k / (2 * a);
    }

    @Override
    public String toString() {

        return "f(x) = " + a + "x^2 + " +
                k + "x + " + b;
    }
}

