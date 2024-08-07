package ul;

import ek.i;
import rk.l;
import sk.k;

/* compiled from: KotlinExtensions.kt */
public final class n extends k implements l<Throwable, i> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ b f23126a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public n(b bVar) {
        super(1);
        this.f23126a = bVar;
    }

    public final Object invoke(Object obj) {
        Throwable th2 = (Throwable) obj;
        this.f23126a.cancel();
        return i.f20112a;
    }
}
