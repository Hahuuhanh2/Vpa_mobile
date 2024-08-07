package c0;

import al.g0;
import c0.d1;
import i0.c;
import v8.a;
import z0.b;

/* compiled from: SurfaceRequest */
public final class a1 implements c<Void> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ b.a f4179a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ a f4180b;

    public a1(b.a aVar, b.d dVar) {
        this.f4179a = aVar;
        this.f4180b = dVar;
    }

    public final void a(Throwable th2) {
        if (th2 instanceof d1.b) {
            g0.E((String) null, this.f4180b.cancel(false));
        } else {
            g0.E((String) null, this.f4179a.a(null));
        }
    }

    public final void onSuccess(Object obj) {
        Void voidR = (Void) obj;
        g0.E((String) null, this.f4179a.a(null));
    }
}
