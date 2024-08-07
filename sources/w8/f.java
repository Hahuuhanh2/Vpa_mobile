package w8;

import com.google.crypto.tink.shaded.protobuf.x;
import d9.e;
import j$.util.concurrent.ConcurrentHashMap;
import java.security.GeneralSecurityException;
import java.util.Set;
import java.util.logging.Logger;

/* compiled from: KeyManagerRegistry */
public final class f {

    /* renamed from: b  reason: collision with root package name */
    public static final Logger f16716b = Logger.getLogger(f.class.getName());

    /* renamed from: a  reason: collision with root package name */
    public final ConcurrentHashMap f16717a;

    /* compiled from: KeyManagerRegistry */
    public interface a {
        d a(Class cls);

        d b();

        Class<?> c();

        Set<Class<?>> d();
    }

    public f(f fVar) {
        this.f16717a = new ConcurrentHashMap(fVar.f16717a);
    }

    public final synchronized a a(String str) {
        if (this.f16717a.containsKey(str)) {
        } else {
            throw new GeneralSecurityException("No key manager found for key type " + str);
        }
        return (a) this.f16717a.get(str);
    }

    public final synchronized <KeyProtoT extends x> void b(e<KeyProtoT> eVar) {
        if (eVar.a().b()) {
            c(new e(eVar));
        } else {
            throw new GeneralSecurityException("failed to register key manager " + eVar.getClass() + " as it is not FIPS compatible.");
        }
    }

    public final synchronized void c(e eVar) {
        String b10 = eVar.b().f16713a.b();
        a aVar = (a) this.f16717a.get(b10);
        if (aVar != null) {
            if (!aVar.c().equals(eVar.c())) {
                Logger logger = f16716b;
                logger.warning("Attempted overwrite of a registered key manager for key type " + b10);
                throw new GeneralSecurityException(String.format("typeUrl (%s) is already registered with %s, cannot be re-registered with %s", new Object[]{b10, aVar.c().getName(), eVar.c().getName()}));
            }
        }
        this.f16717a.putIfAbsent(b10, eVar);
    }

    public f() {
        this.f16717a = new ConcurrentHashMap();
    }
}
