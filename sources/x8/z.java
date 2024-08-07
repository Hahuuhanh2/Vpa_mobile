package x8;

import com.google.crypto.tink.shaded.protobuf.i;
import com.google.crypto.tink.shaded.protobuf.x;
import d9.e;
import d9.q;
import i9.k0;
import i9.l0;
import i9.y;
import j9.c;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import k9.n;
import k9.o;
import k9.p;

/* compiled from: XChaCha20Poly1305KeyManager */
public final class z extends e<k0> {

    /* compiled from: XChaCha20Poly1305KeyManager */
    public class a extends q<w8.a, k0> {
        public a() {
            super(w8.a.class);
        }

        public final Object a(x xVar) {
            return new p(((k0) xVar).G().s());
        }
    }

    /* compiled from: XChaCha20Poly1305KeyManager */
    public class b extends e.a<l0, k0> {
        public b() {
            super(l0.class);
        }

        public final x a(x xVar) {
            l0 l0Var = (l0) xVar;
            k0.a I = k0.I();
            z.this.getClass();
            I.o();
            k0.E((k0) I.f7405b);
            byte[] a10 = n.a(32);
            c.f l10 = c.l(a10, 0, a10.length);
            I.o();
            k0.F((k0) I.f7405b, l10);
            return (k0) I.build();
        }

        public final Map<String, e.a.C0090a<l0>> b() {
            HashMap hashMap = new HashMap();
            hashMap.put("XCHACHA20_POLY1305", new e.a.C0090a(l0.E(), 1));
            hashMap.put("XCHACHA20_POLY1305_RAW", new e.a.C0090a(l0.E(), 3));
            return Collections.unmodifiableMap(hashMap);
        }

        public final x c(c cVar) {
            return l0.F(cVar, i.a());
        }

        public final /* bridge */ /* synthetic */ void d(x xVar) {
            l0 l0Var = (l0) xVar;
        }
    }

    public z() {
        super(k0.class, new a());
    }

    public final String b() {
        return "type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key";
    }

    public final e.a<l0, k0> d() {
        return new b();
    }

    public final y.b e() {
        return y.b.SYMMETRIC;
    }

    public final x f(c cVar) {
        return k0.J(cVar, i.a());
    }

    public final void g(x xVar) {
        k0 k0Var = (k0) xVar;
        o.c(k0Var.H());
        if (k0Var.G().size() != 32) {
            throw new GeneralSecurityException("invalid XChaCha20Poly1305Key: incorrect key length");
        }
    }
}
