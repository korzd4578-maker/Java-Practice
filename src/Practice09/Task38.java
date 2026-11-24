package Practice09;

public class Task38 {
  static class EmergencySiren {
    private boolean sounding;

    public void activate() {
      sounding = true;
    }

    public boolean isSounding() {
      return sounding;
    }
  }

  static class SmartLab {
    private final EmergencySiren siren = new EmergencySiren();
    private final Task31.AbstractSensor[] sensors;

    public SmartLab(Task31.AbstractSensor[] sensors) {
      this.sensors = sensors.clone();
    }

    public void runDiagnostics() {
      for (Task31.AbstractSensor sensor : sensors) {
        if (sensor == null) continue;
        System.out.println(sensor);
        if (sensor.isAlarmTriggered()) siren.activate();
      }
      System.out.println("Сирена: " + siren.isSounding());
    }
  }

  public static void main(String[] args) {
    SmartLab lab =
        new SmartLab(
            new Task31.AbstractSensor[] {
              new Task31.PressureSensor("Boiler", 7, 1.02), new Task31.RadiationSensor("Lab", 0.8)
            });
    lab.runDiagnostics();
  }
}
