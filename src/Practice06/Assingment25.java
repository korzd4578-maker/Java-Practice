package Practice06;

public class Assingment25 {
    public static void main(String[] args) {

        SecretVault vault = new SecretVault();

        System.out.println("Правильний код: " + vault.verifyCode("Pass123"));
        System.out.println("Неправильний код: " + vault.verifyCode("hacked"));

    }
}
