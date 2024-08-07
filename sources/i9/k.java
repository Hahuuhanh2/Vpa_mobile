package i9;

import com.google.crypto.tink.shaded.protobuf.n;
import j9.q;
import j9.u;
import j9.x;

/* compiled from: AesEaxParams */
public final class k extends n<k, a> implements q {
    /* access modifiers changed from: private */
    public static final k DEFAULT_INSTANCE;
    public static final int IV_SIZE_FIELD_NUMBER = 1;
    private static volatile u<k> PARSER;
    private int ivSize_;

    /* compiled from: AesEaxParams */
    public static final class a extends n.a<k, a> implements q {
        public a() {
            super(k.DEFAULT_INSTANCE);
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
        k kVar = new k();
        DEFAULT_INSTANCE = kVar;
        n.B(k.class, kVar);
    }

    public static void E(k kVar) {
        kVar.ivSize_ = 16;
    }

    public static k F() {
        return DEFAULT_INSTANCE;
    }

    public static a H() {
        return (a) DEFAULT_INSTANCE.p();
    }

    public final int G() {
        return this.ivSize_;
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
                return new x(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"ivSize_"});
            case 3:
                return new k();
            case 4:
                return new a();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                u<k> uVar = PARSER;
                if (uVar == null) {
                    synchronized (k.class) {
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
