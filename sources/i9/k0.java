package i9;

import com.google.crypto.tink.shaded.protobuf.i;
import com.google.crypto.tink.shaded.protobuf.n;
import j9.c;
import j9.q;
import j9.u;
import j9.x;

/* compiled from: XChaCha20Poly1305Key */
public final class k0 extends n<k0, a> implements q {
    /* access modifiers changed from: private */
    public static final k0 DEFAULT_INSTANCE;
    public static final int KEY_VALUE_FIELD_NUMBER = 3;
    private static volatile u<k0> PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private c keyValue_ = c.f11735b;
    private int version_;

    /* compiled from: XChaCha20Poly1305Key */
    public static final class a extends n.a<k0, a> implements q {
        public a() {
            super(k0.DEFAULT_INSTANCE);
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
        k0 k0Var = new k0();
        DEFAULT_INSTANCE = k0Var;
        n.B(k0.class, k0Var);
    }

    public static void E(k0 k0Var) {
        k0Var.version_ = 0;
    }

    public static void F(k0 k0Var, c.f fVar) {
        k0Var.getClass();
        k0Var.keyValue_ = fVar;
    }

    public static a I() {
        return (a) DEFAULT_INSTANCE.p();
    }

    public static k0 J(c cVar, i iVar) {
        return (k0) n.z(DEFAULT_INSTANCE, cVar, iVar);
    }

    public final c G() {
        return this.keyValue_;
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
                return new x(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0003\u0002\u0000\u0000\u0000\u0001\u000b\u0003\n", new Object[]{"version_", "keyValue_"});
            case 3:
                return new k0();
            case 4:
                return new a();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                u<k0> uVar = PARSER;
                if (uVar == null) {
                    synchronized (k0.class) {
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
