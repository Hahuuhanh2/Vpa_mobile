package androidx.lifecycle;

import androidx.lifecycle.b;
import androidx.lifecycle.i;
import java.util.List;
import r2.l;

@Deprecated
/* compiled from: ReflectiveGenericLifecycleObserver */
public final class u implements n {

    /* renamed from: a  reason: collision with root package name */
    public final Object f2827a;

    /* renamed from: b  reason: collision with root package name */
    public final b.a f2828b;

    public u(Object obj) {
        this.f2827a = obj;
        this.f2828b = b.f2733c.b(obj.getClass());
    }

    public final void q(l lVar, i.a aVar) {
        b.a aVar2 = this.f2828b;
        Object obj = this.f2827a;
        b.a.a((List) aVar2.f2736a.get(aVar), lVar, aVar, obj);
        b.a.a((List) aVar2.f2736a.get(i.a.ON_ANY), lVar, aVar, obj);
    }
}
