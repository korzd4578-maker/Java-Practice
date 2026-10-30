package Practice06;

public class Stopwatch {
    public int seconds;

    public void tick() {
        seconds++;
    }

    public void addSeconds(int s) {
        if (s > 0) {
            seconds += s;
        }
    }

    public void displayTime() {
        int minutes = seconds / 60;
        int remainingSeconds = seconds % 60;

        System.out.printf("%02d:%02d%n", minutes, remainingSeconds);
    }
}
