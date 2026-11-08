package Practice07;

public class Task31 {
    public static void main(String[] args) {
        GameSession session1 = GameSession.createSession("Dmytro");

        GameSession session2 = GameSession.createSession("Max");

        GameSession session3 = GameSession.createSession("Vlad");

        System.out.println("-------------------");

        GameSession session4 = GameSession.createSession("Ivan");

        System.out.println("Четверта сесія створена: " + (session4 != null));

        System.out.println("-------------------");

        session1.terminate();

        GameSession session5 = GameSession.createSession("Ivan");

        System.out.println("Нова сесія створена: " + (session5 != null));
    }
}
