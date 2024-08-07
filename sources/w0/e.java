package w0;

import nd.o;
import y0.g;
import y0.i;

/* compiled from: SnapshotIntState.kt */
public class e implements i {

    /* renamed from: a  reason: collision with root package name */
    public a f16271a;

    /* compiled from: SnapshotIntState.kt */
    public static final class a extends o {

        /* renamed from: b  reason: collision with root package name */
        public int f16272b;

        public a(int i10) {
            this.f16272b = i10;
        }
    }

    public e(int i10) {
        this.f16271a = new a(i10);
    }

    public final o a() {
        return this.f16271a;
    }

    public final String toString() {
        StringBuilder q10 = android.support.v4.media.a.q("MutableIntState(value=");
        q10.append(((a) g.a(this.f16271a)).f16272b);
        q10.append(")@");
        q10.append(hashCode());
        return q10.toString();
    }
}
