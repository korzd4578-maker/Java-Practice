package Practice07;

public class Task9 {
    public static void main(String[] args) {
        User user1 = new User();
        User user2 = new User("dmytro");
        User user3 = new User("max", "max@gmail.com");
        User user4 = new User("admin", "admin@gmail.com", "ADMIN", false);

        user1.printProfile();
        user2.printProfile();
        user3.printProfile();
        user4.printProfile();
    }
}
