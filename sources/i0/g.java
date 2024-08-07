package i0;

import i0.f;
import p.a;
import z0.b;

/* compiled from: Futures */
public final class g implements c<Object> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ b.a f10908a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ a f10909b;

    public g(b.a aVar) {
        f.a aVar2 = f.f10905a;
        this.f10908a = aVar;
        this.f10909b = aVar2;
    }

    public final void a(Throwable th2) {
        this.f10908a.b(th2);
    }

    public final void onSuccess(Object obj) {
        try {
            this.f10908a.a(this.f10909b.apply(obj));
        } catch (Throwable th2) {
            this.f10908a.b(th2);
        }
    }
}
