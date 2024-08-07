package i9;

import com.google.crypto.tink.shaded.protobuf.i;
import com.google.crypto.tink.shaded.protobuf.n;
import j9.c;
import j9.q;
import j9.u;
import j9.x;

/* compiled from: AesEaxKeyFormat */
public final class j extends n<j, a> implements q {
    /* access modifiers changed from: private */
    public static final j DEFAULT_INSTANCE;
    public static final int KEY_SIZE_FIELD_NUMBER = 2;
    public static final int PARAMS_FIELD_NUMBER = 1;
    private static volatile u<j> PARSER;
    private int keySize_;
    private k params_;

    /* compiled from: AesEaxKeyFormat */
    public static final class a extends n.a<j, a> implements q {
        public a() {
            super(j.DEFAULT_INSTANCE);
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
        j jVar = new j();
        DEFAULT_INSTANCE = jVar;
        n.B(j.class, jVar);
    }

    public static void E(j jVar, k kVar) {
        jVar.getClass();
        jVar.params_ = kVar;
    }

    public static void F(j jVar, int i10) {
        jVar.keySize_ = i10;
    }

    public static a I() {
        return (a) DEFAULT_INSTANCE.p();
    }

    public static j J(c cVar, i iVar) {
        return (j) n.z(DEFAULT_INSTANCE, cVar, iVar);
    }

    public final int G() {
        return this.keySize_;
    }

    public final k H() {
        k kVar = this.params_;
        if (kVar == null) {
            return k.F();
        }
        return kVar;
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
                return new j();
            case 4:
                return new a();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                u<j> uVar = PARSER;
                if (uVar == null) {
                    synchronized (j.class) {
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
