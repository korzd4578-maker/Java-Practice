package Practice06;

public class SecretVault {
    private String secretCode = "Pass123";

    public boolean verifyCode(String attempt) {
        return secretCode.equals(attempt);
    }
}
