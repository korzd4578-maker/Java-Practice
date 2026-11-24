package Practice12;
import java.util.*;
public class Task15 {
    static class ServerNode implements Comparable<ServerNode> {

        private final String hostName;
        private final int pingMs;
        private final double cpuLoad;

        public ServerNode(
                String hostName,
                int pingMs,
                double cpuLoad) {

            this.hostName = hostName;
            this.pingMs = pingMs;
            this.cpuLoad = cpuLoad;
        }

        @Override
        public int compareTo(ServerNode other) {

            int result = Integer.compare(
                    this.pingMs, other.pingMs
            );

            if (result == 0) {
                result = this.hostName.compareTo(other.hostName);
            }

            return result;
        }

        @Override
        public String toString() {
            return hostName
                    + " | Ping: " + pingMs + " ms"
                    + " | CPU: " + cpuLoad + "%";
        }
    }

    public static void main(String[] args) {

        TreeSet<ServerNode> pingRanking = new TreeSet<>();

        pingRanking.add(new ServerNode("Server-A", 35, 60.5));
        pingRanking.add(new ServerNode("Server-B", 20, 75.0));
        pingRanking.add(new ServerNode("Server-C", 50, 40.0));
        pingRanking.add(new ServerNode("Server-D", 20, 30.0));

        TreeSet<ServerNode> cpuRanking = new TreeSet<>(
                Comparator.comparingDouble(
                        (ServerNode s) -> s.cpuLoad
                ).reversed().thenComparing(s -> s.hostName)
        );

        cpuRanking.addAll(pingRanking);

        System.out.println("Рейтинг по Ping:");

        for (ServerNode server : pingRanking) {
            System.out.println(server);
        }

        System.out.println("\nРейтинг по CPU:");

        for (ServerNode server : cpuRanking) {
            System.out.println(server);
        }
    }
}
