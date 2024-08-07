package i9;

import com.google.crypto.tink.shaded.protobuf.i;
import com.google.crypto.tink.shaded.protobuf.n;
import j9.c;
import j9.q;
import j9.u;
import j9.x;

/* compiled from: XChaCha20Poly1305KeyFormat */
public final class l0 extends n<l0, a> implements q {
    /* access modifiers changed from: private */
    public static final l0 DEFAULT_INSTANCE;
    private static volatile u<l0> PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private int version_;

    /* compiled from: XChaCha20Poly1305KeyFormat */
    public static final class a extends n.a<l0, a> implements q {
        public a() {
            super(l0.DEFAULT_INSTANCE);
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
        l0 l0Var = new l0();
        DEFAULT_INSTANCE = l0Var;
        n.B(l0.class, l0Var);
    }

    public static l0 E() {
        return DEFAULT_INSTANCE;
    }

    public static l0 F(c cVar, i iVar) {
        return (l0) n.z(DEFAULT_INSTANCE, cVar, iVar);
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
                return new x(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"version_"});
            case 3:
                return new l0();
            case 4:
                return new a();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                u<l0> uVar = PARSER;
                if (uVar == null) {
                    synchronized (l0.class) {
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
