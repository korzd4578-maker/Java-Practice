package Practice08;
public class Task35 {
public static void main(String[] args) {
    LinearFunction linear = new LinearFunction(2, 5);

    QuadraticFunction quadratic =
            new QuadraticFunction(2, -4, 3);

    System.out.println("Лінійна функція:");
    System.out.println(linear);

    System.out.println("f(3) = " + linear.evaluate(3));

    System.out.println("-------------------");

    System.out.println("Квадратична функція:");
    System.out.println(quadratic);

    System.out.println("f(3) = "
            + quadratic.evaluate(3));

    System.out.println("Вершина параболи X0 = "
            + quadratic.getVertexX());
    }
}