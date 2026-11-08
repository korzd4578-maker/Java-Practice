package Practice07;

public class User {
    private String login;
    private String email;
    private String role;
    private boolean isActive;

    public User(String login, String email, String role, boolean isActive) {
        this.login = login;
        this.email = email;
        this.role = role;
        this.isActive = isActive;
    }

    public User(String login, String email) {
        this(login, email, "USER", true);
    }

    public User(String login) {
        this(login, login + "@domain.com");
    }

    public User() {
        this("guest");
    }

    public void printProfile() {
        System.out.println("Логін: " + login);
        System.out.println("Email: " + email);
        System.out.println("Роль: " + role);
        System.out.println("Активний: " + isActive);
        System.out.println("-------------------");
    }
}
