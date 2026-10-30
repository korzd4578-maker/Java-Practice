package Practice02;

public class ex19 {
    public static void main(String[] args) {

        int n = 47;
        int tens = n / 10;
        int units = n % 10;
        int sum = tens + units;

        System.out.println("Число: " + n + ". Десятки: " + tens + ", Одиниці: " + units + ". Сума цифр: " + sum);

    }
}
