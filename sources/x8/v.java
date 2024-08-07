package x8;

import com.google.crypto.tink.shaded.protobuf.i;
import com.google.crypto.tink.shaded.protobuf.x;
import d9.e;
import d9.q;
import i9.e0;
import i9.f0;
import i9.y;
import j9.c;
import k9.o;
import w8.l;

/* compiled from: KmsAeadKeyManager */
public final class v extends e<e0> {

    /* compiled from: KmsAeadKeyManager */
    public class a extends q<w8.a, e0> {
        public a() {
            super(w8.a.class);
        }

        public final Object a(x xVar) {
            String F = ((e0) xVar).G().F();
            return l.a(F).b(F);
        }
    }

    /* compiled from: KmsAeadKeyManager */
    public class b extends e.a<f0, e0> {
        public b() {
            super(f0.class);
        }

        public final x a(x xVar) {
            e0.a I = e0.I();
            I.o();
            e0.F((e0) I.f7405b, (f0) xVar);
            v.this.getClass();
            I.o();
            e0.E((e0) I.f7405b);
            return (e0) I.build();
        }

        public final x c(c cVar) {
            return f0.G(cVar, i.a());
        }

        public final /* bridge */ /* synthetic */ void d(x xVar) {
            f0 f0Var = (f0) xVar;
        }
    }

    public v() {
        super(e0.class, new a());
    }

    public final String b() {
        return "type.googleapis.com/google.crypto.tink.KmsAeadKey";
    }

    public final e.a<f0, e0> d() {
        return new b();
    }

    public final y.b e() {
        return y.b.REMOTE;
    }

    public final x f(c cVar) {
        return e0.J(cVar, i.a());
    }

    public final void g(x xVar) {
        o.c(((e0) xVar).H());
    }
}
