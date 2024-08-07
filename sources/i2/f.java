package i2;

import i2.e;
import ik.d;
import java.util.LinkedHashMap;
import java.util.Map;
import jk.a;
import kk.e;
import kk.i;
import p3.l0;
import rk.p;
import sk.j;

@e(c = "androidx.datastore.preferences.core.PreferencesKt$edit$2", f = "Preferences.kt", l = {329}, m = "invokeSuspend")
/* compiled from: Preferences.kt */
public final class f extends i implements p<e, d<? super e>, Object> {

    /* renamed from: a  reason: collision with root package name */
    public int f11025a;

    /* renamed from: b  reason: collision with root package name */
    public /* synthetic */ Object f11026b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ p<a, d<? super ek.i>, Object> f11027c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public f(p<? super a, ? super d<? super ek.i>, ? extends Object> pVar, d<? super f> dVar) {
        super(2, dVar);
        this.f11027c = pVar;
    }

    public final d<ek.i> create(Object obj, d<?> dVar) {
        f fVar = new f(this.f11027c, dVar);
        fVar.f11026b = obj;
        return fVar;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((f) create((e) obj, (d) obj2)).invokeSuspend(ek.i.f20112a);
    }

    public final Object invokeSuspend(Object obj) {
        a aVar = a.COROUTINE_SUSPENDED;
        int i10 = this.f11025a;
        if (i10 == 0) {
            l0.Q0(obj);
            Map<e.a<?>, Object> a10 = ((e) this.f11026b).a();
            j.f(a10, "<this>");
            a aVar2 = new a((Map<e.a<?>, Object>) new LinkedHashMap(a10), false);
            p<a, d<? super ek.i>, Object> pVar = this.f11027c;
            this.f11026b = aVar2;
            this.f11025a = 1;
            if (pVar.invoke(aVar2, this) == aVar) {
                return aVar;
            }
            return aVar2;
        } else if (i10 == 1) {
            a aVar3 = (a) this.f11026b;
            l0.Q0(obj);
            return aVar3;
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
