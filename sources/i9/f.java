package i9;

import com.google.crypto.tink.shaded.protobuf.i;
import com.google.crypto.tink.shaded.protobuf.n;
import j9.c;
import j9.q;
import j9.u;
import j9.x;

/* compiled from: AesCtrKey */
public final class f extends n<f, a> implements q {
    /* access modifiers changed from: private */
    public static final f DEFAULT_INSTANCE;
    public static final int KEY_VALUE_FIELD_NUMBER = 3;
    public static final int PARAMS_FIELD_NUMBER = 2;
    private static volatile u<f> PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private c keyValue_ = c.f11735b;
    private h params_;
    private int version_;

    /* compiled from: AesCtrKey */
    public static final class a extends n.a<f, a> implements q {
        public a() {
            super(f.DEFAULT_INSTANCE);
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
        f fVar = new f();
        DEFAULT_INSTANCE = fVar;
        n.B(f.class, fVar);
    }

    public static void E(f fVar) {
        fVar.version_ = 0;
    }

    public static void F(f fVar, h hVar) {
        fVar.getClass();
        hVar.getClass();
        fVar.params_ = hVar;
    }

    public static void G(f fVar, c.f fVar2) {
        fVar.getClass();
        fVar.keyValue_ = fVar2;
    }

    public static f H() {
        return DEFAULT_INSTANCE;
    }

    public static a L() {
        return (a) DEFAULT_INSTANCE.p();
    }

    public static f M(c cVar, i iVar) {
        return (f) n.z(DEFAULT_INSTANCE, cVar, iVar);
    }

    public final c I() {
        return this.keyValue_;
    }

    public final h J() {
        h hVar = this.params_;
        if (hVar == null) {
            return h.F();
        }
        return hVar;
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
                return new f();
            case 4:
                return new a();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                u<f> uVar = PARSER;
                if (uVar == null) {
                    synchronized (f.class) {
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
