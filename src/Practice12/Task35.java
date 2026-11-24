package Practice12;
import java.util.*;
public class Task35 {
    static final class EmailMessage {

        private final String id;
        private final String senderDomain;
        private final String subject;
        private final double spamScore;

        public EmailMessage(
                String id,
                String senderDomain,
                String subject,
                double spamScore) {

            this.id = id;
            this.senderDomain = senderDomain;
            this.subject = subject;
            this.spamScore = spamScore;
        }

        @Override
        public boolean equals(Object obj) {

            if (this == obj) return true;

            if (!(obj instanceof EmailMessage other)) {
                return false;
            }

            return Objects.equals(id, other.id);
        }

        @Override
        public int hashCode() {
            return Objects.hash(id);
        }

        @Override
        public String toString() {
            return subject + " | " + senderDomain;
        }
    }

    public static void main(String[] args) {

        Set<String> blacklistedDomains = new HashSet<>(
                Arrays.asList(
                        "spam.com",
                        "fake.net"
                )
        );

        List<EmailMessage> inbox = new ArrayList<>();

        inbox.add(new EmailMessage(
                "M1", "gmail.com", "Hello", 0.1
        ));

        inbox.add(new EmailMessage(
                "M2", "spam.com", "Win money", 0.9
        ));

        inbox.add(new EmailMessage(
                "M3", "outlook.com", "Meeting", 0.2
        ));

        inbox.add(new EmailMessage(
                "M4", "gmail.com", "Advertisement", 0.95
        ));

        inbox.add(new EmailMessage(
                "M1", "gmail.com", "Duplicate", 0.1
        ));

        inbox.add(new EmailMessage(
                "M5", "fake.net", "Fake message", 0.4
        ));

        Set<String> seenIds = new HashSet<>();

        int blacklisted = 0;
        int spam = 0;
        int duplicates = 0;

        Iterator<EmailMessage> it = inbox.iterator();

        while (it.hasNext()) {

            EmailMessage email = it.next();

            if (blacklistedDomains.contains(email.senderDomain)) {

                it.remove();
                blacklisted++;

            } else if (email.spamScore >= 0.8) {

                it.remove();
                spam++;

            } else if (!seenIds.add(email.id)) {

                it.remove();
                duplicates++;
            }
        }

        System.out.println("Доставленные письма:");

        for (EmailMessage email : inbox) {
            System.out.println(email);
        }

        System.out.println("\nОтчет:");

        System.out.println("Доставлено: " + inbox.size());
        System.out.println("Черный список: " + blacklisted);
        System.out.println("Спам: " + spam);
        System.out.println("Дубликаты: " + duplicates);

        System.out.println("Всего отфильтровано: "
                + (blacklisted + spam + duplicates));
    }
}
