package d9;

import d9.r;
import java.security.GeneralSecurityException;
import java.util.concurrent.atomic.AtomicReference;
import w8.o;

/* compiled from: MutablePrimitiveRegistry */
public final class i {

    /* renamed from: b  reason: collision with root package name */
    public static i f8787b = new i();

    /* renamed from: a  reason: collision with root package name */
    public final AtomicReference<r> f8788a = new AtomicReference<>(new r(new r.a()));

    public final <WrapperPrimitiveT> Class<?> a(Class<WrapperPrimitiveT> cls) {
        r rVar = this.f8788a.get();
        if (rVar.f8800b.containsKey(cls)) {
            return ((o) rVar.f8800b.get(cls)).a();
        }
        throw new GeneralSecurityException("No input primitive class for " + cls + " available");
    }

    public final synchronized void b(o oVar) {
        r.a aVar = new r.a(this.f8788a.get());
        aVar.a(oVar);
        this.f8788a.set(new r(aVar));
    }
}
