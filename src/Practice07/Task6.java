package Practice07;

public class Task6 {
    public static void main(String[] args) {
        Time time = new Time(23, 59, 58);

        System.out.println("Початковий час: "
                + time.toUniversalString());

        time.tick();

        System.out.println("Після першої секунди: "
                + time.toUniversalString());

        time.tick();

        System.out.println("Після другої секунди: "
                + time.toUniversalString());

        System.out.println("12-годинний формат: "
                + time.toStandardString());
    }
}
