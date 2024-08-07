package w0;

import nd.o;
import y0.g;
import y0.i;

/* compiled from: SnapshotLongState.kt */
public class f implements i {

    /* renamed from: a  reason: collision with root package name */
    public a f16273a;

    /* compiled from: SnapshotLongState.kt */
    public static final class a extends o {

        /* renamed from: b  reason: collision with root package name */
        public long f16274b;

        public a(long j10) {
            this.f16274b = j10;
        }
    }

    public f(long j10) {
        this.f16273a = new a(j10);
    }

    public final o a() {
        return this.f16273a;
    }

    public final String toString() {
        StringBuilder q10 = android.support.v4.media.a.q("MutableLongState(value=");
        q10.append(((a) g.a(this.f16273a)).f16274b);
        q10.append(")@");
        q10.append(hashCode());
        return q10.toString();
    }
}
