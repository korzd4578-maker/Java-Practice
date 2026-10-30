package Practice06;

public class Assingment26 {
    public static void main(String[] args) {

        UserAccount account = new UserAccount();

        account.setCredentials("Dmytro", "12345");

        System.out.println("Авторизація: " + account.login("Dmytro", "12345"));

        account.changePassword("12345", "54321");

        System.out.println("Авторизація зі старим паролем: "
                + account.login("Dmytro", "12345"));

        System.out.println("Авторизація з новим паролем: "
                + account.login("Dmytro", "54321"));

    }
}
