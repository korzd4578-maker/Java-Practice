package Practice04;

public class Task29 {
    public static void main(String[] args) {
        byte b = 125;

        for (int i = 1; i <= 6; i++) {
            b = (byte) (b + 1);
            System.out.println("Крок " + i + ": " + b);
        }

        System.out.println("Тип byte має діапазон від -128 до 127.");
        System.out.println("Після 127 значення переходить до -128.");
    }
}
