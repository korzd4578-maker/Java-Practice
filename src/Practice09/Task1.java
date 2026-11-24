package Practice09;

public class Task1 {

  public static final class ImmutableGeoPoint {
    private static final double MIN_LAT = -90.0;
    private static final double MAX_LAT = 90.0;
    private static final double MIN_LON = -180.0;
    private static final double MAX_LON = 180.0;

    private final double latitude;
    private final double longitude;

    public ImmutableGeoPoint(double latitude, double longitude) {
      this.latitude = clamp(latitude, MIN_LAT, MAX_LAT);
      this.longitude = clamp(longitude, MIN_LON, MAX_LON);
    }

    private static double clamp(double value, double min, double max) {
      if (value < min) {
        return min;
      }
      if (value > max) {
        return max;
      }
      return value;
    }

    public double getLatitude() {
      return latitude;
    }

    public double getLongitude() {
      return longitude;
    }

    public ImmutableGeoPoint shift(double dLat, double dLon) {
      double updatedLat = this.latitude + dLat;
      double updatedLon = this.longitude + dLon;
      return new ImmutableGeoPoint(updatedLat, updatedLon);
    }

    @Override
    public String toString() {
      return String.format("GeoPoint[lat=%.4f, lon=%.4f]", latitude, longitude);
    }
  }

  public static void main(String[] args) {

    ImmutableGeoPoint startPoint = new ImmutableGeoPoint(95.5, -195.0);
    System.out.println("Початкова точка: " + startPoint);

    ImmutableGeoPoint movedPoint = startPoint.shift(-45.0, 200.0);
    System.out.println("Після зсуву: " + movedPoint);
    System.out.println("Оригінал не змінився: " + startPoint);
  }
}

