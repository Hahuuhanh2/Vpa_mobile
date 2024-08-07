package al;

import al.i1;
import ek.i;
import fl.v;
import ik.d;
import ik.f;
import kotlin.NoWhenBranchMatchedException;
import kotlinx.coroutines.CompletionHandlerException;
import m9.b;
import p3.l0;
import rk.l;
import rk.p;
import sk.j;
import sk.u;

/* compiled from: AbstractCoroutine.kt */
public abstract class a<T> extends m1 implements d<T>, d0 {

    /* renamed from: c  reason: collision with root package name */
    public final f f18986c;

    public a(f fVar, boolean z10) {
        super(z10);
        Q((i1) fVar.get(i1.b.f19045a));
        this.f18986c = fVar.plus(this);
    }

    public final void P(CompletionHandlerException completionHandlerException) {
        c0.a(this.f18986c, completionHandlerException);
    }

    public String W() {
        return super.W();
    }

    public final void Z(Object obj) {
        boolean z10;
        if (obj instanceof u) {
            u uVar = (u) obj;
            Throwable th2 = uVar.f19094a;
            uVar.getClass();
            if (u.f19093b.get(uVar) != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            i0(th2, z10);
            return;
        }
        j0(obj);
    }

    public final f getContext() {
        return this.f18986c;
    }

    public void h0(Object obj) {
        p(obj);
    }

    public void i0(Throwable th2, boolean z10) {
    }

    public boolean isActive() {
        return super.isActive();
    }

    public void j0(T t10) {
    }

    public final void k0(int i10, a aVar, p pVar) {
        f fVar;
        Object b10;
        if (i10 != 0) {
            int i11 = i10 - 1;
            if (i11 == 0) {
                try {
                    g0.g0(g0.b0(g0.K(aVar, this, pVar)), i.f20112a, (l) null);
                } catch (Throwable th2) {
                    resumeWith(l0.A(th2));
                    throw th2;
                }
            } else if (i11 == 1) {
            } else {
                if (i11 == 2) {
                    j.f(pVar, "<this>");
                    g0.b0(g0.K(aVar, this, pVar)).resumeWith(i.f20112a);
                } else if (i11 == 3) {
                    try {
                        fVar = this.f18986c;
                        b10 = v.b(fVar, (Object) null);
                        u.a(2, pVar);
                        Object invoke = pVar.invoke(aVar, this);
                        v.a(fVar, b10);
                        if (invoke != jk.a.COROUTINE_SUSPENDED) {
                            resumeWith(invoke);
                        }
                    } catch (Throwable th3) {
                        resumeWith(l0.A(th3));
                    }
                } else {
                    throw new NoWhenBranchMatchedException();
                }
            }
        } else {
            throw null;
        }
    }

    public final void resumeWith(Object obj) {
        Throwable a10 = ek.f.a(obj);
        if (a10 != null) {
            obj = new u(a10, false);
        }
        Object V = V(obj);
        if (V != b.f13198c) {
            h0(V);
        }
    }

    public final f s() {
        return this.f18986c;
    }

    public final String w() {
        return getClass().getSimpleName() + " was cancelled";
    }
}
