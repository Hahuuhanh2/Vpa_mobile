package i9;

import com.google.crypto.tink.shaded.protobuf.n;
import j9.q;
import j9.u;

/* compiled from: HmacParams */
public final class x extends n<x, a> implements q {
    /* access modifiers changed from: private */
    public static final x DEFAULT_INSTANCE;
    public static final int HASH_FIELD_NUMBER = 1;
    private static volatile u<x> PARSER = null;
    public static final int TAG_SIZE_FIELD_NUMBER = 2;
    private int hash_;
    private int tagSize_;

    /* compiled from: HmacParams */
    public static final class a extends n.a<x, a> implements q {
        public a() {
            super(x.DEFAULT_INSTANCE);
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
        x xVar = new x();
        DEFAULT_INSTANCE = xVar;
        n.B(x.class, xVar);
    }

    public static void E(x xVar, u uVar) {
        xVar.getClass();
        xVar.hash_ = uVar.a();
    }

    public static void F(x xVar, int i10) {
        xVar.tagSize_ = i10;
    }

    public static x G() {
        return DEFAULT_INSTANCE;
    }

    public static a J() {
        return (a) DEFAULT_INSTANCE.p();
    }

    public final u H() {
        u b10 = u.b(this.hash_);
        if (b10 == null) {
            return u.UNRECOGNIZED;
        }
        return b10;
    }

    public final int I() {
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
                return new j9.x(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002\u000b", new Object[]{"hash_", "tagSize_"});
            case 3:
                return new x();
            case 4:
                return new a();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                u<x> uVar = PARSER;
                if (uVar == null) {
                    synchronized (x.class) {
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
