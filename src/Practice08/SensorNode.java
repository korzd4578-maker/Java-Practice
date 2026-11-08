package Practice08;

public class SensorNode {
    private String sensorId;
    protected double calibrationOffset;
    private double rawValue;

    public SensorNode(String sensorId, double calibrationOffset, double rawValue) {

        this.sensorId = sensorId;
        this.calibrationOffset = calibrationOffset;
        this.rawValue = rawValue;
    }

    public String getSensorId() {
        return sensorId;
    }

    public double getCalibratedValue() {
        return rawValue + calibrationOffset;
    }

    @Override
    public String toString() {

        return String.format(
                "SensorNode{ID='%s', Raw=%.2f, Calibrated=%.2f}",
                sensorId, rawValue, getCalibratedValue()
        );
    }
}
