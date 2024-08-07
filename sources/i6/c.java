package i6;

/* compiled from: LogEventDropped */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public final long f11170a;

    /* renamed from: b  reason: collision with root package name */
    public final a f11171b;

    /* compiled from: LogEventDropped */
    public enum a implements va.c {
        REASON_UNKNOWN(0),
        MESSAGE_TOO_OLD(1),
        CACHE_FULL(2),
        PAYLOAD_TOO_BIG(3),
        MAX_RETRIES_REACHED(4),
        INVALID_PAYLOD(5),
        SERVER_ERROR(6);
        

        /* renamed from: a  reason: collision with root package name */
        public final int f11180a;

        /* access modifiers changed from: public */
        a(int i10) {
            this.f11180a = i10;
        }

        public final int a() {
            return this.f11180a;
        }
    }

    public c(long j10, a aVar) {
        this.f11170a = j10;
        this.f11171b = aVar;
    }
}
