package Practice12;
import java.util.*;
public class Task32 {
    interface Calibratable {
        void calibrate();
    }

    static abstract class AbstractSensor {

        private final String sensorId;
        private boolean active;

        public AbstractSensor(String sensorId, boolean active) {
            this.sensorId = sensorId;
            this.active = active;
        }

        public boolean isActive() {
            return active;
        }

        public String getSensorId() {
            return sensorId;
        }

        @Override
        public boolean equals(Object obj) {

            if (this == obj) return true;

            if (!(obj instanceof AbstractSensor other)) {
                return false;
            }

            return Objects.equals(sensorId, other.sensorId);
        }

        @Override
        public int hashCode() {
            return Objects.hash(sensorId);
        }
    }

    static class TempSensor extends AbstractSensor
            implements Calibratable {

        public TempSensor(String id, boolean active) {
            super(id, active);
        }

        @Override
        public void calibrate() {
            System.out.println("Калибровка температурного датчика "
                    + getSensorId());
        }
    }

    static class MotionSensor extends AbstractSensor
            implements Calibratable {

        public MotionSensor(String id, boolean active) {
            super(id, active);
        }

        @Override
        public void calibrate() {
            System.out.println("Калибровка датчика движения "
                    + getSensorId());
        }
    }

    static class SmokeSensor extends AbstractSensor {

        public SmokeSensor(String id, boolean active) {
            super(id, active);
        }
    }

    static class SmartHomeHub
            implements Iterable<AbstractSensor> {

        private final Set<AbstractSensor> sensors =
                new LinkedHashSet<>();

        public void addSensor(AbstractSensor sensor) {
            sensors.add(sensor);
        }

        public void removeOfflineSensors() {

            Iterator<AbstractSensor> it = sensors.iterator();

            while (it.hasNext()) {

                AbstractSensor sensor = it.next();

                if (!sensor.isActive()) {
                    it.remove();
                }
            }
        }

        public void calibrateAllSupported() {

            for (AbstractSensor sensor : this) {

                if (sensor instanceof Calibratable c) {
                    c.calibrate();
                }
            }
        }

        @Override
        public Iterator<AbstractSensor> iterator() {
            return sensors.iterator();
        }
    }

    public static void main(String[] args) {

        SmartHomeHub hub = new SmartHomeHub();

        hub.addSensor(new TempSensor("TEMP-01", true));
        hub.addSensor(new MotionSensor("MOTION-01", true));
        hub.addSensor(new SmokeSensor("SMOKE-01", true));
        hub.addSensor(new TempSensor("TEMP-02", false));
        hub.addSensor(new MotionSensor("MOTION-02", false));

        System.out.println("Калибровка датчиков:");

        hub.calibrateAllSupported();

        hub.removeOfflineSensors();

        System.out.println("\nАктивные датчики:");

        for (AbstractSensor sensor : hub) {
            System.out.println(sensor.getSensorId());
        }
    }
}
