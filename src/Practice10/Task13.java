package Practice10;

public class Task13 {

  interface AcousticSignal {
    default String emitAlert() {
      return "Звукова сирена 110 дБ";
    }
  }

  interface OpticalSignal {
    default String emitAlert() {
      return "Стробоскопічний маячок";
    }
  }

  static class EmergencyBeacon implements AcousticSignal, OpticalSignal {
    @Override
    public String emitAlert() {
      return AcousticSignal.super.emitAlert() + " + " + OpticalSignal.super.emitAlert();
    }
  }

  public static void main(String[] args) {
    System.out.println(new EmergencyBeacon().emitAlert());
  }
}
