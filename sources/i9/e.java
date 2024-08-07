package i9;

import com.google.crypto.tink.shaded.protobuf.i;
import com.google.crypto.tink.shaded.protobuf.n;
import j9.c;
import j9.q;
import j9.u;
import j9.x;

/* compiled from: AesCtrHmacAeadKeyFormat */
public final class e extends n<e, a> implements q {
    public static final int AES_CTR_KEY_FORMAT_FIELD_NUMBER = 1;
    /* access modifiers changed from: private */
    public static final e DEFAULT_INSTANCE;
    public static final int HMAC_KEY_FORMAT_FIELD_NUMBER = 2;
    private static volatile u<e> PARSER;
    private g aesCtrKeyFormat_;
    private w hmacKeyFormat_;

    /* compiled from: AesCtrHmacAeadKeyFormat */
    public static final class a extends n.a<e, a> implements q {
        public a() {
            super(e.DEFAULT_INSTANCE);
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
        e eVar = new e();
        DEFAULT_INSTANCE = eVar;
        n.B(e.class, eVar);
    }

    public static void E(e eVar, g gVar) {
        eVar.getClass();
        eVar.aesCtrKeyFormat_ = gVar;
    }

    public static void F(e eVar, w wVar) {
        eVar.getClass();
        eVar.hmacKeyFormat_ = wVar;
    }

    public static a I() {
        return (a) DEFAULT_INSTANCE.p();
    }

    public static e J(c cVar, i iVar) {
        return (e) n.z(DEFAULT_INSTANCE, cVar, iVar);
    }

    public final g G() {
        g gVar = this.aesCtrKeyFormat_;
        if (gVar == null) {
            return g.G();
        }
        return gVar;
    }

    public final w H() {
        w wVar = this.hmacKeyFormat_;
        if (wVar == null) {
            return w.G();
        }
        return wVar;
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
                return new x(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\t", new Object[]{"aesCtrKeyFormat_", "hmacKeyFormat_"});
            case 3:
                return new e();
            case 4:
                return new a();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                u<e> uVar = PARSER;
                if (uVar == null) {
                    synchronized (e.class) {
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
