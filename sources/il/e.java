package il;

import ek.i;
import rk.l;
import sk.k;

/* compiled from: Mutex.kt */
public final class e extends k implements l<Throwable, i> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ d f20663a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f20664b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public e(d dVar, Object obj) {
        super(1);
        this.f20663a = dVar;
        this.f20664b = obj;
    }

    public final Object invoke(Object obj) {
        Throwable th2 = (Throwable) obj;
        this.f20663a.b(this.f20664b);
        return i.f20112a;
    }
}
