package i9;

import com.google.crypto.tink.shaded.protobuf.b0;
import com.google.crypto.tink.shaded.protobuf.n;
import com.google.crypto.tink.shaded.protobuf.p;
import j9.q;
import j9.u;
import j9.x;

@Deprecated
/* compiled from: RegistryConfig */
public final class j0 extends n<j0, a> implements q {
    public static final int CONFIG_NAME_FIELD_NUMBER = 1;
    /* access modifiers changed from: private */
    public static final j0 DEFAULT_INSTANCE;
    public static final int ENTRY_FIELD_NUMBER = 2;
    private static volatile u<j0> PARSER;
    private String configName_ = "";
    private p.c<b0> entry_ = b0.f7330d;

    /* compiled from: RegistryConfig */
    public static final class a extends n.a<j0, a> implements q {
        public a() {
            super(j0.DEFAULT_INSTANCE);
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
        j0 j0Var = new j0();
        DEFAULT_INSTANCE = j0Var;
        n.B(j0.class, j0Var);
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
                return new x(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001Ȉ\u0002\u001b", new Object[]{"configName_", "entry_", b0.class});
            case 3:
                return new j0();
            case 4:
                return new a();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                u<j0> uVar = PARSER;
                if (uVar == null) {
                    synchronized (j0.class) {
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
