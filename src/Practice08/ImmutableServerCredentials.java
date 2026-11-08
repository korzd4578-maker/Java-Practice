package Practice08;

public class ImmutableServerCredentials {
    private final String host;
    private final int port;
    private final String apiKey;

    public ImmutableServerCredentials(String host, int port, String apiKey) {

        this.host = host;
        this.port = Math.max(1, port);
        this.apiKey = apiKey;
    }

    public String getHost() {
        return host;
    }

    public int getPort() {
        return port;
    }

    public String getApiKey() {
        return apiKey;
    }

    @Override
    public String toString() {

        return "ImmutableServerCredentials{" +
                "host='" + host + '\'' +
                ", port=" + port +
                ", apiKey='***SECRET***'}";
    }
}
