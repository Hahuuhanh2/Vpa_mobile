package i9;

import com.google.crypto.tink.shaded.protobuf.i;
import com.google.crypto.tink.shaded.protobuf.n;
import j9.c;
import j9.q;
import j9.u;
import j9.x;

/* compiled from: AesCtrHmacAeadKey */
public final class d extends n<d, a> implements q {
    public static final int AES_CTR_KEY_FIELD_NUMBER = 2;
    /* access modifiers changed from: private */
    public static final d DEFAULT_INSTANCE;
    public static final int HMAC_KEY_FIELD_NUMBER = 3;
    private static volatile u<d> PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private f aesCtrKey_;
    private v hmacKey_;
    private int version_;

    /* compiled from: AesCtrHmacAeadKey */
    public static final class a extends n.a<d, a> implements q {
        public a() {
            super(d.DEFAULT_INSTANCE);
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
        d dVar = new d();
        DEFAULT_INSTANCE = dVar;
        n.B(d.class, dVar);
    }

    public static void E(d dVar) {
        dVar.version_ = 0;
    }

    public static void F(d dVar, f fVar) {
        dVar.getClass();
        fVar.getClass();
        dVar.aesCtrKey_ = fVar;
    }

    public static void G(d dVar, v vVar) {
        dVar.getClass();
        vVar.getClass();
        dVar.hmacKey_ = vVar;
    }

    public static a K() {
        return (a) DEFAULT_INSTANCE.p();
    }

    public static d L(c cVar, i iVar) {
        return (d) n.z(DEFAULT_INSTANCE, cVar, iVar);
    }

    public final f H() {
        f fVar = this.aesCtrKey_;
        if (fVar == null) {
            return f.H();
        }
        return fVar;
    }

    public final v I() {
        v vVar = this.hmacKey_;
        if (vVar == null) {
            return v.H();
        }
        return vVar;
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
                return new x(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\t", new Object[]{"version_", "aesCtrKey_", "hmacKey_"});
            case 3:
                return new d();
            case 4:
                return new a();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                u<d> uVar = PARSER;
                if (uVar == null) {
                    synchronized (d.class) {
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
