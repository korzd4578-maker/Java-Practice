package Practice07;

public class Task39 {
    public static void main(String[] args) {
        Vector3D vector1 = new Vector3D(1, 0, 0);
        Vector3D vector2 = new Vector3D(0, 1, 0);
        Vector3D emptyVector = new Vector3D();
        System.out.println("Перший вектор: " + vector1);
        System.out.println("Другий вектор: " + vector2);
        System.out.println("Нульовий вектор: " + emptyVector);
        System.out.println("-------------------");
        Vector3D sum = vector1.add(vector2);
        System.out.println("Сума векторів: " + sum);
        System.out.println("Скалярний добуток: "
                + vector1.dotProduct(vector2));
        System.out.println("Векторний добуток: "
                + vector1.crossProduct(vector2));
        System.out.println("Вектори ортогональні: "
                + vector1.isOrthogonalTo(vector2));
        System.out.println("Вектори рівні: "
                + vector1.isEqualTo(vector2));
    }
}
