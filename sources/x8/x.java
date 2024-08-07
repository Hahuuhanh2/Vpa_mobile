package x8;

import com.google.crypto.tink.shaded.protobuf.i;
import d9.e;
import d9.q;
import i9.g0;
import i9.h0;
import i9.y;
import j9.c;
import java.security.GeneralSecurityException;
import k9.o;
import w8.l;

/* compiled from: KmsEnvelopeAeadKeyManager */
public final class x extends e<g0> {

    /* compiled from: KmsEnvelopeAeadKeyManager */
    public class a extends q<w8.a, g0> {
        public a() {
            super(w8.a.class);
        }

        public final Object a(com.google.crypto.tink.shaded.protobuf.x xVar) {
            g0 g0Var = (g0) xVar;
            String G = g0Var.G().G();
            return new w(g0Var.G().F(), l.a(G).b(G));
        }
    }

    /* compiled from: KmsEnvelopeAeadKeyManager */
    public class b extends e.a<h0, g0> {
        public b() {
            super(h0.class);
        }

        public final com.google.crypto.tink.shaded.protobuf.x a(com.google.crypto.tink.shaded.protobuf.x xVar) {
            g0.a I = g0.I();
            I.o();
            g0.F((g0) I.f7405b, (h0) xVar);
            x.this.getClass();
            I.o();
            g0.E((g0) I.f7405b);
            return (g0) I.build();
        }

        public final com.google.crypto.tink.shaded.protobuf.x c(c cVar) {
            return h0.I(cVar, i.a());
        }

        public final void d(com.google.crypto.tink.shaded.protobuf.x xVar) {
            h0 h0Var = (h0) xVar;
            if (h0Var.G().isEmpty() || !h0Var.H()) {
                throw new GeneralSecurityException("invalid key format: missing KEK URI or DEK template");
            }
        }
    }

    public x() {
        super(g0.class, new a());
    }

    public final String b() {
        return "type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey";
    }

    public final e.a<h0, g0> d() {
        return new b();
    }

    public final y.b e() {
        return y.b.REMOTE;
    }

    public final com.google.crypto.tink.shaded.protobuf.x f(c cVar) {
        return g0.J(cVar, i.a());
    }

    public final void g(com.google.crypto.tink.shaded.protobuf.x xVar) {
        o.c(((g0) xVar).H());
    }
}
