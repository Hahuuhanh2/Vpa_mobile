package hl;

import al.f2;
import al.i;
import al.k;
import al.t0;
import fk.p;
import fl.s;
import ik.f;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import sk.j;
import u9.b;

/* compiled from: Select.kt */
public final class e<R> extends i implements f, f2 {

    /* renamed from: c  reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f20539c = AtomicReferenceFieldUpdater.newUpdater(e.class, Object.class, "state");

    /* renamed from: a  reason: collision with root package name */
    public t0 f20540a;

    /* renamed from: b  reason: collision with root package name */
    public Object f20541b;
    private volatile Object state;

    /* compiled from: Select.kt */
    public final class a {
    }

    public final void a(t0 t0Var) {
        this.f20540a = t0Var;
    }

    public final void b(s<?> sVar, int i10) {
    }

    public final boolean e(Object obj, Object obj2) {
        if (i(obj) == 0) {
            return true;
        }
        return false;
    }

    public final void f(Object obj) {
        this.f20541b = obj;
    }

    public final f getContext() {
        return null;
    }

    public final void h(Throwable th2) {
        boolean z10;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f20539c;
        do {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj != g.f20544c) {
                b bVar = g.f20545d;
                while (true) {
                    if (!atomicReferenceFieldUpdater.compareAndSet(this, obj, bVar)) {
                        if (atomicReferenceFieldUpdater.get(this) != obj) {
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
                return;
            }
        } while (!z10);
    }

    public final int i(Object obj) {
        boolean z10;
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f20539c;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (!(obj2 instanceof k)) {
                if (j.a(obj2, g.f20544c)) {
                    z10 = true;
                } else {
                    z10 = obj2 instanceof a;
                }
                if (z10) {
                    return 3;
                }
                if (j.a(obj2, g.f20545d)) {
                    return 2;
                }
                boolean z11 = false;
                if (j.a(obj2, g.f20543b)) {
                    List c02 = j7.a.c0(obj);
                    while (true) {
                        if (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, c02)) {
                            if (atomicReferenceFieldUpdater.get(this) != obj2) {
                                break;
                            }
                        } else {
                            z11 = true;
                            break;
                        }
                    }
                    if (z11) {
                        return 1;
                    }
                } else if (obj2 instanceof List) {
                    ArrayList T0 = p.T0(obj, (Collection) obj2);
                    while (true) {
                        if (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, T0)) {
                            if (atomicReferenceFieldUpdater.get(this) != obj2) {
                                break;
                            }
                        } else {
                            z11 = true;
                            break;
                        }
                    }
                    if (z11) {
                        return 1;
                    }
                } else {
                    throw new IllegalStateException(("Unexpected state: " + obj2).toString());
                }
            }
        }
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        h((Throwable) obj);
        return ek.i.f20112a;
    }
}
