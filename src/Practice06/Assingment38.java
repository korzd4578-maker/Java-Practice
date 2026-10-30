package Practice06;

public class Assingment38 {
    public static void main(String[] args) {

        Vector3D vector = new Vector3D();

        vector.setCoords(2, 3, 6);

        System.out.print("Початковий вектор: ");
        vector.printVector();

        System.out.println("Довжина вектора: " + vector.getMagnitude());

        vector.multiplyByScalar(2);

        System.out.print("Вектор після множення на 2: ");
        vector.printVector();

    }
}
