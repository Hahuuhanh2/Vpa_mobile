package ul;

import ek.i;
import sk.k;

/* compiled from: KotlinExtensions.kt */
public final class l extends k implements rk.l<Throwable, i> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ b f23124a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public l(b bVar) {
        super(1);
        this.f23124a = bVar;
    }

    public final Object invoke(Object obj) {
        Throwable th2 = (Throwable) obj;
        this.f23124a.cancel();
        return i.f20112a;
    }
}
