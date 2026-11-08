package Practice08;

public class SecurityTerminal {
    public final String generateAuthHash(String user) {

        return "AUTH-SHA-" + user.toUpperCase();
    }

    public String getWelcomeBanner() {

        return "Ласкаво просимо до системи безпеки!";
    }
}
