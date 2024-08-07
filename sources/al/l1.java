package al;

import fl.i;
import fl.p;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import m9.b;
import sk.j;

/* compiled from: JobSupport.kt */
public abstract class l1 extends w implements t0, e1 {

    /* renamed from: d  reason: collision with root package name */
    public m1 f19052d;

    public final r1 a() {
        return null;
    }

    public final void b() {
        boolean z10;
        i iVar;
        boolean z11;
        m1 n10 = n();
        do {
            Object M = n10.M();
            z10 = false;
            if (M instanceof l1) {
                if (M == this) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = m1.f19054a;
                    w0 w0Var = b.f13203o;
                    while (true) {
                        if (!atomicReferenceFieldUpdater.compareAndSet(n10, M, w0Var)) {
                            if (atomicReferenceFieldUpdater.get(n10) != M) {
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
            } else if ((M instanceof e1) && ((e1) M).a() != null) {
                do {
                    Object h10 = h();
                    if (!(h10 instanceof p)) {
                        if (h10 != this) {
                            j.d(h10, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
                            iVar = (i) h10;
                            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = i.f20242c;
                            p pVar = (p) atomicReferenceFieldUpdater2.get(iVar);
                            if (pVar == null) {
                                pVar = new p(iVar);
                                atomicReferenceFieldUpdater2.lazySet(iVar, pVar);
                            }
                            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3 = i.f20240a;
                            while (true) {
                                if (!atomicReferenceFieldUpdater3.compareAndSet(this, h10, pVar)) {
                                    if (atomicReferenceFieldUpdater3.get(this) != h10) {
                                        z11 = false;
                                        continue;
                                        break;
                                    }
                                } else {
                                    z11 = true;
                                    continue;
                                    break;
                                }
                            }
                        } else {
                            i iVar2 = (i) h10;
                            return;
                        }
                    } else {
                        i iVar3 = ((p) h10).f20258a;
                        return;
                    }
                } while (!z11);
                iVar.e();
                return;
            } else {
                return;
            }
        } while (!z10);
    }

    public final boolean isActive() {
        return true;
    }

    public final m1 n() {
        m1 m1Var = this.f19052d;
        if (m1Var != null) {
            return m1Var;
        }
        j.l("job");
        throw null;
    }

    public final String toString() {
        return getClass().getSimpleName() + '@' + g0.T(this) + "[job@" + g0.T(n()) + ']';
    }
}
