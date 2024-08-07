package i9;

import com.google.crypto.tink.shaded.protobuf.i;
import com.google.crypto.tink.shaded.protobuf.n;
import j9.c;
import j9.q;
import j9.u;
import j9.x;

/* compiled from: HmacKeyFormat */
public final class w extends n<w, a> implements q {
    /* access modifiers changed from: private */
    public static final w DEFAULT_INSTANCE;
    public static final int KEY_SIZE_FIELD_NUMBER = 2;
    public static final int PARAMS_FIELD_NUMBER = 1;
    private static volatile u<w> PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 3;
    private int keySize_;
    private x params_;
    private int version_;

    /* compiled from: HmacKeyFormat */
    public static final class a extends n.a<w, a> implements q {
        public a() {
            super(w.DEFAULT_INSTANCE);
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
        w wVar = new w();
        DEFAULT_INSTANCE = wVar;
        n.B(w.class, wVar);
    }

    public static void E(w wVar, x xVar) {
        wVar.getClass();
        wVar.params_ = xVar;
    }

    public static void F(w wVar, int i10) {
        wVar.keySize_ = i10;
    }

    public static w G() {
        return DEFAULT_INSTANCE;
    }

    public static a J() {
        return (a) DEFAULT_INSTANCE.p();
    }

    public static w K(c cVar, i iVar) {
        return (w) n.z(DEFAULT_INSTANCE, cVar, iVar);
    }

    public final int H() {
        return this.keySize_;
    }

    public final x I() {
        x xVar = this.params_;
        if (xVar == null) {
            return x.G();
        }
        return xVar;
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
                return new x(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\t\u0002\u000b\u0003\u000b", new Object[]{"params_", "keySize_", "version_"});
            case 3:
                return new w();
            case 4:
                return new a();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                u<w> uVar = PARSER;
                if (uVar == null) {
                    synchronized (w.class) {
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
