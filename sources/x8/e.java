package x8;

import com.google.crypto.tink.shaded.protobuf.i;
import com.google.crypto.tink.shaded.protobuf.x;
import d9.e;
import d9.q;
import i9.f;
import i9.g;
import i9.h;
import i9.y;
import j9.c;
import java.security.GeneralSecurityException;
import k9.j;
import k9.n;
import k9.o;

/* compiled from: AesCtrKeyManager */
public final class e extends d9.e<f> {

    /* compiled from: AesCtrKeyManager */
    public class a extends q<j, f> {
        public a() {
            super(j.class);
        }

        public final Object a(x xVar) {
            f fVar = (f) xVar;
            return new k9.a(fVar.I().s(), fVar.J().G());
        }
    }

    /* compiled from: AesCtrKeyManager */
    public class b extends e.a<g, f> {
        public b() {
            super(g.class);
        }

        public final x a(x xVar) {
            g gVar = (g) xVar;
            f.a L = f.L();
            h I = gVar.I();
            L.o();
            f.F((f) L.f7405b, I);
            byte[] a10 = n.a(gVar.H());
            c.f l10 = c.l(a10, 0, a10.length);
            L.o();
            f.G((f) L.f7405b, l10);
            e.this.getClass();
            L.o();
            f.E((f) L.f7405b);
            return (f) L.build();
        }

        public final x c(c cVar) {
            return g.K(cVar, i.a());
        }

        public final void d(x xVar) {
            g gVar = (g) xVar;
            o.a(gVar.H());
            e eVar = e.this;
            h I = gVar.I();
            eVar.getClass();
            if (I.G() < 12 || I.G() > 16) {
                throw new GeneralSecurityException("invalid IV size");
            }
        }
    }

    public e() {
        super(f.class, new a());
    }

    public final String b() {
        return "type.googleapis.com/google.crypto.tink.AesCtrKey";
    }

    public final e.a<g, f> d() {
        return new b();
    }

    public final y.b e() {
        return y.b.SYMMETRIC;
    }

    public final x f(c cVar) {
        return f.M(cVar, i.a());
    }

    public final void g(x xVar) {
        f fVar = (f) xVar;
        o.c(fVar.K());
        o.a(fVar.I().size());
        h J = fVar.J();
        if (J.G() < 12 || J.G() > 16) {
            throw new GeneralSecurityException("invalid IV size");
        }
    }
}
