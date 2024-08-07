package al;

import al.i1;
import ek.i;
import fl.s;
import ik.f;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import jk.a;
import kk.d;
import kotlinx.coroutines.CompletionHandlerException;
import sk.j;
import u9.b;

/* compiled from: CancellableContinuationImpl.kt */
public class l<T> extends p0<T> implements k<T>, d, f2 {

    /* renamed from: f  reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f19047f = AtomicIntegerFieldUpdater.newUpdater(l.class, "_decisionAndIndex");

    /* renamed from: n  reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f19048n;

    /* renamed from: o  reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f19049o;
    private volatile int _decisionAndIndex = 536870911;
    private volatile Object _parentHandle;
    private volatile Object _state = b.f18991a;

    /* renamed from: d  reason: collision with root package name */
    public final ik.d<T> f19050d;

    /* renamed from: e  reason: collision with root package name */
    public final f f19051e;

    static {
        Class<Object> cls = Object.class;
        f19048n = AtomicReferenceFieldUpdater.newUpdater(l.class, cls, "_state");
        f19049o = AtomicReferenceFieldUpdater.newUpdater(l.class, cls, "_parentHandle");
    }

    public l(int i10, ik.d dVar) {
        super(i10);
        this.f19050d = dVar;
        this.f19051e = dVar.getContext();
    }

    public static Object C(t1 t1Var, Object obj, int i10, rk.l lVar) {
        i iVar;
        if (obj instanceof u) {
            return obj;
        }
        boolean z10 = true;
        if (!(i10 == 1 || i10 == 2)) {
            z10 = false;
        }
        if (!z10) {
            return obj;
        }
        if (lVar == null && !(t1Var instanceof i)) {
            return obj;
        }
        if (t1Var instanceof i) {
            iVar = (i) t1Var;
        } else {
            iVar = null;
        }
        return new t(obj, iVar, lVar, (CancellationException) null, 16);
    }

    public static void y(Object obj, Object obj2) {
        throw new IllegalStateException(("It's prohibited to register multiple handlers, tried to register " + obj + ", already has " + obj2).toString());
    }

    public final void A() {
        fl.f fVar;
        ik.d<T> dVar = this.f19050d;
        Throwable th2 = null;
        if (dVar instanceof fl.f) {
            fVar = (fl.f) dVar;
        } else {
            fVar = null;
        }
        if (fVar != null) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = fl.f.f20227o;
            while (true) {
                Object obj = atomicReferenceFieldUpdater.get(fVar);
                b bVar = g0.f19023f;
                boolean z10 = false;
                if (obj == bVar) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = fl.f.f20227o;
                    while (true) {
                        if (!atomicReferenceFieldUpdater2.compareAndSet(fVar, bVar, this)) {
                            if (atomicReferenceFieldUpdater2.get(fVar) != bVar) {
                                continue;
                                break;
                            }
                        } else {
                            z10 = true;
                            continue;
                            break;
                        }
                    }
                    if (z10) {
                        break;
                    }
                } else if (obj instanceof Throwable) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3 = fl.f.f20227o;
                    while (true) {
                        if (!atomicReferenceFieldUpdater3.compareAndSet(fVar, obj, (Object) null)) {
                            if (atomicReferenceFieldUpdater3.get(fVar) != obj) {
                                break;
                            }
                        } else {
                            z10 = true;
                            break;
                        }
                    }
                    if (z10) {
                        th2 = obj;
                    } else {
                        throw new IllegalArgumentException("Failed requirement.".toString());
                    }
                } else {
                    throw new IllegalStateException(("Inconsistent state " + obj).toString());
                }
            }
            if (th2 != null) {
                p();
                cancel(th2);
            }
        }
    }

    public final void B(Object obj, int i10, rk.l<? super Throwable, i> lVar) {
        boolean z10;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f19048n;
        do {
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            z10 = false;
            if (obj2 instanceof t1) {
                Object C = C((t1) obj2, obj, i10, lVar);
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f19048n;
                while (true) {
                    if (!atomicReferenceFieldUpdater2.compareAndSet(this, obj2, C)) {
                        if (atomicReferenceFieldUpdater2.get(this) != obj2) {
                            continue;
                            break;
                        }
                    } else {
                        z10 = true;
                        continue;
                        break;
                    }
                }
            } else {
                if (obj2 instanceof m) {
                    m mVar = (m) obj2;
                    mVar.getClass();
                    if (m.f19053c.compareAndSet(mVar, 0, 1)) {
                        if (lVar != null) {
                            m(lVar, mVar.f19094a);
                            return;
                        }
                        return;
                    }
                }
                throw new IllegalStateException(("Already resumed, but proposed with update " + obj).toString());
            }
        } while (!z10);
        if (!x()) {
            p();
        }
        q(i10);
    }

    public final b D(Object obj, rk.l lVar) {
        boolean z10;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f19048n;
        do {
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (obj2 instanceof t1) {
                Object C = C((t1) obj2, obj, this.f19082c, lVar);
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f19048n;
                while (true) {
                    if (!atomicReferenceFieldUpdater2.compareAndSet(this, obj2, C)) {
                        if (atomicReferenceFieldUpdater2.get(this) != obj2) {
                            z10 = false;
                            continue;
                            break;
                        }
                    } else {
                        z10 = true;
                        continue;
                        break;
                    }
                }
            } else {
                boolean z11 = obj2 instanceof t;
                return null;
            }
        } while (!z10);
        if (!x()) {
            p();
        }
        return m9.b.f13196a;
    }

    public final void a(Object obj, CancellationException cancellationException) {
        boolean z10;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f19048n;
        while (true) {
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (obj2 instanceof t1) {
                throw new IllegalStateException("Not completed".toString());
            } else if (!(obj2 instanceof u)) {
                boolean z11 = true;
                if (obj2 instanceof t) {
                    t tVar = (t) obj2;
                    if (tVar.f19092e != null) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (!z10) {
                        t a10 = t.a(tVar, (i) null, cancellationException, 15);
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f19048n;
                        while (true) {
                            if (!atomicReferenceFieldUpdater2.compareAndSet(this, obj2, a10)) {
                                if (atomicReferenceFieldUpdater2.get(this) != obj2) {
                                    z11 = false;
                                    break;
                                }
                            } else {
                                break;
                            }
                        }
                        if (z11) {
                            i iVar = tVar.f19089b;
                            if (iVar != null) {
                                l(iVar, cancellationException);
                            }
                            rk.l<Throwable, i> lVar = tVar.f19090c;
                            if (lVar != null) {
                                m(lVar, cancellationException);
                                return;
                            }
                            return;
                        }
                    } else {
                        throw new IllegalStateException("Must be called at most once".toString());
                    }
                } else {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3 = f19048n;
                    t tVar2 = new t(obj2, (i) null, (rk.l) null, cancellationException, 14);
                    while (true) {
                        if (!atomicReferenceFieldUpdater3.compareAndSet(this, obj2, tVar2)) {
                            if (atomicReferenceFieldUpdater3.get(this) != obj2) {
                                z11 = false;
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                    if (z11) {
                        return;
                    }
                }
            } else {
                return;
            }
        }
    }

    public final void b(s<?> sVar, int i10) {
        int i11;
        boolean z10;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f19047f;
        do {
            i11 = atomicIntegerFieldUpdater.get(this);
            if ((i11 & 536870911) == 536870911) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10) {
                throw new IllegalStateException("invokeOnCancellation should be called at most once".toString());
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i11, ((i11 >> 29) << 29) + i10));
        w(sVar);
    }

    public final ik.d<T> c() {
        return this.f19050d;
    }

    public final boolean cancel(Throwable th2) {
        Object obj;
        boolean z10;
        boolean z11;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f19048n;
        do {
            obj = atomicReferenceFieldUpdater.get(this);
            z10 = false;
            if (obj instanceof t1) {
                if ((obj instanceof i) || (obj instanceof s)) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                m mVar = new m(this, th2, z11);
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f19048n;
                while (true) {
                    if (!atomicReferenceFieldUpdater2.compareAndSet(this, obj, mVar)) {
                        if (atomicReferenceFieldUpdater2.get(this) != obj) {
                            continue;
                            break;
                        }
                    } else {
                        z10 = true;
                        continue;
                        break;
                    }
                }
            } else {
                return false;
            }
        } while (!z10);
        t1 t1Var = (t1) obj;
        if (t1Var instanceof i) {
            l((i) obj, th2);
        } else if (t1Var instanceof s) {
            o((s) obj, th2);
        }
        if (!x()) {
            p();
        }
        q(this.f19082c);
        return true;
    }

    public final Throwable d(Object obj) {
        Throwable d10 = super.d(obj);
        if (d10 != null) {
            return d10;
        }
        return null;
    }

    public final <T> T e(Object obj) {
        if (obj instanceof t) {
            return ((t) obj).f19088a;
        }
        return obj;
    }

    public final b f(Object obj, rk.l lVar) {
        return D(obj, lVar);
    }

    public final d getCallerFrame() {
        ik.d<T> dVar = this.f19050d;
        if (dVar instanceof d) {
            return (d) dVar;
        }
        return null;
    }

    public final f getContext() {
        return this.f19051e;
    }

    public final Object h() {
        return f19048n.get(this);
    }

    public final b i(Throwable th2) {
        return D(new u(th2, false), (rk.l) null);
    }

    public final void j(a0 a0Var, i iVar) {
        fl.f fVar;
        a0 a0Var2;
        int i10;
        ik.d<T> dVar = this.f19050d;
        if (dVar instanceof fl.f) {
            fVar = (fl.f) dVar;
        } else {
            fVar = null;
        }
        if (fVar != null) {
            a0Var2 = fVar.f20228d;
        } else {
            a0Var2 = null;
        }
        if (a0Var2 == a0Var) {
            i10 = 4;
        } else {
            i10 = this.f19082c;
        }
        B(iVar, i10, (rk.l<? super Throwable, i>) null);
    }

    public final void k(T t10, rk.l<? super Throwable, i> lVar) {
        B(t10, this.f19082c, lVar);
    }

    public final void l(i iVar, Throwable th2) {
        try {
            iVar.h(th2);
        } catch (Throwable th3) {
            f fVar = this.f19051e;
            c0.a(fVar, new CompletionHandlerException("Exception in invokeOnCancellation handler for " + this, th3));
        }
    }

    public final void m(rk.l<? super Throwable, i> lVar, Throwable th2) {
        try {
            lVar.invoke(th2);
        } catch (Throwable th3) {
            f fVar = this.f19051e;
            c0.a(fVar, new CompletionHandlerException("Exception in resume onCancellation handler for " + this, th3));
        }
    }

    public final void n(Object obj) {
        q(this.f19082c);
    }

    public final void o(s<?> sVar, Throwable th2) {
        boolean z10;
        int i10 = f19047f.get(this) & 536870911;
        if (i10 != 536870911) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            try {
                sVar.g(i10, this.f19051e);
            } catch (Throwable th3) {
                f fVar = this.f19051e;
                c0.a(fVar, new CompletionHandlerException("Exception in invokeOnCancellation handler for " + this, th3));
            }
        } else {
            throw new IllegalStateException("The index for Segment.onCancellation(..) is broken".toString());
        }
    }

    public final void p() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f19049o;
        t0 t0Var = (t0) atomicReferenceFieldUpdater.get(this);
        if (t0Var != null) {
            t0Var.b();
            atomicReferenceFieldUpdater.set(this, s1.f19087a);
        }
    }

    public final void q(int i10) {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f19047f;
        while (true) {
            int i11 = atomicIntegerFieldUpdater.get(this);
            int i12 = i11 >> 29;
            z10 = false;
            if (i12 == 0) {
                if (f19047f.compareAndSet(this, i11, (536870911 & i11) + 1073741824)) {
                    z11 = true;
                    break;
                }
            } else if (i12 == 1) {
                z11 = false;
            } else {
                throw new IllegalStateException("Already resumed".toString());
            }
        }
        if (!z11) {
            ik.d<T> dVar = this.f19050d;
            if (i10 == 4) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (!z12 && (dVar instanceof fl.f)) {
                if (i10 == 1 || i10 == 2) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                int i13 = this.f19082c;
                if (i13 == 1 || i13 == 2) {
                    z10 = true;
                }
                if (z13 == z10) {
                    a0 a0Var = ((fl.f) dVar).f20228d;
                    f context = dVar.getContext();
                    if (a0Var.W(context)) {
                        a0Var.s(context, this);
                        return;
                    }
                    x0 a10 = a2.a();
                    if (a10.e0()) {
                        a10.c0(this);
                        return;
                    }
                    a10.d0(true);
                    try {
                        g0.f0(this, this.f19050d, true);
                        do {
                        } while (a10.j0());
                    } catch (Throwable th2) {
                        a10.a0(true);
                        throw th2;
                    }
                    a10.a0(true);
                    return;
                }
            }
            g0.f0(this, dVar, z12);
        }
    }

    public Throwable r(m1 m1Var) {
        return m1Var.getCancellationException();
    }

    public final void resumeWith(Object obj) {
        Throwable a10 = ek.f.a(obj);
        if (a10 != null) {
            obj = new u(a10, false);
        }
        B(obj, this.f19082c, (rk.l<? super Throwable, i>) null);
    }

    public final Object s() {
        boolean z10;
        boolean z11;
        i1 i1Var;
        boolean x10 = x();
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f19047f;
        while (true) {
            int i10 = atomicIntegerFieldUpdater.get(this);
            int i11 = i10 >> 29;
            z10 = false;
            if (i11 == 0) {
                if (f19047f.compareAndSet(this, i10, (536870911 & i10) + 536870912)) {
                    z11 = true;
                    break;
                }
            } else if (i11 == 2) {
                z11 = false;
            } else {
                throw new IllegalStateException("Already suspended".toString());
            }
        }
        if (z11) {
            if (((t0) f19049o.get(this)) == null) {
                u();
            }
            if (x10) {
                A();
            }
            return a.COROUTINE_SUSPENDED;
        }
        if (x10) {
            A();
        }
        Object obj = f19048n.get(this);
        if (!(obj instanceof u)) {
            int i12 = this.f19082c;
            if (i12 == 1 || i12 == 2) {
                z10 = true;
            }
            if (!z10 || (i1Var = (i1) this.f19051e.get(i1.b.f19045a)) == null || i1Var.isActive()) {
                return e(obj);
            }
            CancellationException cancellationException = i1Var.getCancellationException();
            a(obj, cancellationException);
            throw cancellationException;
        }
        throw ((u) obj).f19094a;
    }

    public final void t() {
        t0 u10 = u();
        if (u10 != null && (!(f19048n.get(this) instanceof t1))) {
            u10.b();
            f19049o.set(this, s1.f19087a);
        }
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(z());
        sb2.append('(');
        sb2.append(g0.j0(this.f19050d));
        sb2.append("){");
        Object obj = f19048n.get(this);
        if (obj instanceof t1) {
            str = "Active";
        } else if (obj instanceof m) {
            str = "Cancelled";
        } else {
            str = "Completed";
        }
        sb2.append(str);
        sb2.append("}@");
        sb2.append(g0.T(this));
        return sb2.toString();
    }

    /* JADX WARNING: Removed duplicated region for block: B:4:0x001b A[LOOP:0: B:4:0x001b->B:7:0x0026, LOOP_START] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final al.t0 u() {
        /*
            r5 = this;
            ik.f r0 = r5.f19051e
            al.i1$b r1 = al.i1.b.f19045a
            ik.f$b r0 = r0.get(r1)
            al.i1 r0 = (al.i1) r0
            r1 = 0
            if (r0 != 0) goto L_0x000e
            return r1
        L_0x000e:
            r2 = 1
            al.n r3 = new al.n
            r3.<init>(r5)
            r4 = 2
            al.t0 r0 = al.i1.a.a(r0, r2, r3, r4)
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r2 = f19049o
        L_0x001b:
            boolean r3 = r2.compareAndSet(r5, r1, r0)
            if (r3 == 0) goto L_0x0022
            goto L_0x0028
        L_0x0022:
            java.lang.Object r3 = r2.get(r5)
            if (r3 == 0) goto L_0x001b
        L_0x0028:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: al.l.u():al.t0");
    }

    public final void v(rk.l<? super Throwable, i> lVar) {
        i iVar;
        if (lVar instanceof i) {
            iVar = (i) lVar;
        } else {
            iVar = new h(lVar, 1);
        }
        w(iVar);
    }

    public final void w(Object obj) {
        boolean z10;
        boolean z11;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f19048n;
        while (true) {
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            boolean z12 = true;
            if (obj2 instanceof b) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f19048n;
                while (true) {
                    if (!atomicReferenceFieldUpdater2.compareAndSet(this, obj2, obj)) {
                        if (atomicReferenceFieldUpdater2.get(this) != obj2) {
                            z12 = false;
                            break;
                        }
                    } else {
                        break;
                    }
                }
                if (z12) {
                    return;
                }
            } else {
                if (obj2 instanceof i) {
                    z10 = true;
                } else {
                    z10 = obj2 instanceof s;
                }
                Throwable th2 = null;
                if (!z10) {
                    boolean z13 = obj2 instanceof u;
                    if (z13) {
                        u uVar = (u) obj2;
                        uVar.getClass();
                        if (!u.f19093b.compareAndSet(uVar, 0, 1)) {
                            y(obj, obj2);
                            throw null;
                        } else if (obj2 instanceof m) {
                            if (!z13) {
                                uVar = null;
                            }
                            if (uVar != null) {
                                th2 = uVar.f19094a;
                            }
                            if (obj instanceof i) {
                                l((i) obj, th2);
                                return;
                            }
                            j.d(obj, "null cannot be cast to non-null type kotlinx.coroutines.internal.Segment<*>");
                            o((s) obj, th2);
                            return;
                        } else {
                            return;
                        }
                    } else if (obj2 instanceof t) {
                        t tVar = (t) obj2;
                        if (tVar.f19089b != null) {
                            y(obj, obj2);
                            throw null;
                        } else if (!(obj instanceof s)) {
                            j.d(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancelHandler");
                            i iVar = (i) obj;
                            Throwable th3 = tVar.f19092e;
                            if (th3 != null) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            if (z11) {
                                l(iVar, th3);
                                return;
                            }
                            t a10 = t.a(tVar, iVar, (CancellationException) null, 29);
                            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3 = f19048n;
                            while (true) {
                                if (!atomicReferenceFieldUpdater3.compareAndSet(this, obj2, a10)) {
                                    if (atomicReferenceFieldUpdater3.get(this) != obj2) {
                                        z12 = false;
                                        break;
                                    }
                                } else {
                                    break;
                                }
                            }
                            if (z12) {
                                return;
                            }
                        } else {
                            return;
                        }
                    } else if (!(obj instanceof s)) {
                        j.d(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancelHandler");
                        t tVar2 = new t(obj2, (i) obj, (rk.l) null, (CancellationException) null, 28);
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4 = f19048n;
                        while (true) {
                            if (!atomicReferenceFieldUpdater4.compareAndSet(this, obj2, tVar2)) {
                                if (atomicReferenceFieldUpdater4.get(this) != obj2) {
                                    z12 = false;
                                    break;
                                }
                            } else {
                                break;
                            }
                        }
                        if (z12) {
                            return;
                        }
                    } else {
                        return;
                    }
                } else {
                    y(obj, obj2);
                    throw null;
                }
            }
        }
    }

    public final boolean x() {
        boolean z10;
        boolean z11;
        if (this.f19082c == 2) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            ik.d<T> dVar = this.f19050d;
            j.d(dVar, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
            if (fl.f.f20227o.get((fl.f) dVar) != null) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11) {
                return true;
            }
        }
        return false;
    }

    public String z() {
        return "CancellableContinuation";
    }
}
