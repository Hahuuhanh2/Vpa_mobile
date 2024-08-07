package al;

import al.m1;
import hl.f;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import m9.b;
import rk.q;
import sk.i;

/* compiled from: JobSupport.kt */
public final /* synthetic */ class n1 extends i implements q<m1, f<?>, Object, ek.i> {

    /* renamed from: p  reason: collision with root package name */
    public static final n1 f19078p = new n1();

    public n1() {
        super(3, m1.class, "onAwaitInternalRegFunc", "onAwaitInternalRegFunc(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;)V", 0);
    }

    public final Object d(dl.f fVar, Object obj, Object obj2) {
        m1 m1Var = (m1) fVar;
        f fVar2 = (f) obj;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = m1.f19054a;
        while (true) {
            Object M = m1Var.M();
            if (M instanceof e1) {
                if (m1Var.c0(M) >= 0) {
                    fVar2.a(m1Var.invokeOnCompletion(new m1.d(fVar2)));
                    break;
                }
            } else {
                if (!(M instanceof u)) {
                    M = b.d0(M);
                }
                fVar2.f(M);
            }
        }
        return ek.i.f20112a;
    }
}
