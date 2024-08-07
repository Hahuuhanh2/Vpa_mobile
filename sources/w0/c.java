package w0;

import nd.o;
import y0.g;
import y0.i;

/* compiled from: SnapshotDoubleState.kt */
public class c implements i {

    /* renamed from: a  reason: collision with root package name */
    public a f16267a;

    /* compiled from: SnapshotDoubleState.kt */
    public static final class a extends o {

        /* renamed from: b  reason: collision with root package name */
        public double f16268b;

        public a(double d10) {
            this.f16268b = d10;
        }
    }

    public c(double d10) {
        this.f16267a = new a(d10);
    }

    public final o a() {
        return this.f16267a;
    }

    public final String toString() {
        StringBuilder q10 = android.support.v4.media.a.q("MutableDoubleState(value=");
        q10.append(((a) g.a(this.f16267a)).f16268b);
        q10.append(")@");
        q10.append(hashCode());
        return q10.toString();
    }
}
