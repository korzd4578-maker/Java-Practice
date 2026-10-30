package Practice02;

public class ex31 {
    public static void main(String[] args) {

        boolean hasPassword = true;
        boolean hasSmsCode = true;
        boolean isAccountBlocked = false;

        boolean canLogin = hasPassword && hasSmsCode && !isAccountBlocked;

        System.out.println("Доступ до системи: " + canLogin);

    }
}
