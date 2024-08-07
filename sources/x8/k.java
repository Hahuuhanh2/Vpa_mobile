package x8;

import a9.a;
import com.google.crypto.tink.shaded.protobuf.i;
import com.google.crypto.tink.shaded.protobuf.x;
import d9.e;
import d9.q;
import i9.l;
import i9.m;
import i9.y;
import j9.c;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import k9.c;
import k9.n;
import k9.o;

/* compiled from: AesGcmKeyManager */
public final class k extends e<l> {

    /* compiled from: AesGcmKeyManager */
    public class a extends q<w8.a, l> {
        public a() {
            super(w8.a.class);
        }

        public final Object a(x xVar) {
            return new c(((l) xVar).G().s());
        }
    }

    /* compiled from: AesGcmKeyManager */
    public class b extends e.a<m, l> {
        public b() {
            super(m.class);
        }

        public final x a(x xVar) {
            l.a I = l.I();
            byte[] a10 = n.a(((m) xVar).F());
            c.f l10 = j9.c.l(a10, 0, a10.length);
            I.o();
            l.F((l) I.f7405b, l10);
            k.this.getClass();
            I.o();
            l.E((l) I.f7405b);
            return (l) I.build();
        }

        public final Map<String, e.a.C0090a<m>> b() {
            HashMap hashMap = new HashMap();
            hashMap.put("AES128_GCM", k.h(16, 1));
            hashMap.put("AES128_GCM_RAW", k.h(16, 3));
            hashMap.put("AES256_GCM", k.h(32, 1));
            hashMap.put("AES256_GCM_RAW", k.h(32, 3));
            return Collections.unmodifiableMap(hashMap);
        }

        public final x c(j9.c cVar) {
            return m.H(cVar, i.a());
        }

        public final void d(x xVar) {
            o.a(((m) xVar).F());
        }
    }

    public k() {
        super(l.class, new a());
    }

    public static e.a.C0090a h(int i10, int i11) {
        m.a G = m.G();
        G.o();
        m.E((m) G.f7405b, i10);
        return new e.a.C0090a((m) G.build(), i11);
    }

    public final a.C0003a a() {
        return a.C0003a.f117b;
    }

    public final String b() {
        return "type.googleapis.com/google.crypto.tink.AesGcmKey";
    }

    public final e.a<m, l> d() {
        return new b();
    }

    public final y.b e() {
        return y.b.SYMMETRIC;
    }

    public final x f(j9.c cVar) {
        return l.J(cVar, i.a());
    }

    public final void g(x xVar) {
        l lVar = (l) xVar;
        o.c(lVar.H());
        o.a(lVar.G().size());
    }
}
