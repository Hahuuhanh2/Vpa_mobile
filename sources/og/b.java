package og;

import al.d0;
import ik.d;
import jk.a;
import kk.e;
import kk.i;
import p3.l0;
import rk.p;

@e(c = "com.vpa.daugia.di.module.ApiModule$provideOkHttpClient$2$intercept$2", f = "ApiModule.kt", l = {}, m = "invokeSuspend")
/* compiled from: ApiModule.kt */
public final class b extends i implements p<d0, d<? super ek.i>, Object> {
    public b(d<? super b> dVar) {
        super(2, dVar);
    }

    public final d<ek.i> create(Object obj, d<?> dVar) {
        return new b(dVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        d0 d0Var = (d0) obj;
        return new b((d) obj2).invokeSuspend(ek.i.f20112a);
    }

    public final Object invokeSuspend(Object obj) {
        a aVar = a.COROUTINE_SUSPENDED;
        l0.Q0(obj);
        return ek.i.f20112a;
    }
}
