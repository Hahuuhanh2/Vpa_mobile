package bc;

import hc.a;
import hc.b;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: Gson */
public final class f extends u<AtomicLong> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ u f4142a;

    public f(u uVar) {
        this.f4142a = uVar;
    }

    public final Object a(a aVar) {
        return new AtomicLong(((Number) this.f4142a.a(aVar)).longValue());
    }

    public final void b(b bVar, Object obj) {
        this.f4142a.b(bVar, Long.valueOf(((AtomicLong) obj).get()));
    }
}
