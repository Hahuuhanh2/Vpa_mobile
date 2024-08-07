package i2;

import ik.d;
import jk.a;
import kk.e;
import kk.i;
import p3.l0;
import rk.p;

@e(c = "androidx.datastore.preferences.core.PreferenceDataStore$updateData$2", f = "PreferenceDataStoreFactory.kt", l = {85}, m = "invokeSuspend")
/* compiled from: PreferenceDataStoreFactory.kt */
public final class b extends i implements p<e, d<? super e>, Object> {

    /* renamed from: a  reason: collision with root package name */
    public int f11019a;

    /* renamed from: b  reason: collision with root package name */
    public /* synthetic */ Object f11020b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ p<e, d<? super e>, Object> f11021c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public b(p<? super e, ? super d<? super e>, ? extends Object> pVar, d<? super b> dVar) {
        super(2, dVar);
        this.f11021c = pVar;
    }

    public final d<ek.i> create(Object obj, d<?> dVar) {
        b bVar = new b(this.f11021c, dVar);
        bVar.f11020b = obj;
        return bVar;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((b) create((e) obj, (d) obj2)).invokeSuspend(ek.i.f20112a);
    }

    public final Object invokeSuspend(Object obj) {
        a aVar = a.COROUTINE_SUSPENDED;
        int i10 = this.f11019a;
        if (i10 == 0) {
            l0.Q0(obj);
            p<e, d<? super e>, Object> pVar = this.f11021c;
            this.f11019a = 1;
            obj = pVar.invoke((e) this.f11020b, this);
            if (obj == aVar) {
                return aVar;
            }
        } else if (i10 == 1) {
            l0.Q0(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        e eVar = (e) obj;
        ((a) eVar).f11017b.set(true);
        return eVar;
    }
}
