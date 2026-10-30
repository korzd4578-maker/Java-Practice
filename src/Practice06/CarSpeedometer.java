package Practice06;

public class CarSpeedometer {
    private int speed = 0;

    public void accelerate(int delta) {
        if (delta > 0) {
            speed += delta;

            if (speed > 240) {
                speed = 240;
            }
        }
    }

    public void brake(int delta) {
        if (delta > 0) {
            speed -= delta;

            if (speed < 0) {
                speed = 0;
            }
        }
    }

    public int getSpeed() {
        return speed;
    }
}
