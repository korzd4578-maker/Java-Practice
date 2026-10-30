package Practice06;

public class TrafficLight {
    public String currentColor;

    public void changeColor(String newColor) {
        currentColor = newColor;
    }

    public void showSignal() {
        if (currentColor.equals("Червоний")) {
            System.out.println("Стій!");
        } else if (currentColor.equals("Жовтий")) {
            System.out.println("Увага!");
        } else if (currentColor.equals("Зелений")) {
            System.out.println("Їдь!");
        } else {
            System.out.println("Невідомий сигнал!");
        }
    }
}
