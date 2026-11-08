package Practice07;

public class Task26 {
    public static void main(String[] args) {
        System.out.println("Сервер: " + ServerConfig.SERVER_NAME);

        for (int i = 1; i <= 6; i++) {

            boolean connected = ServerConfig.connect();

            if (connected) {
                System.out.println("Користувач " + i + " підключений.");
            } else {
                System.out.println("Користувач " + i + ": відмова! Ліміт вичерпано.");
            }
        }

        System.out.println("-------------------");

        ServerConfig.printServerStatus();

        ServerConfig.disconnect();

        System.out.println("-------------------");

        System.out.println("Після відключення користувача:");

        ServerConfig.printServerStatus();
    }
}
