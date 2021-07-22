package valorvsreferencia;

public final class ImmutableMessage {
    private final String message;

    public ImmutableMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    @Override
    public String toString() {
        return "ImmutableMessage{" +
                "message='" + message + '\'' +
                '}';
    }
}
