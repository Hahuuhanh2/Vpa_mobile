package i9;

import com.google.crypto.tink.shaded.protobuf.b0;
import com.google.crypto.tink.shaded.protobuf.n;
import com.google.crypto.tink.shaded.protobuf.p;
import j9.q;
import j9.u;
import j9.x;

/* compiled from: KeysetInfo */
public final class d0 extends n<d0, a> implements q {
    /* access modifiers changed from: private */
    public static final d0 DEFAULT_INSTANCE;
    public static final int KEY_INFO_FIELD_NUMBER = 2;
    private static volatile u<d0> PARSER = null;
    public static final int PRIMARY_KEY_ID_FIELD_NUMBER = 1;
    private p.c<b> keyInfo_ = b0.f7330d;
    private int primaryKeyId_;

    /* compiled from: KeysetInfo */
    public static final class a extends n.a<d0, a> implements q {
        public a() {
            super(d0.DEFAULT_INSTANCE);
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

    /* compiled from: KeysetInfo */
    public static final class b extends n<b, a> implements q {
        /* access modifiers changed from: private */
        public static final b DEFAULT_INSTANCE;
        public static final int KEY_ID_FIELD_NUMBER = 3;
        public static final int OUTPUT_PREFIX_TYPE_FIELD_NUMBER = 4;
        private static volatile u<b> PARSER = null;
        public static final int STATUS_FIELD_NUMBER = 2;
        public static final int TYPE_URL_FIELD_NUMBER = 1;
        private int keyId_;
        private int outputPrefixType_;
        private int status_;
        private String typeUrl_ = "";

        /* compiled from: KeysetInfo */
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

        public static void E(b bVar, String str) {
            bVar.getClass();
            str.getClass();
            bVar.typeUrl_ = str;
        }

        public static void F(b bVar, i0 i0Var) {
            bVar.getClass();
            bVar.outputPrefixType_ = i0Var.a();
        }

        public static void G(b bVar, z zVar) {
            bVar.getClass();
            bVar.status_ = zVar.a();
        }

        public static void H(b bVar, int i10) {
            bVar.keyId_ = i10;
        }

        public static a J() {
            return (a) DEFAULT_INSTANCE.p();
        }

        public final int I() {
            return this.keyId_;
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
                    return new x(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002\f\u0003\u000b\u0004\f", new Object[]{"typeUrl_", "status_", "keyId_", "outputPrefixType_"});
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

    static {
        d0 d0Var = new d0();
        DEFAULT_INSTANCE = d0Var;
        n.B(d0.class, d0Var);
    }

    public static void E(d0 d0Var, int i10) {
        d0Var.primaryKeyId_ = i10;
    }

    public static void F(d0 d0Var, b bVar) {
        int i10;
        d0Var.getClass();
        p.c<b> cVar = d0Var.keyInfo_;
        if (!cVar.f()) {
            int size = cVar.size();
            if (size == 0) {
                i10 = 10;
            } else {
                i10 = size * 2;
            }
            d0Var.keyInfo_ = cVar.b(i10);
        }
        d0Var.keyInfo_.add(bVar);
    }

    public static a H() {
        return (a) DEFAULT_INSTANCE.p();
    }

    public final b G() {
        return this.keyInfo_.get(0);
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
                return new x(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new Object[]{"primaryKeyId_", "keyInfo_", b.class});
            case 3:
                return new d0();
            case 4:
                return new a();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                u<d0> uVar = PARSER;
                if (uVar == null) {
                    synchronized (d0.class) {
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
