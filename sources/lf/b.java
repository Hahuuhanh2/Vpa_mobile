package lf;

import al.d0;
import ik.d;
import jk.a;
import kk.e;
import kk.i;
import p3.l0;
import rk.l;
import rk.p;

@e(c = "com.ots.core.utils.commom.ConnectionCheckerKt$checkConnection$3", f = "ConnectionChecker.kt", l = {65}, m = "invokeSuspend")
/* compiled from: ConnectionChecker.kt */
public final class b extends i implements p<d0, d<? super ek.i>, Object> {

    /* renamed from: a  reason: collision with root package name */
    public int f12981a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ String f12982b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ l<f, ek.i> f12983c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public b(String str, l<? super f, ek.i> lVar, d<? super b> dVar) {
        super(2, dVar);
        this.f12982b = str;
        this.f12983c = lVar;
    }

    public final d<ek.i> create(Object obj, d<?> dVar) {
        return new b(this.f12982b, this.f12983c, dVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((b) create((d0) obj, (d) obj2)).invokeSuspend(ek.i.f20112a);
    }

    public final Object invokeSuspend(Object obj) {
        a aVar = a.COROUTINE_SUSPENDED;
        int i10 = this.f12981a;
        if (i10 == 0) {
            l0.Q0(obj);
            String str = this.f12982b;
            l<f, ek.i> lVar = this.f12983c;
            this.f12981a = 1;
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
