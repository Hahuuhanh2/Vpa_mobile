package u4;

/* compiled from: CallbackException */
public final class d extends RuntimeException {
    public d(Throwable th2) {
        super("Unexpected exception thrown by non-Glide code", th2);
    }
}
