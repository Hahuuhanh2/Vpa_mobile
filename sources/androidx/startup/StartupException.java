package androidx.startup;

public final class StartupException extends RuntimeException {
    public StartupException() {
        super("Context cannot be null");
    }

    public StartupException(Throwable th2) {
        super(th2);
    }
}
