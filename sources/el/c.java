package el;

import al.d0;
import al.g0;
import al.y;
import cl.h;
import cl.o;
import dl.f;
import ik.d;
import jk.a;
import kk.e;
import kk.i;
import p3.l0;
import rk.p;

@e(c = "kotlinx.coroutines.flow.internal.ChannelFlow$collect$2", f = "ChannelFlow.kt", l = {123}, m = "invokeSuspend")
/* compiled from: ChannelFlow.kt */
public final class c extends i implements p<d0, d<? super ek.i>, Object> {

    /* renamed from: a  reason: collision with root package name */
    public int f20118a;

    /* renamed from: b  reason: collision with root package name */
    public /* synthetic */ Object f20119b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ f<Object> f20120c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ e<Object> f20121d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public c(d dVar, f fVar, e eVar) {
        super(2, dVar);
        this.f20120c = fVar;
        this.f20121d = eVar;
    }

    public final d<ek.i> create(Object obj, d<?> dVar) {
        c cVar = new c(dVar, this.f20120c, this.f20121d);
        cVar.f20119b = obj;
        return cVar;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((c) create((d0) obj, (d) obj2)).invokeSuspend(ek.i.f20112a);
    }

    public final Object invokeSuspend(Object obj) {
        a aVar = a.COROUTINE_SUSPENDED;
        int i10 = this.f20118a;
        if (i10 == 0) {
            l0.Q0(obj);
            d0 d0Var = (d0) this.f20119b;
            f<Object> fVar = this.f20120c;
            e<Object> eVar = this.f20121d;
            ik.f fVar2 = eVar.f20125a;
            int i11 = eVar.f20126b;
            if (i11 == -3) {
                i11 = -2;
            }
            int i12 = eVar.f20127c;
            d dVar = new d(eVar, (d<? super d>) null);
            o oVar = new o(y.b(d0Var, fVar2), h.a(i11, i12, 4));
            oVar.k0(3, oVar, dVar);
            this.f20118a = 1;
            Object M = g0.M(fVar, oVar, true, this);
            if (M != aVar) {
                M = ek.i.f20112a;
            }
            if (M == aVar) {
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
