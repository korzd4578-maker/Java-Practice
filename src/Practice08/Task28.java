package Practice08;

public class Task28 {
    public static void main(String[] args) {
        CustomTerminal terminal = new CustomTerminal();

        System.out.println(terminal.getWelcomeBanner());

        System.out.println("-------------------");

        System.out.println("Auth Hash:");

        System.out.println(
                terminal.generateAuthHash("Dmytro")
        );
    }
}
