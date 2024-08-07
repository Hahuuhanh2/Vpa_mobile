package x8;

import com.google.crypto.tink.shaded.protobuf.i;
import com.google.crypto.tink.shaded.protobuf.x;
import d9.e;
import d9.q;
import i9.r;
import i9.y;
import j9.c;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import k9.f;
import k9.n;
import k9.o;

/* compiled from: ChaCha20Poly1305KeyManager */
public final class s extends e<r> {

    /* compiled from: ChaCha20Poly1305KeyManager */
    public class a extends q<w8.a, r> {
        public a() {
            super(w8.a.class);
        }

        public final Object a(x xVar) {
            return new f(((r) xVar).G().s());
        }
    }

    /* compiled from: ChaCha20Poly1305KeyManager */
    public class b extends e.a<i9.s, r> {
        public b() {
            super(i9.s.class);
        }

        public final x a(x xVar) {
            i9.s sVar = (i9.s) xVar;
            r.a I = r.I();
            s.this.getClass();
            I.o();
            r.E((r) I.f7405b);
            byte[] a10 = n.a(32);
            c.f l10 = c.l(a10, 0, a10.length);
            I.o();
            r.F((r) I.f7405b, l10);
            return (r) I.build();
        }

        public final Map<String, e.a.C0090a<i9.s>> b() {
            HashMap hashMap = new HashMap();
            hashMap.put("CHACHA20_POLY1305", new e.a.C0090a(i9.s.E(), 1));
            hashMap.put("CHACHA20_POLY1305_RAW", new e.a.C0090a(i9.s.E(), 3));
            return Collections.unmodifiableMap(hashMap);
        }

        public final x c(c cVar) {
            return i9.s.F(cVar, i.a());
        }

        public final /* bridge */ /* synthetic */ void d(x xVar) {
            i9.s sVar = (i9.s) xVar;
        }
    }

    public s() {
        super(r.class, new a());
    }

    public final String b() {
        return "type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key";
    }

    public final e.a<i9.s, r> d() {
        return new b();
    }

    public final y.b e() {
        return y.b.SYMMETRIC;
    }

    public final x f(c cVar) {
        return r.J(cVar, i.a());
    }

    public final void g(x xVar) {
        r rVar = (r) xVar;
        o.c(rVar.H());
        if (rVar.G().size() != 32) {
            throw new GeneralSecurityException("invalid ChaCha20Poly1305Key: incorrect key length");
        }
    }
}
