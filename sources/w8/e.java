package w8;

import java.security.GeneralSecurityException;
import java.util.Set;
import w8.f;

/* compiled from: KeyManagerRegistry */
public final class e implements f.a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ d9.e f16715a;

    public e(d9.e eVar) {
        this.f16715a = eVar;
    }

    public final d a(Class cls) {
        try {
            return new d(this.f16715a, cls);
        } catch (IllegalArgumentException e10) {
            throw new GeneralSecurityException("Primitive type not supported", e10);
        }
    }

    public final d b() {
        d9.e eVar = this.f16715a;
        return new d(eVar, eVar.f8779c);
    }

    public final Class<?> c() {
        return this.f16715a.getClass();
    }

    public final Set<Class<?>> d() {
        return this.f16715a.f8778b.keySet();
    }
}
