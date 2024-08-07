package i9;

import com.google.crypto.tink.shaded.protobuf.n;
import j9.q;
import j9.u;
import j9.x;

/* compiled from: AesCtrParams */
public final class h extends n<h, a> implements q {
    /* access modifiers changed from: private */
    public static final h DEFAULT_INSTANCE;
    public static final int IV_SIZE_FIELD_NUMBER = 1;
    private static volatile u<h> PARSER;
    private int ivSize_;

    /* compiled from: AesCtrParams */
    public static final class a extends n.a<h, a> implements q {
        public a() {
            super(h.DEFAULT_INSTANCE);
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
        h hVar = new h();
        DEFAULT_INSTANCE = hVar;
        n.B(h.class, hVar);
    }

    public static void E(h hVar) {
        hVar.ivSize_ = 16;
    }

    public static h F() {
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
                return new h();
            case 4:
                return new a();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                u<h> uVar = PARSER;
                if (uVar == null) {
                    synchronized (h.class) {
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
