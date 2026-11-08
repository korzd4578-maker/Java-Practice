package Practice08;

public class IntRange {
    private int min;
    private int max;

    public IntRange(int min, int max) {
        setRange(min, max);
    }

    public void setRange(int min, int max) {

        if (min <= max) {
            this.min = min;
            this.max = max;
        } else {
            this.min = max;
            this.max = min;
        }
    }

    public boolean contains(int value) {

        return value >= min && value <= max;
    }

    public int getLength() {
        return max - min;
    }

    @Override
    public String toString() {

        return "[" + min + " .. " + max +
                "] (довжина: " + getLength() + ")";
    }
}
