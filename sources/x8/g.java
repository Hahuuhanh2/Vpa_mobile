package x8;

import com.google.crypto.tink.shaded.protobuf.x;
import d9.e;
import d9.q;
import i9.i;
import i9.j;
import i9.k;
import i9.y;
import j9.c;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import k9.n;
import k9.o;

/* compiled from: AesEaxKeyManager */
public final class g extends e<i> {

    /* compiled from: AesEaxKeyManager */
    public class a extends q<w8.a, i> {
        public a() {
            super(w8.a.class);
        }

        public final Object a(x xVar) {
            i iVar = (i) xVar;
            return new k9.b(iVar.H().s(), iVar.I().G());
        }
    }

    /* compiled from: AesEaxKeyManager */
    public class b extends e.a<j, i> {
        public b() {
            super(j.class);
        }

        public final x a(x xVar) {
            j jVar = (j) xVar;
            i.a K = i.K();
            byte[] a10 = n.a(jVar.G());
            c.f l10 = c.l(a10, 0, a10.length);
            K.o();
            i.G((i) K.f7405b, l10);
            k H = jVar.H();
            K.o();
            i.F((i) K.f7405b, H);
            g.this.getClass();
            K.o();
            i.E((i) K.f7405b);
            return (i) K.build();
        }

        public final Map<String, e.a.C0090a<j>> b() {
            HashMap hashMap = new HashMap();
            hashMap.put("AES128_EAX", g.h(16, 1));
            hashMap.put("AES128_EAX_RAW", g.h(16, 3));
            hashMap.put("AES256_EAX", g.h(32, 1));
            hashMap.put("AES256_EAX_RAW", g.h(32, 3));
            return Collections.unmodifiableMap(hashMap);
        }

        public final x c(c cVar) {
            return j.J(cVar, com.google.crypto.tink.shaded.protobuf.i.a());
        }

        public final void d(x xVar) {
            j jVar = (j) xVar;
            o.a(jVar.G());
            if (jVar.H().G() != 12 && jVar.H().G() != 16) {
                throw new GeneralSecurityException("invalid IV size; acceptable values have 12 or 16 bytes");
            }
        }
    }

    public g() {
        super(i.class, new a());
    }

    public static e.a.C0090a h(int i10, int i11) {
        j.a I = j.I();
        I.o();
        j.F((j) I.f7405b, i10);
        k.a H = k.H();
        H.o();
        k.E((k) H.f7405b);
        I.o();
        j.E((j) I.f7405b, (k) H.build());
        return new e.a.C0090a((j) I.build(), i11);
    }

    public final String b() {
        return "type.googleapis.com/google.crypto.tink.AesEaxKey";
    }

    public final e.a<j, i> d() {
        return new b();
    }

    public final y.b e() {
        return y.b.SYMMETRIC;
    }

    public final x f(c cVar) {
        return i.L(cVar, com.google.crypto.tink.shaded.protobuf.i.a());
    }

    public final void g(x xVar) {
        i iVar = (i) xVar;
        o.c(iVar.J());
        o.a(iVar.H().size());
        if (iVar.I().G() != 12 && iVar.I().G() != 16) {
            throw new GeneralSecurityException("invalid IV size; acceptable values have 12 or 16 bytes");
        }
    }
}
