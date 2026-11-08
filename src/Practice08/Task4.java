package Practice08;

public class Task4 {
    public static void main(String[] args) {
        CardWallet wallet = new CardWallet(
                "1234567890124589",
                "1234",
                12500
        );

        System.out.println("Банківський гаманець:");
        System.out.println(wallet);

        System.out.println("-------------------");

        boolean changed = wallet.changePin("1234", "5678");

        System.out.println("PIN змінено: " + changed);

        System.out.println("Після зміни PIN:");
        System.out.println(wallet);
    }
}
