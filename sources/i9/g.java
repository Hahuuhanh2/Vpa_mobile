package i9;

import com.google.crypto.tink.shaded.protobuf.i;
import com.google.crypto.tink.shaded.protobuf.n;
import j9.c;
import j9.q;
import j9.u;
import j9.x;

/* compiled from: AesCtrKeyFormat */
public final class g extends n<g, a> implements q {
    /* access modifiers changed from: private */
    public static final g DEFAULT_INSTANCE;
    public static final int KEY_SIZE_FIELD_NUMBER = 2;
    public static final int PARAMS_FIELD_NUMBER = 1;
    private static volatile u<g> PARSER;
    private int keySize_;
    private h params_;

    /* compiled from: AesCtrKeyFormat */
    public static final class a extends n.a<g, a> implements q {
        public a() {
            super(g.DEFAULT_INSTANCE);
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
        g gVar = new g();
        DEFAULT_INSTANCE = gVar;
        n.B(g.class, gVar);
    }

    public static void E(g gVar, h hVar) {
        gVar.getClass();
        gVar.params_ = hVar;
    }

    public static void F(g gVar, int i10) {
        gVar.keySize_ = i10;
    }

    public static g G() {
        return DEFAULT_INSTANCE;
    }

    public static a J() {
        return (a) DEFAULT_INSTANCE.p();
    }

    public static g K(c cVar, i iVar) {
        return (g) n.z(DEFAULT_INSTANCE, cVar, iVar);
    }

    public final int H() {
        return this.keySize_;
    }

    public final h I() {
        h hVar = this.params_;
        if (hVar == null) {
            return h.F();
        }
        return hVar;
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
                return new x(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\u000b", new Object[]{"params_", "keySize_"});
            case 3:
                return new g();
            case 4:
                return new a();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                u<g> uVar = PARSER;
                if (uVar == null) {
                    synchronized (g.class) {
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
