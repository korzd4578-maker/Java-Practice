package Practice10;

public class Task25 {

  public static void inspect(Task2.Shape2D[] shapes) {
    for (Task2.Shape2D shape : shapes) {
      if (shape instanceof Task2.CircleShape c) System.out.println("Діаметр: " + c.getDiameter());
      else if (shape instanceof Task2.RectangleShape r)
        System.out.println("Діагональ: " + r.getDiagonal() + ", квадрат: " + r.isSquare());
    }
  }

  public static void main(String[] args) {
    inspect(
        new Task2.Shape2D[] {
          new Task2.CircleShape(5),
          new Task2.RectangleShape(3, 4),
          new Task2.RectangleShape(4, 4),
          new Task2.EquilateralTriangleShape(3),
          null
        });
    System.out.println("null instanceof Shape2D: " + (null instanceof Task2.Shape2D));
  }
}
