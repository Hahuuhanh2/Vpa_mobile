package gh;

import al.d0;
import dl.v;
import ik.d;
import jk.a;
import kk.e;
import kk.i;
import p3.l0;
import rk.p;
import ze.e;

@e(c = "com.vpa.daugia.module.cart.ui.fragment.UnpaidCartFragment$observer$2$1", f = "UnpaidCartFragment.kt", l = {114}, m = "invokeSuspend")
/* compiled from: UnpaidCartFragment.kt */
public final class q extends i implements p<d0, d<? super ek.i>, Object> {

    /* renamed from: a  reason: collision with root package name */
    public int f20326a;

    public q(d<? super q> dVar) {
        super(2, dVar);
    }

    public final d<ek.i> create(Object obj, d<?> dVar) {
        return new q(dVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        d0 d0Var = (d0) obj;
        return new q((d) obj2).invokeSuspend(ek.i.f20112a);
    }

    public final Object invokeSuspend(Object obj) {
        a aVar = a.COROUTINE_SUSPENDED;
        int i10 = this.f20326a;
        if (i10 == 0) {
            l0.Q0(obj);
            v vVar = ze.e.f18000a;
            e.a aVar2 = e.a.f18002a;
            this.f20326a = 1;
            Object e10 = ze.e.f18000a.e(aVar2, this);
            if (e10 != aVar) {
                e10 = ek.i.f20112a;
            }
            if (e10 == aVar) {
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
