package Practice09;

public class Task35 {
  static class LandPlot {
    private final double totalPlotAreaM2;
    private final Task25.AbstractShape[] structures;
    private int count;

    public LandPlot(double totalPlotAreaM2, int capacity) {
      if (totalPlotAreaM2 <= 0) throw new IllegalArgumentException("Площа має бути додатною");
      this.totalPlotAreaM2 = totalPlotAreaM2;
      structures = new Task25.AbstractShape[capacity];
    }

    public double getBuiltArea() {
      double sum = 0;
      for (int i = 0; i < count; i++) sum += structures[i].getArea();
      return sum;
    }

    public boolean addStructure(Task25.AbstractShape s) {
      if (s == null
          || count == structures.length
          || getBuiltArea() + s.getArea() > totalPlotAreaM2 * 0.6) return false;
      structures[count++] = s;
      return true;
    }

    public double getFreeGreenArea() {
      return totalPlotAreaM2 - getBuiltArea();
    }
  }

  public static void main(String[] args) {
    LandPlot p = new LandPlot(200, 5);
    System.out.println(p.addStructure(new Task25.RectangleShape("House", 10, 10)));
    System.out.println(p.addStructure(new Task25.CircleShape("Garden", 2)));
    System.out.println(p.addStructure(new Task25.RectangleShape("Garage", 10, 5)));
    System.out.println("Газон: " + p.getFreeGreenArea());
  }
}
