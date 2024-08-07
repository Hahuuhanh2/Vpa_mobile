package k9;

import java.security.GeneralSecurityException;
import java.security.Provider;
import java.security.Security;
import java.util.ArrayList;
import java.util.Iterator;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import k9.i;

/* compiled from: EngineFactory */
public final class h<T_WRAPPER extends i<JcePrimitiveT>, JcePrimitiveT> {

    /* renamed from: b  reason: collision with root package name */
    public static final h<i.a, Cipher> f12092b = new h<>(new i.a());

    /* renamed from: c  reason: collision with root package name */
    public static final h<i.e, Mac> f12093c = new h<>(new i.e());

    /* renamed from: a  reason: collision with root package name */
    public final d<JcePrimitiveT> f12094a;

    /* compiled from: EngineFactory */
    public static class a<JcePrimitiveT> implements d<JcePrimitiveT> {

        /* renamed from: a  reason: collision with root package name */
        public final i<JcePrimitiveT> f12095a;

        public a(i iVar) {
            this.f12095a = iVar;
        }

        public final JcePrimitiveT a(String str) {
            String[] strArr = {"GmsCore_OpenSSL", "AndroidOpenSSL"};
            ArrayList arrayList = new ArrayList();
            for (int i10 = 0; i10 < 2; i10++) {
                Provider provider = Security.getProvider(strArr[i10]);
                if (provider != null) {
                    arrayList.add(provider);
                }
            }
            Iterator it = arrayList.iterator();
            Exception exc = null;
            while (it.hasNext()) {
                try {
                    return this.f12095a.a(str, (Provider) it.next());
                } catch (Exception e10) {
                    if (exc == null) {
                        exc = e10;
                    }
                }
            }
            return this.f12095a.a(str, (Provider) null);
        }
    }

    /* compiled from: EngineFactory */
    public static class b<JcePrimitiveT> implements d<JcePrimitiveT> {

        /* renamed from: a  reason: collision with root package name */
        public final i<JcePrimitiveT> f12096a;

        public b(i iVar) {
            this.f12096a = iVar;
        }

        public final JcePrimitiveT a(String str) {
            return this.f12096a.a(str, (Provider) null);
        }
    }

    /* compiled from: EngineFactory */
    public static class c<JcePrimitiveT> implements d<JcePrimitiveT> {

        /* renamed from: a  reason: collision with root package name */
        public final i<JcePrimitiveT> f12097a;

        public c(i iVar) {
            this.f12097a = iVar;
        }

        public final JcePrimitiveT a(String str) {
            String[] strArr = {"GmsCore_OpenSSL", "AndroidOpenSSL", "Conscrypt"};
            ArrayList arrayList = new ArrayList();
            for (int i10 = 0; i10 < 3; i10++) {
                Provider provider = Security.getProvider(strArr[i10]);
                if (provider != null) {
                    arrayList.add(provider);
                }
            }
            Iterator it = arrayList.iterator();
            Exception exc = null;
            while (it.hasNext()) {
                try {
                    return this.f12097a.a(str, (Provider) it.next());
                } catch (Exception e10) {
                    if (exc == null) {
                        exc = e10;
                    }
                }
            }
            throw new GeneralSecurityException("No good Provider found.", exc);
        }
    }

    /* compiled from: EngineFactory */
    public interface d<JcePrimitiveT> {
        JcePrimitiveT a(String str);
    }

    static {
        new h(new i.g());
        new h(new i.f());
        new h(new i.b());
        new h(new i.d());
        new h(new i.c());
    }

    public h(T_WRAPPER t_wrapper) {
        if (a9.a.a()) {
            this.f12094a = new c(t_wrapper);
        } else if (m9.b.F()) {
            this.f12094a = new a(t_wrapper);
        } else {
            this.f12094a = new b(t_wrapper);
        }
    }

    public final JcePrimitiveT a(String str) {
        return this.f12094a.a(str);
    }
}
