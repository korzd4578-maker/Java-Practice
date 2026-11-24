package Practice12;
import java.util.*;
public class Task19 {
    static class UserSession {

        private final String token;
        private final int idleMinutes;

        public UserSession(String token, int idleMinutes) {
            this.token = token;
            this.idleMinutes = idleMinutes;
        }

        @Override
        public boolean equals(Object obj) {

            if (this == obj) return true;

            if (!(obj instanceof UserSession other)) {
                return false;
            }

            return Objects.equals(token, other.token);
        }

        @Override
        public int hashCode() {
            return Objects.hash(token);
        }

        @Override
        public String toString() {
            return token + " (" + idleMinutes + " мин.)";
        }
    }

    public static int purgeExpiredSessions(
            Set<UserSession> sessions,
            int maxIdleMinutes) {

        Iterator<UserSession> it = sessions.iterator();

        int removed = 0;

        while (it.hasNext()) {

            UserSession session = it.next();

            if (session.idleMinutes > maxIdleMinutes) {
                it.remove();
                removed++;
            }
        }

        return removed;
    }

    public static void main(String[] args) {

        Set<UserSession> activeSessions = new HashSet<>();

        activeSessions.add(new UserSession("TOKEN-1", 2));
        activeSessions.add(new UserSession("TOKEN-2", 15));
        activeSessions.add(new UserSession("TOKEN-3", 30));
        activeSessions.add(new UserSession("TOKEN-4", 45));
        activeSessions.add(new UserSession("TOKEN-5", 60));
        activeSessions.add(new UserSession("TOKEN-6", 90));
        activeSessions.add(new UserSession("TOKEN-7", 120));

        System.out.println("До очистки: " + activeSessions);

        int removed = purgeExpiredSessions(activeSessions, 30);

        System.out.println("Удалено сессий: " + removed);
        System.out.println("После очистки: " + activeSessions);
    }
}
