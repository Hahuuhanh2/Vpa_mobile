package cl;

import al.f2;
import ek.i;
import fl.s;
import ik.f;
import java.util.concurrent.atomic.AtomicReferenceArray;
import rk.l;
import u9.b;

/* compiled from: BufferedChannel.kt */
public final class j<E> extends s<j<E>> {

    /* renamed from: e  reason: collision with root package name */
    public final a<E> f19258e;

    /* renamed from: f  reason: collision with root package name */
    public final AtomicReferenceArray f19259f = new AtomicReferenceArray(d.f19233b * 2);

    public j(long j10, j<E> jVar, a<E> aVar, int i10) {
        super(j10, jVar, i10);
        this.f19258e = aVar;
    }

    public final int f() {
        return d.f19233b;
    }

    public final void g(int i10, f fVar) {
        boolean z10;
        b bVar;
        int i11 = d.f19233b;
        if (i10 >= i11) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            i10 -= i11;
        }
        Object obj = this.f19259f.get(i10 * 2);
        while (true) {
            Object k10 = k(i10);
            if ((k10 instanceof f2) || (k10 instanceof t)) {
                if (z10) {
                    bVar = d.f19241j;
                } else {
                    bVar = d.f19242k;
                }
                if (j(i10, k10, bVar)) {
                    m(i10, (Object) null);
                    l(i10, !z10);
                    if (z10) {
                        a<E> aVar = this.f19258e;
                        sk.j.c(aVar);
                        l<E, i> lVar = aVar.f19217b;
                        if (lVar != null) {
                            m9.b.f(lVar, obj, fVar);
                            return;
                        }
                        return;
                    }
                    return;
                }
            } else if (k10 == d.f19241j || k10 == d.f19242k) {
                m(i10, (Object) null);
            } else if (!(k10 == d.f19238g || k10 == d.f19237f)) {
                if (k10 != d.f19240i && k10 != d.f19235d && k10 != d.f19243l) {
                    throw new IllegalStateException(("unexpected state: " + k10).toString());
                }
                return;
            }
        }
        m(i10, (Object) null);
        if (z10) {
            a<E> aVar2 = this.f19258e;
            sk.j.c(aVar2);
            l<E, i> lVar2 = aVar2.f19217b;
            if (lVar2 != null) {
                m9.b.f(lVar2, obj, fVar);
            }
        }
    }

    public final boolean j(int i10, Object obj, Object obj2) {
        AtomicReferenceArray atomicReferenceArray = this.f19259f;
        int i11 = (i10 * 2) + 1;
        while (!atomicReferenceArray.compareAndSet(i11, obj, obj2)) {
            if (atomicReferenceArray.get(i11) != obj) {
                return false;
            }
        }
        return true;
    }

    public final Object k(int i10) {
        return this.f19259f.get((i10 * 2) + 1);
    }

    public final void l(int i10, boolean z10) {
        if (z10) {
            a<E> aVar = this.f19258e;
            sk.j.c(aVar);
            aVar.L((this.f20261c * ((long) d.f19233b)) + ((long) i10));
        }
        h();
    }

    public final void m(int i10, Object obj) {
        this.f19259f.lazySet(i10 * 2, obj);
    }

    public final void n(int i10, b bVar) {
        this.f19259f.set((i10 * 2) + 1, bVar);
    }
}
