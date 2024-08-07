package q0;

import c0.u;
import i0.c;
import z0.b;

/* compiled from: ProcessCameraProvider */
public final class e implements c<Void> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ b.a f14277a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ u f14278b;

    public e(u uVar, b.a aVar) {
        this.f14277a = aVar;
        this.f14278b = uVar;
    }

    public final void a(Throwable th2) {
        this.f14277a.b(th2);
    }

    public final void onSuccess(Object obj) {
        Void voidR = (Void) obj;
        this.f14277a.a(this.f14278b);
    }
}
