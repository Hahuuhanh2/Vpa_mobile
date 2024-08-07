package i9;

import com.google.crypto.tink.shaded.protobuf.i;
import com.google.crypto.tink.shaded.protobuf.n;
import j9.c;
import j9.q;
import j9.u;
import j9.x;

/* compiled from: AesCmacKeyFormat */
public final class b extends n<b, a> implements q {
    /* access modifiers changed from: private */
    public static final b DEFAULT_INSTANCE;
    public static final int KEY_SIZE_FIELD_NUMBER = 1;
    public static final int PARAMS_FIELD_NUMBER = 2;
    private static volatile u<b> PARSER;
    private int keySize_;
    private c params_;

    /* compiled from: AesCmacKeyFormat */
    public static final class a extends n.a<b, a> implements q {
        public a() {
            super(b.DEFAULT_INSTANCE);
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
        b bVar = new b();
        DEFAULT_INSTANCE = bVar;
        n.B(b.class, bVar);
    }

    public static void E(b bVar) {
        bVar.keySize_ = 32;
    }

    public static void F(b bVar, c cVar) {
        bVar.getClass();
        bVar.params_ = cVar;
    }

    public static a I() {
        return (a) DEFAULT_INSTANCE.p();
    }

    public static b J(c cVar, i iVar) {
        return (b) n.z(DEFAULT_INSTANCE, cVar, iVar);
    }

    public final int G() {
        return this.keySize_;
    }

    public final c H() {
        c cVar = this.params_;
        if (cVar == null) {
            return c.F();
        }
        return cVar;
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
                return new x(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\t", new Object[]{"keySize_", "params_"});
            case 3:
                return new b();
            case 4:
                return new a();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                u<b> uVar = PARSER;
                if (uVar == null) {
                    synchronized (b.class) {
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
