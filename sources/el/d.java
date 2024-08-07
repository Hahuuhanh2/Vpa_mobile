package el;

import jk.a;
import kk.e;
import kk.i;
import p3.l0;
import rk.p;

@e(c = "kotlinx.coroutines.flow.internal.ChannelFlow$collectToFun$1", f = "ChannelFlow.kt", l = {60}, m = "invokeSuspend")
/* compiled from: ChannelFlow.kt */
public final class d extends i implements p<cl.p<Object>, ik.d<? super ek.i>, Object> {

    /* renamed from: a  reason: collision with root package name */
    public int f20122a;

    /* renamed from: b  reason: collision with root package name */
    public /* synthetic */ Object f20123b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ e<Object> f20124c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public d(e<Object> eVar, ik.d<? super d> dVar) {
        super(2, dVar);
        this.f20124c = eVar;
    }

    public final ik.d<ek.i> create(Object obj, ik.d<?> dVar) {
        d dVar2 = new d(this.f20124c, dVar);
        dVar2.f20123b = obj;
        return dVar2;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((d) create((cl.p) obj, (ik.d) obj2)).invokeSuspend(ek.i.f20112a);
    }

    public final Object invokeSuspend(Object obj) {
        a aVar = a.COROUTINE_SUSPENDED;
        int i10 = this.f20122a;
        if (i10 == 0) {
            l0.Q0(obj);
            e<Object> eVar = this.f20124c;
            this.f20122a = 1;
            if (eVar.c((cl.p) this.f20123b, this) == aVar) {
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
