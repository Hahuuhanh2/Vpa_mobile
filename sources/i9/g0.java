package i9;

import com.google.crypto.tink.shaded.protobuf.i;
import com.google.crypto.tink.shaded.protobuf.n;
import j9.c;
import j9.q;
import j9.u;
import j9.x;

/* compiled from: KmsEnvelopeAeadKey */
public final class g0 extends n<g0, a> implements q {
    /* access modifiers changed from: private */
    public static final g0 DEFAULT_INSTANCE;
    public static final int PARAMS_FIELD_NUMBER = 2;
    private static volatile u<g0> PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private h0 params_;
    private int version_;

    /* compiled from: KmsEnvelopeAeadKey */
    public static final class a extends n.a<g0, a> implements q {
        public a() {
            super(g0.DEFAULT_INSTANCE);
        }

        public final /* bridge */ /* synthetic */ n build() {
            return build();
        }

        public final /* bridge */ /* synthetic */ Object clone() {
            return clone();
        }

        public final n g() {
            return this.f7404a;
        }

        public final /* bridge */ /* synthetic */ n n0() {
            return n0();
        }
    }

    static {
        g0 g0Var = new g0();
        DEFAULT_INSTANCE = g0Var;
        n.B(g0.class, g0Var);
    }

    public static void E(g0 g0Var) {
        g0Var.version_ = 0;
    }

    public static void F(g0 g0Var, h0 h0Var) {
        g0Var.getClass();
        h0Var.getClass();
        g0Var.params_ = h0Var;
    }

    public static a I() {
        return (a) DEFAULT_INSTANCE.p();
    }

    public static g0 J(c cVar, i iVar) {
        return (g0) n.z(DEFAULT_INSTANCE, cVar, iVar);
    }

    public final h0 G() {
        h0 h0Var = this.params_;
        if (h0Var == null) {
            return h0.E();
        }
        return h0Var;
    }

    public final int H() {
        return this.version_;
    }

    public final /* bridge */ /* synthetic */ n.a a() {
        return a();
    }

    public final /* bridge */ /* synthetic */ n.a e() {
        return e();
    }

    public final /* bridge */ /* synthetic */ n g() {
        return g();
    }

    public final Object q(n.f fVar) {
        switch (fVar.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new x(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\t", new Object[]{"version_", "params_"});
            case 3:
                return new g0();
            case 4:
                return new a();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                u<g0> uVar = PARSER;
                if (uVar == null) {
                    synchronized (g0.class) {
                        try {
                            uVar = PARSER;
                            if (uVar == null) {
                                uVar = new n.b<>(DEFAULT_INSTANCE);
                                PARSER = uVar;
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                }
                return uVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}