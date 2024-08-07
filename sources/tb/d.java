package tb;

import com.google.protobuf.k;

/* compiled from: ApplicationProcessState */
public enum d implements k.a {
    APPLICATION_PROCESS_STATE_UNKNOWN(0),
    FOREGROUND(1),
    BACKGROUND(2),
    FOREGROUND_BACKGROUND(3);
    

    /* renamed from: a  reason: collision with root package name */
    public final int f14921a;

    /* compiled from: ApplicationProcessState */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public static final a f14922a = null;

        static {
            f14922a = new a();
        }
    }

    /* access modifiers changed from: public */
    d(int i10) {
        this.f14921a = i10;
    }

    public final int a() {
        return this.f14921a;
    }
}
