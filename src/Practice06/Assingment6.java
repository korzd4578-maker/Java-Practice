package Practice06;

public class Assingment6 {
    public static void main(String[] args) {
        Smartphone phone = new Smartphone();

        phone.model = "Samsung Galaxy";
        phone.batteryLevel = 100;
        phone.isTurnedOn = true;

        phone.batteryLevel -= 35;

        if (phone.batteryLevel <= 0) {
            phone.batteryLevel = 0;
            phone.isTurnedOn = false;
        }

        System.out.println("Модель: " + phone.model);
        System.out.println("Заряд батареї: " + phone.batteryLevel + "%");
        System.out.println("Телефон увімкнений: " + phone.isTurnedOn);
    }
}
