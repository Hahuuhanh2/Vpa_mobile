package el;

import al.e0;
import cl.p;
import ek.i;
import ik.d;
import ik.f;
import ik.g;
import java.util.ArrayList;
import jk.a;
import n0.l;

/* compiled from: ChannelFlow.kt */
public abstract class e<T> implements dl.e {

    /* renamed from: a  reason: collision with root package name */
    public final f f20125a;

    /* renamed from: b  reason: collision with root package name */
    public final int f20126b;

    /* renamed from: c  reason: collision with root package name */
    public final int f20127c;

    public e(f fVar, int i10, int i11) {
        this.f20125a = fVar;
        this.f20126b = i10;
        this.f20127c = i11;
    }

    public final Object a(dl.f<? super T> fVar, d<? super i> dVar) {
        Object b10 = e0.b(new c((d) null, fVar, this), dVar);
        if (b10 == a.COROUTINE_SUSPENDED) {
            return b10;
        }
        return i.f20112a;
    }

    public abstract Object c(p<? super T> pVar, d<? super i> dVar);

    public String toString() {
        ArrayList arrayList = new ArrayList(4);
        if (this.f20125a != g.f20653a) {
            StringBuilder q10 = android.support.v4.media.a.q("context=");
            q10.append(this.f20125a);
            arrayList.add(q10.toString());
        }
        if (this.f20126b != -3) {
            StringBuilder q11 = android.support.v4.media.a.q("capacity=");
            q11.append(this.f20126b);
            arrayList.add(q11.toString());
        }
        if (this.f20127c != 1) {
            StringBuilder q12 = android.support.v4.media.a.q("onBufferOverflow=");
            q12.append(android.support.v4.media.a.A(this.f20127c));
            arrayList.add(q12.toString());
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(getClass().getSimpleName());
        sb2.append('[');
        return l.k(sb2, fk.p.Q0(arrayList, ", ", (String) null, (String) null, (rk.l) null, 62), ']');
    }
}
