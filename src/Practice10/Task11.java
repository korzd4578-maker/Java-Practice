package Practice10;

public class Task11 {

  interface Flyable {
    void takeOff();

    double getMaxAltitude();
  }

  interface Swimmable {
    void dive(double depthMeters);

    double getMaxDepth();
  }

  interface GpsTrackable {
    String getCoordinates();
  }

  static class AmphibiousRescueDrone implements Flyable, Swimmable, GpsTrackable {
    private double altitude, depth;

    @Override
    public void takeOff() {
      depth = 0;
      altitude = 10;
      System.out.println("Дрон злетів: " + altitude + " м");
    }

    @Override
    public double getMaxAltitude() {
      return 120;
    }

    @Override
    public void dive(double depthMeters) {
      if (depthMeters < 0 || depthMeters > getMaxDepth())
        throw new IllegalArgumentException("Недопустима глибина");
      altitude = 0;
      depth = depthMeters;
      System.out.println("Глибина: " + depth);
    }

    @Override
    public double getMaxDepth() {
      return 30;
    }

    @Override
    public String getCoordinates() {
      return "50.4501, 30.5234";
    }
  }

  static void testFlight(Flyable f) {
    f.takeOff();
    System.out.println("Стеля: " + f.getMaxAltitude());
  }

  static void testDiving(Swimmable s) {
    s.dive(10);
    System.out.println("Максимальна глибина: " + s.getMaxDepth());
  }

  static void logPosition(GpsTrackable g) {
    System.out.println(g.getCoordinates());
  }

  public static void main(String[] args) {
    AmphibiousRescueDrone drone = new AmphibiousRescueDrone();
    testFlight(drone);
    testDiving(drone);
    logPosition(drone);
  }
}
