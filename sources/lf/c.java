package lf;

import al.d0;
import ik.d;
import jk.a;
import kk.e;
import kk.i;
import p3.l0;
import rk.l;
import rk.p;

@e(c = "com.ots.core.utils.commom.ConnectionCheckerKt$checkConnection$4", f = "ConnectionChecker.kt", l = {69}, m = "invokeSuspend")
/* compiled from: ConnectionChecker.kt */
public final class c extends i implements p<d0, d<? super ek.i>, Object> {

    /* renamed from: a  reason: collision with root package name */
    public int f12984a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ String f12985b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ l<f, ek.i> f12986c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public c(String str, l<? super f, ek.i> lVar, d<? super c> dVar) {
        super(2, dVar);
        this.f12985b = str;
        this.f12986c = lVar;
    }

    public final d<ek.i> create(Object obj, d<?> dVar) {
        return new c(this.f12985b, this.f12986c, dVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((c) create((d0) obj, (d) obj2)).invokeSuspend(ek.i.f20112a);
    }

    public final Object invokeSuspend(Object obj) {
        a aVar = a.COROUTINE_SUSPENDED;
        int i10 = this.f12984a;
        if (i10 == 0) {
            l0.Q0(obj);
            String str = this.f12985b;
            l<f, ek.i> lVar = this.f12986c;
            this.f12984a = 1;
            if (e.a(str, lVar, this) == aVar) {
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
