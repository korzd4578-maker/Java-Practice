package Practice07;

public class SmartBulb {
    private int brightness;
    private int colorTemp;
    private boolean isOn;

    public SmartBulb(int brightness, int colorTemp, boolean isOn) {

        if (brightness < 0 || brightness > 100) {
            this.brightness = 50;
        } else {
            this.brightness = brightness;
        }

        if (colorTemp < 2700 || colorTemp > 6500) {
            this.colorTemp = 4000;
        } else {
            this.colorTemp = colorTemp;
        }

        this.isOn = isOn;
    }

    public SmartBulb(int brightness) {
        this(brightness, 4000, true);
    }

    public SmartBulb() {
        this(50);
    }

    public void printStatus() {

        System.out.println("Яскравість: " + brightness + "%");
        System.out.println("Температура кольору: " + colorTemp + " K");
        System.out.println("Стан: " + (isOn ? "Увімкнена" : "Вимкнена"));
        System.out.println("-------------------");
    }
}
