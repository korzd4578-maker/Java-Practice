package Practice07;

public class GameSession {
    private String sessionToken;
    private String hostPlayer;
    private boolean isActive;

    private static int activeSessionsCount = 0;
    private static int nextSessionId = 1;

    public static final int MAX_SESSIONS = 3;

    private GameSession(String host) {

        this.hostPlayer = host;
        this.sessionToken = "SESSION-" + nextSessionId++;
        this.isActive = true;
    }

    public static GameSession createSession(String host) {

        if (activeSessionsCount >= MAX_SESSIONS) {

            System.out.println("Помилка: усі сервера перевантажені!");

            return null;
        }

        activeSessionsCount++;

        System.out.println("Ігрову сесію створено для " + host);

        return new GameSession(host);
    }

    public void terminate() {

        if (isActive) {

            isActive = false;
            activeSessionsCount--;

            System.out.println("Сесію " + sessionToken + " завершено.");
        }
    }
}
