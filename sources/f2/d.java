package f2;

import f2.g;
import java.util.List;
import jk.a;
import kk.e;
import kk.i;
import p3.l0;
import rk.p;

@e(c = "androidx.datastore.core.DataMigrationInitializer$Companion$getInitializer$1", f = "DataMigrationInitializer.kt", l = {33}, m = "invokeSuspend")
/* compiled from: DataMigrationInitializer.kt */
public final class d extends i implements p<j<Object>, ik.d<? super ek.i>, Object> {

    /* renamed from: a  reason: collision with root package name */
    public int f9777a;

    /* renamed from: b  reason: collision with root package name */
    public /* synthetic */ Object f9778b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ List<c<Object>> f9779c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public d(List<? extends c<Object>> list, ik.d<? super d> dVar) {
        super(2, dVar);
        this.f9779c = list;
    }

    public final ik.d<ek.i> create(Object obj, ik.d<?> dVar) {
        d dVar2 = new d(this.f9779c, dVar);
        dVar2.f9778b = obj;
        return dVar2;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((d) create((j) obj, (ik.d) obj2)).invokeSuspend(ek.i.f20112a);
    }

    public final Object invokeSuspend(Object obj) {
        a aVar = a.COROUTINE_SUSPENDED;
        int i10 = this.f9777a;
        if (i10 == 0) {
            l0.Q0(obj);
            g.a aVar2 = g.f9794a;
            List<c<Object>> list = this.f9779c;
            this.f9777a = 1;
            if (g.a.a(aVar2, list, (j) this.f9778b, this) == aVar) {
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
