package i9;

import com.google.crypto.tink.shaded.protobuf.i;
import com.google.crypto.tink.shaded.protobuf.n;
import j9.c;
import j9.q;
import j9.u;
import j9.x;

/* compiled from: KmsEnvelopeAeadKeyFormat */
public final class h0 extends n<h0, a> implements q {
    /* access modifiers changed from: private */
    public static final h0 DEFAULT_INSTANCE;
    public static final int DEK_TEMPLATE_FIELD_NUMBER = 2;
    public static final int KEK_URI_FIELD_NUMBER = 1;
    private static volatile u<h0> PARSER;
    private a0 dekTemplate_;
    private String kekUri_ = "";

    /* compiled from: KmsEnvelopeAeadKeyFormat */
    public static final class a extends n.a<h0, a> implements q {
        public a() {
            super(h0.DEFAULT_INSTANCE);
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
        h0 h0Var = new h0();
        DEFAULT_INSTANCE = h0Var;
        n.B(h0.class, h0Var);
    }

    public static h0 E() {
        return DEFAULT_INSTANCE;
    }

    public static h0 I(c cVar, i iVar) {
        return (h0) n.z(DEFAULT_INSTANCE, cVar, iVar);
    }

    public final a0 F() {
        a0 a0Var = this.dekTemplate_;
        if (a0Var == null) {
            return a0.H();
        }
        return a0Var;
    }

    public final String G() {
        return this.kekUri_;
    }

    public final boolean H() {
        if (this.dekTemplate_ != null) {
            return true;
        }
        return false;
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
                return new x(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\t", new Object[]{"kekUri_", "dekTemplate_"});
            case 3:
                return new h0();
            case 4:
                return new a();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                u<h0> uVar = PARSER;
                if (uVar == null) {
                    synchronized (h0.class) {
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
