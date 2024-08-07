package i9;

import com.google.crypto.tink.shaded.protobuf.i;
import com.google.crypto.tink.shaded.protobuf.n;
import j9.c;
import j9.q;
import j9.u;
import j9.x;

/* compiled from: AesSivKey */
public final class p extends n<p, a> implements q {
    /* access modifiers changed from: private */
    public static final p DEFAULT_INSTANCE;
    public static final int KEY_VALUE_FIELD_NUMBER = 2;
    private static volatile u<p> PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private c keyValue_ = c.f11735b;
    private int version_;

    /* compiled from: AesSivKey */
    public static final class a extends n.a<p, a> implements q {
        public a() {
            super(p.DEFAULT_INSTANCE);
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
        p pVar = new p();
        DEFAULT_INSTANCE = pVar;
        n.B(p.class, pVar);
    }

    public static void E(p pVar) {
        pVar.version_ = 0;
    }

    public static void F(p pVar, c.f fVar) {
        pVar.getClass();
        pVar.keyValue_ = fVar;
    }

    public static a I() {
        return (a) DEFAULT_INSTANCE.p();
    }

    public static p J(c cVar, i iVar) {
        return (p) n.z(DEFAULT_INSTANCE, cVar, iVar);
    }

    public final c G() {
        return this.keyValue_;
    }

    public final int H() {
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
                return new x(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\n", new Object[]{"version_", "keyValue_"});
            case 3:
                return new p();
            case 4:
                return new a();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                u<p> uVar = PARSER;
                if (uVar == null) {
                    synchronized (p.class) {
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
