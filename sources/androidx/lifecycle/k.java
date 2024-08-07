package androidx.lifecycle;

import al.d0;
import al.g0;
import androidx.lifecycle.i;
import ik.d;
import java.util.concurrent.CancellationException;
import jk.a;
import kk.e;
import kk.i;
import p3.l0;
import rk.p;

@e(c = "androidx.lifecycle.LifecycleCoroutineScopeImpl$register$1", f = "Lifecycle.kt", l = {}, m = "invokeSuspend")
/* compiled from: Lifecycle.kt */
public final class k extends i implements p<d0, d<? super ek.i>, Object> {

    /* renamed from: a  reason: collision with root package name */
    public /* synthetic */ Object f2778a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ l f2779b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public k(l lVar, d<? super k> dVar) {
        super(2, dVar);
        this.f2779b = lVar;
    }

    public final d<ek.i> create(Object obj, d<?> dVar) {
        k kVar = new k(this.f2779b, dVar);
        kVar.f2778a = obj;
        return kVar;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((k) create((d0) obj, (d) obj2)).invokeSuspend(ek.i.f20112a);
    }

    public final Object invokeSuspend(Object obj) {
        a aVar = a.COROUTINE_SUSPENDED;
        l0.Q0(obj);
        d0 d0Var = (d0) this.f2778a;
        if (this.f2779b.f2780a.b().compareTo(i.b.INITIALIZED) >= 0) {
            l lVar = this.f2779b;
            lVar.f2780a.a(lVar);
        } else {
            g0.x(d0Var.s(), (CancellationException) null);
        }
        return ek.i.f20112a;
    }
}
