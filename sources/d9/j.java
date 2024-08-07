package d9;

import androidx.fragment.app.o;
import com.google.crypto.tink.internal.TinkBugException;
import d9.v;
import java.security.GeneralSecurityException;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: MutableSerializationRegistry */
public final class j {

    /* renamed from: b  reason: collision with root package name */
    public static final j f8789b = new j();

    /* renamed from: a  reason: collision with root package name */
    public final AtomicReference<v> f8790a = new AtomicReference<>(new v(new v.a()));

    public final o a(s sVar) {
        Class<s> cls = s.class;
        v vVar = this.f8790a.get();
        vVar.getClass();
        if (!vVar.f8812b.containsKey(new v.b(cls, sVar.f8806b))) {
            try {
                return new f(sVar);
            } catch (GeneralSecurityException e10) {
                throw new TinkBugException("Creating a LegacyProtoKey failed", e10);
            }
        } else {
            v vVar2 = this.f8790a.get();
            vVar2.getClass();
            v.b bVar = new v.b(cls, sVar.f8806b);
            if (vVar2.f8812b.containsKey(bVar)) {
                return ((b) vVar2.f8812b.get(bVar)).a(sVar);
            }
            throw new GeneralSecurityException("No Key Parser for requested key type " + bVar + " available");
        }
    }

    public final synchronized void b(a aVar) {
        v.a aVar2 = new v.a(this.f8790a.get());
        aVar2.a(aVar);
        this.f8790a.set(new v(aVar2));
    }

    public final synchronized void c(c cVar) {
        v.a aVar = new v.a(this.f8790a.get());
        aVar.b(cVar);
        this.f8790a.set(new v(aVar));
    }

    public final synchronized void d(k kVar) {
        v.a aVar = new v.a(this.f8790a.get());
        aVar.c(kVar);
        this.f8790a.set(new v(aVar));
    }

    public final synchronized void e(m mVar) {
        v.a aVar = new v.a(this.f8790a.get());
        aVar.d(mVar);
        this.f8790a.set(new v(aVar));
    }
}
