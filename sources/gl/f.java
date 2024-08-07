package gl;

import al.b1;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;

/* compiled from: Dispatcher.kt */
public class f extends b1 {

    /* renamed from: c  reason: collision with root package name */
    public a f20484c;

    public f(int i10, int i11, long j10, String str) {
        this.f20484c = new a(i10, i11, j10, str);
    }

    public final void U(ik.f fVar, Runnable runnable) {
        a aVar = this.f20484c;
        AtomicLongFieldUpdater atomicLongFieldUpdater = a.f20460o;
        aVar.h(runnable, k.f20495g, true);
    }

    public final void s(ik.f fVar, Runnable runnable) {
        a aVar = this.f20484c;
        AtomicLongFieldUpdater atomicLongFieldUpdater = a.f20460o;
        aVar.h(runnable, k.f20495g, false);
    }
}
