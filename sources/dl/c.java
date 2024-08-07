package dl;

import android.support.v4.media.a;
import ek.i;
import el.e;
import ik.d;
import ik.f;
import rk.p;

/* compiled from: Builders.kt */
public class c<T> extends e<T> {

    /* renamed from: d  reason: collision with root package name */
    public final p<cl.p<? super T>, d<? super i>, Object> f19966d;

    public c(u3.c cVar, f fVar, int i10, int i11) {
        super(fVar, i10, i11);
        this.f19966d = cVar;
    }

    public final String toString() {
        StringBuilder q10 = a.q("block[");
        q10.append(this.f19966d);
        q10.append("] -> ");
        q10.append(super.toString());
        return q10.toString();
    }
}
