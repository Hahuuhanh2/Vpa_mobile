package androidx.fragment.app;

import f.b;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: Fragment */
public final class h extends b<Object> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ AtomicReference f2646a;

    public h(AtomicReference atomicReference) {
        this.f2646a = atomicReference;
    }

    public final void a(Object obj) {
        b bVar = (b) this.f2646a.get();
        if (bVar != null) {
            bVar.a(obj);
            return;
        }
        throw new IllegalStateException("Operation cannot be started before fragment is in created state");
    }

    public final void b() {
        b bVar = (b) this.f2646a.getAndSet((Object) null);
        if (bVar != null) {
            bVar.b();
        }
    }
}
