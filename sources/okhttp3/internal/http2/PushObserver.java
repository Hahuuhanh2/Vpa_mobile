package okhttp3.internal.http2;

/* compiled from: PushObserver.kt */
public interface PushObserver {

    /* renamed from: a  reason: collision with root package name */
    public static final PushObserver f22527a = new Companion.PushObserverCancel();

    /* compiled from: PushObserver.kt */
    public static final class Companion {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int f22528a = 0;

        /* compiled from: PushObserver.kt */
        public static final class PushObserverCancel implements PushObserver {
        }

        static {
            new Companion();
        }

        private Companion() {
        }
    }

    static {
        int i10 = Companion.f22528a;
    }
}
