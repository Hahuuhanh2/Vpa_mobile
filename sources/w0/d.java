package w0;

import nd.o;
import y0.g;
import y0.i;

/* compiled from: SnapshotFloatState.kt */
public class d implements i {

    /* renamed from: a  reason: collision with root package name */
    public a f16269a;

    /* compiled from: SnapshotFloatState.kt */
    public static final class a extends o {

        /* renamed from: b  reason: collision with root package name */
        public float f16270b;

        public a(float f10) {
            this.f16270b = f10;
        }
    }

    public d(float f10) {
        this.f16269a = new a(f10);
    }

    public final o a() {
        return this.f16269a;
    }

    public final String toString() {
        StringBuilder q10 = android.support.v4.media.a.q("MutableFloatState(value=");
        q10.append(((a) g.a(this.f16269a)).f16270b);
        q10.append(")@");
        q10.append(hashCode());
        return q10.toString();
    }
}
