package i9;

import com.google.crypto.tink.shaded.protobuf.n;
import j9.q;
import j9.u;
import j9.x;

/* compiled from: AesCmacParams */
public final class c extends n<c, a> implements q {
    /* access modifiers changed from: private */
    public static final c DEFAULT_INSTANCE;
    private static volatile u<c> PARSER = null;
    public static final int TAG_SIZE_FIELD_NUMBER = 1;
    private int tagSize_;

    /* compiled from: AesCmacParams */
    public static final class a extends n.a<c, a> implements q {
        public a() {
            super(c.DEFAULT_INSTANCE);
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
        c cVar = new c();
        DEFAULT_INSTANCE = cVar;
        n.B(c.class, cVar);
    }

    public static void E(c cVar) {
        cVar.tagSize_ = 16;
    }

    public static c F() {
        return DEFAULT_INSTANCE;
    }

    public static a H() {
        return (a) DEFAULT_INSTANCE.p();
    }

    public final int G() {
        return this.tagSize_;
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
                return new x(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"tagSize_"});
            case 3:
                return new c();
            case 4:
                return new a();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                u<c> uVar = PARSER;
                if (uVar == null) {
                    synchronized (c.class) {
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
