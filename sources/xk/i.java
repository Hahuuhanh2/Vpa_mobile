package xk;

import al.g0;
import java.util.Iterator;
import rk.p;
import sk.j;

/* compiled from: Sequences.kt */
public final class i implements e<Object> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ p f23498a;

    public i(p pVar) {
        this.f23498a = pVar;
    }

    public final Iterator<Object> iterator() {
        p pVar = this.f23498a;
        j.f(pVar, "block");
        f fVar = new f();
        fVar.f23497d = g0.K(fVar, fVar, pVar);
        return fVar;
    }
}
