package okhttp3.internal.http2;

/* compiled from: ErrorCode.kt */
public enum ErrorCode {
    NO_ERROR(0),
    PROTOCOL_ERROR(1),
    INTERNAL_ERROR(2),
    FLOW_CONTROL_ERROR(3),
    REFUSED_STREAM(7),
    CANCEL(8);
    

    /* renamed from: b  reason: collision with root package name */
    public static final Companion f22361b = null;

    /* renamed from: a  reason: collision with root package name */
    public final int f22369a;

    /* compiled from: ErrorCode.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(int i10) {
            this();
        }
    }

    /* access modifiers changed from: public */
    static {
        f22361b = new Companion(0);
    }

    /* access modifiers changed from: public */
    ErrorCode(int i10) {
        this.f22369a = i10;
    }
}
