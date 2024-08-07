package al;

import al.m1;
import ek.i;
import m9.b;
import p3.l0;

/* compiled from: JobSupport.kt */
public final class v1<T> extends l1 {

    /* renamed from: e  reason: collision with root package name */
    public final l<T> f19099e;

    public v1(m1.a aVar) {
        this.f19099e = aVar;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        m((Throwable) obj);
        return i.f20112a;
    }

    public final void m(Throwable th2) {
        Object M = n().M();
        if (M instanceof u) {
            this.f19099e.resumeWith(l0.A(((u) M).f19094a));
        } else {
            this.f19099e.resumeWith(b.d0(M));
        }
    }
}
