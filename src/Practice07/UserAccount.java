package Practice07;

public class UserAccount {
    private int id;
    private String username;
    private String email;

    private static int nextId = 1001;

    public UserAccount(String username, String email) {

        this.id = nextId++;
        this.username = username;
        this.email = email;
    }

    public static int getNextAvailableId() {
        return nextId;
    }

    public static void resetIdSequence(int startId) {

        if (startId > 0) {
            nextId = startId;
        }
    }

    public void printUser() {

        System.out.println("ID: " + id);
        System.out.println("Логін: " + username);
        System.out.println("Email: " + email);
        System.out.println("-------------------");
    }
}
