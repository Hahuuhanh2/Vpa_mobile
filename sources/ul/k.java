package ul;

import ek.i;
import rk.l;

/* compiled from: KotlinExtensions.kt */
public final class k extends sk.k implements l<Throwable, i> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ b f23123a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public k(b bVar) {
        super(1);
        this.f23123a = bVar;
    }

    public final Object invoke(Object obj) {
        Throwable th2 = (Throwable) obj;
        this.f23123a.cancel();
        return i.f20112a;
    }
}
