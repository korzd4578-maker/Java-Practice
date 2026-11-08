package Practice07;

public class Task25 {
    public static void main(String[] args) {
        UserAccount user1 = new UserAccount("dmytro", "dmytro@gmail.com");
        UserAccount user2 = new UserAccount("max", "max@gmail.com");
        UserAccount user3 = new UserAccount("vlad", "vlad@gmail.com");

        user1.printUser();
        user2.printUser();
        user3.printUser();

        System.out.println("Наступний доступний ID: "
                + UserAccount.getNextAvailableId());

        System.out.println("-------------------");

        UserAccount.resetIdSequence(2000);

        System.out.println("Після скидання лічильника: "
                + UserAccount.getNextAvailableId());
    }
}
