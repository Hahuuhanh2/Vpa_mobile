package w0;

import nd.o;
import y0.i;

/* compiled from: SnapshotState.kt */
public class g<T> implements i {

    /* renamed from: a  reason: collision with root package name */
    public final h<T> f16275a;

    /* renamed from: b  reason: collision with root package name */
    public a<T> f16276b;

    /* compiled from: SnapshotState.kt */
    public static final class a<T> extends o {

        /* renamed from: b  reason: collision with root package name */
        public T f16277b;

        public a(T t10) {
            this.f16277b = t10;
        }
    }

    public g(T t10, h<T> hVar) {
        this.f16275a = hVar;
        this.f16276b = new a<>(t10);
    }

    public final o a() {
        return this.f16276b;
    }

    public final String toString() {
        StringBuilder q10 = android.support.v4.media.a.q("MutableState(value=");
        q10.append(((a) y0.g.a(this.f16276b)).f16277b);
        q10.append(")@");
        q10.append(hashCode());
        return q10.toString();
    }
}
