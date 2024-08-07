package il;

import al.a0;
import al.f2;
import al.g0;
import al.k;
import al.l;
import ek.i;
import fl.s;
import ik.f;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kk.c;
import rk.q;

/* compiled from: Mutex.kt */
public final class d extends i implements a {

    /* renamed from: h  reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f20658h = AtomicReferenceFieldUpdater.newUpdater(d.class, Object.class, "owner");
    private volatile Object owner;

    /* compiled from: Mutex.kt */
    public final class a implements k<i>, f2 {

        /* renamed from: a  reason: collision with root package name */
        public final l<i> f20659a;

        /* renamed from: b  reason: collision with root package name */
        public final Object f20660b = null;

        public a(l lVar) {
            this.f20659a = lVar;
        }

        public final void b(s<?> sVar, int i10) {
            this.f20659a.b(sVar, i10);
        }

        public final boolean cancel(Throwable th2) {
            return this.f20659a.cancel(th2);
        }

        public final u9.b f(Object obj, rk.l lVar) {
            d dVar = d.this;
            u9.b D = this.f20659a.D((i) obj, new c(dVar, this));
            if (D != null) {
                d.f20658h.set(d.this, this.f20660b);
            }
            return D;
        }

        public final f getContext() {
            return this.f20659a.f19051e;
        }

        public final u9.b i(Throwable th2) {
            return this.f20659a.i(th2);
        }

        public final void j(a0 a0Var, i iVar) {
            this.f20659a.j(a0Var, iVar);
        }

        public final void k(Object obj, rk.l lVar) {
            d.f20658h.set(d.this, this.f20660b);
            this.f20659a.k((i) obj, new b(d.this, this));
        }

        public final void n(Object obj) {
            this.f20659a.n(obj);
        }

        public final void resumeWith(Object obj) {
            this.f20659a.resumeWith(obj);
        }
    }

    /* compiled from: Mutex.kt */
    public static final class b extends sk.k implements q<hl.f<?>, Object, Object, rk.l<? super Throwable, ? extends i>> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ d f20662a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(d dVar) {
            super(3);
            this.f20662a = dVar;
        }

        public final Object d(dl.f fVar, Object obj, Object obj2) {
            hl.f fVar2 = (hl.f) fVar;
            return new e(this.f20662a, obj);
        }
    }

    public d(boolean z10) {
        super(z10 ? 1 : 0);
        u9.b bVar;
        if (z10) {
            bVar = null;
        } else {
            bVar = g0.f19025o;
        }
        this.owner = bVar;
        new b(this);
    }

    public final Object a(c cVar) {
        boolean z10;
        boolean z11;
        boolean z12;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i10;
        int i11;
        while (true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater2 = i.f20672g;
            int i12 = atomicIntegerFieldUpdater2.get(this);
            if (i12 > this.f20673a) {
                do {
                    atomicIntegerFieldUpdater = i.f20672g;
                    i10 = atomicIntegerFieldUpdater.get(this);
                    i11 = this.f20673a;
                    if (i10 <= i11) {
                        break;
                    }
                } while (atomicIntegerFieldUpdater.compareAndSet(this, i10, i11));
            } else {
                z10 = false;
                if (i12 <= 0) {
                    z11 = false;
                    break;
                } else if (atomicIntegerFieldUpdater2.compareAndSet(this, i12, i12 - 1)) {
                    z11 = true;
                    break;
                }
            }
        }
        if (z11) {
            f20658h.set(this, (Object) null);
            z12 = false;
        } else {
            z12 = true;
        }
        if (!z12) {
            z10 = true;
        } else if (!z12) {
            if (!z12) {
                throw new IllegalStateException("unexpected".toString());
            }
            throw new IllegalStateException("This mutex is already locked by the specified owner: null".toString());
        }
        if (z10) {
            return i.f20112a;
        }
        l Y = g0.Y(g0.b0(cVar));
        try {
            c(new a(Y));
            Object s10 = Y.s();
            jk.a aVar = jk.a.COROUTINE_SUSPENDED;
            if (s10 != aVar) {
                s10 = i.f20112a;
            }
            if (s10 == aVar) {
                return s10;
            }
            return i.f20112a;
        } catch (Throwable th2) {
            Y.A();
            throw th2;
        }
    }

    public final void b(Object obj) {
        boolean z10;
        while (e()) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f20658h;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            u9.b bVar = g0.f19025o;
            if (obj2 != bVar) {
                boolean z11 = false;
                if (obj2 == obj || obj == null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    while (true) {
                        if (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, bVar)) {
                            if (atomicReferenceFieldUpdater.get(this) != obj2) {
                                break;
                            }
                        } else {
                            z11 = true;
                            break;
                        }
                    }
                    if (z11) {
                        d();
                        return;
                    }
                } else {
                    throw new IllegalStateException(("This mutex is locked by " + obj2 + ", but " + obj + " is expected").toString());
                }
            }
        }
        throw new IllegalStateException("This mutex is not locked".toString());
    }

    public final boolean e() {
        if (Math.max(i.f20672g.get(this), 0) == 0) {
            return true;
        }
        return false;
    }

    public final String toString() {
        StringBuilder q10 = android.support.v4.media.a.q("Mutex@");
        q10.append(g0.T(this));
        q10.append("[isLocked=");
        q10.append(e());
        q10.append(",owner=");
        q10.append(f20658h.get(this));
        q10.append(']');
        return q10.toString();
    }
}
