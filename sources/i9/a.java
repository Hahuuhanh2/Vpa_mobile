package i9;

import com.google.crypto.tink.shaded.protobuf.i;
import com.google.crypto.tink.shaded.protobuf.n;
import j9.c;
import j9.q;
import j9.u;
import j9.x;

/* compiled from: AesCmacKey */
public final class a extends n<a, C0125a> implements q {
    /* access modifiers changed from: private */
    public static final a DEFAULT_INSTANCE;
    public static final int KEY_VALUE_FIELD_NUMBER = 2;
    public static final int PARAMS_FIELD_NUMBER = 3;
    private static volatile u<a> PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private c keyValue_ = c.f11735b;
    private c params_;
    private int version_;

    /* renamed from: i9.a$a  reason: collision with other inner class name */
    /* compiled from: AesCmacKey */
    public static final class C0125a extends n.a<a, C0125a> implements q {
        public C0125a() {
            super(a.DEFAULT_INSTANCE);
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
        a aVar = new a();
        DEFAULT_INSTANCE = aVar;
        n.B(a.class, aVar);
    }

    public static void E(a aVar) {
        aVar.version_ = 0;
    }

    public static void F(a aVar, c.f fVar) {
        aVar.getClass();
        aVar.keyValue_ = fVar;
    }

    public static void G(a aVar, c cVar) {
        aVar.getClass();
        cVar.getClass();
        aVar.params_ = cVar;
    }

    public static C0125a K() {
        return (C0125a) DEFAULT_INSTANCE.p();
    }

    public static a L(c cVar, i iVar) {
        return (a) n.z(DEFAULT_INSTANCE, cVar, iVar);
    }

    public final c H() {
        return this.keyValue_;
    }

    public final c I() {
        c cVar = this.params_;
        if (cVar == null) {
            return c.F();
        }
        return cVar;
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
                return new x(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\n\u0003\t", new Object[]{"version_", "keyValue_", "params_"});
            case 3:
                return new a();
            case 4:
                return new C0125a();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                u<a> uVar = PARSER;
                if (uVar == null) {
                    synchronized (a.class) {
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
