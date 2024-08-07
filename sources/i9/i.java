package i9;

import com.google.crypto.tink.shaded.protobuf.n;
import j9.c;
import j9.q;
import j9.u;
import j9.x;

/* compiled from: AesEaxKey */
public final class i extends n<i, a> implements q {
    /* access modifiers changed from: private */
    public static final i DEFAULT_INSTANCE;
    public static final int KEY_VALUE_FIELD_NUMBER = 3;
    public static final int PARAMS_FIELD_NUMBER = 2;
    private static volatile u<i> PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private c keyValue_ = c.f11735b;
    private k params_;
    private int version_;

    /* compiled from: AesEaxKey */
    public static final class a extends n.a<i, a> implements q {
        public a() {
            super(i.DEFAULT_INSTANCE);
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
        i iVar = new i();
        DEFAULT_INSTANCE = iVar;
        n.B(i.class, iVar);
    }

    public static void E(i iVar) {
        iVar.version_ = 0;
    }

    public static void F(i iVar, k kVar) {
        iVar.getClass();
        kVar.getClass();
        iVar.params_ = kVar;
    }

    public static void G(i iVar, c.f fVar) {
        iVar.getClass();
        iVar.keyValue_ = fVar;
    }

    public static a K() {
        return (a) DEFAULT_INSTANCE.p();
    }

    public static i L(c cVar, com.google.crypto.tink.shaded.protobuf.i iVar) {
        return (i) n.z(DEFAULT_INSTANCE, cVar, iVar);
    }

    public final c H() {
        return this.keyValue_;
    }

    public final k I() {
        k kVar = this.params_;
        if (kVar == null) {
            return k.F();
        }
        return kVar;
    }

    public final int J() {
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
                return new i();
            case 4:
                return new a();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                u<i> uVar = PARSER;
                if (uVar == null) {
                    synchronized (i.class) {
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
