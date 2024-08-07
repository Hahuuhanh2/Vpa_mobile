package x8;

import com.google.crypto.tink.shaded.protobuf.i;
import com.google.crypto.tink.shaded.protobuf.x;
import d9.e;
import d9.q;
import i9.n;
import i9.o;
import i9.y;
import j9.c;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: AesGcmSivKeyManager */
public final class o extends e<n> {

    /* compiled from: AesGcmSivKeyManager */
    public class a extends q<w8.a, n> {
        public a() {
            super(w8.a.class);
        }

        public final Object a(x xVar) {
            return new z8.a(((n) xVar).G().s());
        }
    }

    /* compiled from: AesGcmSivKeyManager */
    public class b extends e.a<i9.o, n> {
        public b() {
            super(i9.o.class);
        }

        public final x a(x xVar) {
            n.a I = n.I();
            byte[] a10 = k9.n.a(((i9.o) xVar).F());
            c.f l10 = c.l(a10, 0, a10.length);
            I.o();
            n.F((n) I.f7405b, l10);
            o.this.getClass();
            I.o();
            n.E((n) I.f7405b);
            return (n) I.build();
        }

        public final Map<String, e.a.C0090a<i9.o>> b() {
            HashMap hashMap = new HashMap();
            hashMap.put("AES128_GCM_SIV", o.h(16, 1));
            hashMap.put("AES128_GCM_SIV_RAW", o.h(16, 3));
            hashMap.put("AES256_GCM_SIV", o.h(32, 1));
            hashMap.put("AES256_GCM_SIV_RAW", o.h(32, 3));
            return Collections.unmodifiableMap(hashMap);
        }

        public final x c(c cVar) {
            return i9.o.H(cVar, i.a());
        }

        public final void d(x xVar) {
            k9.o.a(((i9.o) xVar).F());
        }
    }

    public o() {
        super(n.class, new a());
    }

    public static e.a.C0090a h(int i10, int i11) {
        o.a G = i9.o.G();
        G.o();
        i9.o.E((i9.o) G.f7405b, i10);
        return new e.a.C0090a((i9.o) G.build(), i11);
    }

    public final String b() {
        return "type.googleapis.com/google.crypto.tink.AesGcmSivKey";
    }

    public final e.a<i9.o, n> d() {
        return new b();
    }

    public final y.b e() {
        return y.b.SYMMETRIC;
    }

    public final x f(c cVar) {
        return n.J(cVar, i.a());
    }

    public final void g(x xVar) {
        n nVar = (n) xVar;
        k9.o.c(nVar.H());
        k9.o.a(nVar.G().size());
    }
}
