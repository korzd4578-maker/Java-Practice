package Practice08;

public class Task29 {
    public static void main(String[] args) {
        ImmutableServerCredentials credentials =
                new ImmutableServerCredentials(
                        "api.example.com",
                        443,
                        "MY_SECRET_API_KEY_123"
                );

        System.out.println("Конфігурація сервера:");

        System.out.println(credentials);

        System.out.println("-------------------");

        System.out.println("Host: " + credentials.getHost());

        System.out.println("Port: " + credentials.getPort());

        System.out.println("API Key: "
                + credentials.getApiKey());

    }
}
