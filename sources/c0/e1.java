package c0;

import i0.c;
import n0.q;

/* compiled from: SurfaceRequest */
public final class e1 implements c<Void> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Runnable f4248a;

    public e1(q qVar) {
        this.f4248a = qVar;
    }

    public final void a(Throwable th2) {
    }

    public final void onSuccess(Object obj) {
        Void voidR = (Void) obj;
        this.f4248a.run();
    }
}
