package i9;

import com.google.crypto.tink.shaded.protobuf.i;
import com.google.crypto.tink.shaded.protobuf.n;
import j9.c;
import j9.q;
import j9.u;
import j9.x;

/* compiled from: HmacKey */
public final class v extends n<v, a> implements q {
    /* access modifiers changed from: private */
    public static final v DEFAULT_INSTANCE;
    public static final int KEY_VALUE_FIELD_NUMBER = 3;
    public static final int PARAMS_FIELD_NUMBER = 2;
    private static volatile u<v> PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private c keyValue_ = c.f11735b;
    private x params_;
    private int version_;

    /* compiled from: HmacKey */
    public static final class a extends n.a<v, a> implements q {
        public a() {
            super(v.DEFAULT_INSTANCE);
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
        v vVar = new v();
        DEFAULT_INSTANCE = vVar;
        n.B(v.class, vVar);
    }

    public static void E(v vVar) {
        vVar.version_ = 0;
    }

    public static void F(v vVar, x xVar) {
        vVar.getClass();
        xVar.getClass();
        vVar.params_ = xVar;
    }

    public static void G(v vVar, c.f fVar) {
        vVar.getClass();
        vVar.keyValue_ = fVar;
    }

    public static v H() {
        return DEFAULT_INSTANCE;
    }

    public static a L() {
        return (a) DEFAULT_INSTANCE.p();
    }

    public static v M(c cVar, i iVar) {
        return (v) n.z(DEFAULT_INSTANCE, cVar, iVar);
    }

    public final c I() {
        return this.keyValue_;
    }

    public final x J() {
        x xVar = this.params_;
        if (xVar == null) {
            return x.G();
        }
        return xVar;
    }

    public final int K() {
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
                return new x(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n", new Object[]{"version_", "params_", "keyValue_"});
            case 3:
                return new v();
            case 4:
                return new a();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                u<v> uVar = PARSER;
                if (uVar == null) {
                    synchronized (v.class) {
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
