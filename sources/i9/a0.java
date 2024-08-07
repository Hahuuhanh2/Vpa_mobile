package i9;

import com.google.crypto.tink.shaded.protobuf.n;
import j9.c;
import j9.q;
import j9.u;
import j9.x;

/* compiled from: KeyTemplate */
public final class a0 extends n<a0, a> implements q {
    /* access modifiers changed from: private */
    public static final a0 DEFAULT_INSTANCE;
    public static final int OUTPUT_PREFIX_TYPE_FIELD_NUMBER = 3;
    private static volatile u<a0> PARSER = null;
    public static final int TYPE_URL_FIELD_NUMBER = 1;
    public static final int VALUE_FIELD_NUMBER = 2;
    private int outputPrefixType_;
    private String typeUrl_ = "";
    private c value_ = c.f11735b;

    /* compiled from: KeyTemplate */
    public static final class a extends n.a<a0, a> implements q {
        public a() {
            super(a0.DEFAULT_INSTANCE);
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
        a0 a0Var = new a0();
        DEFAULT_INSTANCE = a0Var;
        n.B(a0.class, a0Var);
    }

    public static void E(a0 a0Var, String str) {
        a0Var.getClass();
        str.getClass();
        a0Var.typeUrl_ = str;
    }

    public static void F(a0 a0Var, c.f fVar) {
        a0Var.getClass();
        a0Var.value_ = fVar;
    }

    public static void G(a0 a0Var, i0 i0Var) {
        a0Var.getClass();
        a0Var.outputPrefixType_ = i0Var.a();
    }

    public static a0 H() {
        return DEFAULT_INSTANCE;
    }

    public static a L() {
        return (a) DEFAULT_INSTANCE.p();
    }

    public final i0 I() {
        i0 b10 = i0.b(this.outputPrefixType_);
        if (b10 == null) {
            return i0.UNRECOGNIZED;
        }
        return b10;
    }

    public final String J() {
        return this.typeUrl_;
    }

    public final c K() {
        return this.value_;
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
                return new x(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\n\u0003\f", new Object[]{"typeUrl_", "value_", "outputPrefixType_"});
            case 3:
                return new a0();
            case 4:
                return new a();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                u<a0> uVar = PARSER;
                if (uVar == null) {
                    synchronized (a0.class) {
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
