package Practice03;
import java.util.Scanner;
public class Exa39 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть команду (start/pause/stop/exit): ");
        String command = scanner.nextLine();
        System.out.println("Порівняння через ==: " + (command == "start"));
        System.out.println("equalsIgnoreCase(start): " + command.equalsIgnoreCase("start"));
        switch (command.toLowerCase()) {
            case "start" -> System.out.println("Система успішно запущена!");
            case "pause" -> System.out.println("Систему призупинено!");
            case "stop" -> System.out.println("Систему зупинено!");
            case "exit" -> System.out.println("Вихід із програми!");
            default -> System.out.println("Невідома команда");
        }
        scanner.close();
    }
}
