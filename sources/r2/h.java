package r2;

import al.d0;
import androidx.lifecycle.i;
import androidx.lifecycle.r;
import ik.d;
import jk.a;
import kk.e;
import kk.i;
import p3.l0;
import rk.p;

@e(c = "androidx.lifecycle.LifecycleCoroutineScope$launchWhenResumed$1", f = "Lifecycle.kt", l = {400}, m = "invokeSuspend")
/* compiled from: Lifecycle.kt */
public final class h extends i implements p<d0, d<? super ek.i>, Object> {

    /* renamed from: a  reason: collision with root package name */
    public int f14476a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ j f14477b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ p<d0, d<? super ek.i>, Object> f14478c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public h(j jVar, p<? super d0, ? super d<? super ek.i>, ? extends Object> pVar, d<? super h> dVar) {
        super(2, dVar);
        this.f14477b = jVar;
        this.f14478c = pVar;
    }

    public final d<ek.i> create(Object obj, d<?> dVar) {
        return new h(this.f14477b, this.f14478c, dVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((h) create((d0) obj, (d) obj2)).invokeSuspend(ek.i.f20112a);
    }

    public final Object invokeSuspend(Object obj) {
        a aVar = a.COROUTINE_SUSPENDED;
        int i10 = this.f14476a;
        if (i10 == 0) {
            l0.Q0(obj);
            androidx.lifecycle.i a10 = this.f14477b.a();
            p<d0, d<? super ek.i>, Object> pVar = this.f14478c;
            this.f14476a = 1;
            if (r.a(a10, i.b.RESUMED, pVar, this) == aVar) {
                return aVar;
            }
        } else if (i10 == 1) {
            l0.Q0(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return ek.i.f20112a;
    }
}
