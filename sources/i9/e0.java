package i9;

import com.google.crypto.tink.shaded.protobuf.i;
import com.google.crypto.tink.shaded.protobuf.n;
import j9.c;
import j9.q;
import j9.u;
import j9.x;

/* compiled from: KmsAeadKey */
public final class e0 extends n<e0, a> implements q {
    /* access modifiers changed from: private */
    public static final e0 DEFAULT_INSTANCE;
    public static final int PARAMS_FIELD_NUMBER = 2;
    private static volatile u<e0> PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private f0 params_;
    private int version_;

    /* compiled from: KmsAeadKey */
    public static final class a extends n.a<e0, a> implements q {
        public a() {
            super(e0.DEFAULT_INSTANCE);
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
        e0 e0Var = new e0();
        DEFAULT_INSTANCE = e0Var;
        n.B(e0.class, e0Var);
    }

    public static void E(e0 e0Var) {
        e0Var.version_ = 0;
    }

    public static void F(e0 e0Var, f0 f0Var) {
        e0Var.getClass();
        f0Var.getClass();
        e0Var.params_ = f0Var;
    }

    public static a I() {
        return (a) DEFAULT_INSTANCE.p();
    }

    public static e0 J(c cVar, i iVar) {
        return (e0) n.z(DEFAULT_INSTANCE, cVar, iVar);
    }

    public final f0 G() {
        f0 f0Var = this.params_;
        if (f0Var == null) {
            return f0.E();
        }
        return f0Var;
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
                return new e0();
            case 4:
                return new a();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                u<e0> uVar = PARSER;
                if (uVar == null) {
                    synchronized (e0.class) {
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
