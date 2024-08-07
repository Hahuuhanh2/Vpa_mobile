package f2;

import al.d0;
import ik.d;
import jk.a;
import kk.e;
import kk.i;
import p3.l0;
import rk.p;

@e(c = "androidx.datastore.core.SingleProcessDataStore$transformAndWrite$newData$1", f = "SingleProcessDataStore.kt", l = {402}, m = "invokeSuspend")
/* compiled from: SingleProcessDataStore.kt */
public final class z extends i implements p<d0, d<Object>, Object> {

    /* renamed from: a  reason: collision with root package name */
    public int f9898a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ p<Object, d<Object>, Object> f9899b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Object f9900c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public z(Object obj, d dVar, p pVar) {
        super(2, dVar);
        this.f9899b = pVar;
        this.f9900c = obj;
    }

    public final d<ek.i> create(Object obj, d<?> dVar) {
        return new z(this.f9900c, dVar, this.f9899b);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((z) create((d0) obj, (d) obj2)).invokeSuspend(ek.i.f20112a);
    }

    public final Object invokeSuspend(Object obj) {
        a aVar = a.COROUTINE_SUSPENDED;
        int i10 = this.f9898a;
        if (i10 == 0) {
            l0.Q0(obj);
            p<Object, d<Object>, Object> pVar = this.f9899b;
            Object obj2 = this.f9900c;
            this.f9898a = 1;
            obj = pVar.invoke(obj2, this);
            if (obj == aVar) {
                return aVar;
            }
        } else if (i10 == 1) {
            l0.Q0(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return obj;
    }
}
