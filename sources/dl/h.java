package dl;

import al.d0;
import el.j;
import ik.d;
import jk.a;
import kk.e;
import kk.i;
import p3.l0;
import rk.p;

@e(c = "kotlinx.coroutines.flow.FlowKt__CollectKt$launchIn$1", f = "Collect.kt", l = {50}, m = "invokeSuspend")
/* compiled from: Collect.kt */
public final class h extends i implements p<d0, d<? super ek.i>, Object> {

    /* renamed from: a  reason: collision with root package name */
    public int f19982a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ e<Object> f19983b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public h(e<Object> eVar, d<? super h> dVar) {
        super(2, dVar);
        this.f19983b = eVar;
    }

    public final d<ek.i> create(Object obj, d<?> dVar) {
        return new h(this.f19983b, dVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((h) create((d0) obj, (d) obj2)).invokeSuspend(ek.i.f20112a);
    }

    public final Object invokeSuspend(Object obj) {
        a aVar = a.COROUTINE_SUSPENDED;
        int i10 = this.f19982a;
        if (i10 == 0) {
            l0.Q0(obj);
            e<Object> eVar = this.f19983b;
            this.f19982a = 1;
            Object a10 = eVar.a(j.f20151a, this);
            if (a10 != aVar) {
                a10 = ek.i.f20112a;
            }
            if (a10 == aVar) {
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
