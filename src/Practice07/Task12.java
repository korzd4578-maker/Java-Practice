package Practice07;

public class Task12 {
    public static void main(String[] args) {
        SmartBulb bulb1 = new SmartBulb();
        SmartBulb bulb2 = new SmartBulb(75);
        SmartBulb bulb3 = new SmartBulb(90, 6000, false);

        System.out.println("Перша лампочка:");
        bulb1.printStatus();

        System.out.println("Друга лампочка:");
        bulb2.printStatus();

        System.out.println("Третя лампочка:");
        bulb3.printStatus();
    }
}
