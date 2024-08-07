package i9;

import com.google.crypto.tink.shaded.protobuf.n;
import j9.c;
import j9.q;
import j9.u;
import j9.x;

/* compiled from: EncryptedKeyset */
public final class t extends n<t, a> implements q {
    /* access modifiers changed from: private */
    public static final t DEFAULT_INSTANCE;
    public static final int ENCRYPTED_KEYSET_FIELD_NUMBER = 2;
    public static final int KEYSET_INFO_FIELD_NUMBER = 3;
    private static volatile u<t> PARSER;
    private c encryptedKeyset_ = c.f11735b;
    private d0 keysetInfo_;

    /* compiled from: EncryptedKeyset */
    public static final class a extends n.a<t, a> implements q {
        public a() {
            super(t.DEFAULT_INSTANCE);
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
        t tVar = new t();
        DEFAULT_INSTANCE = tVar;
        n.B(t.class, tVar);
    }

    public static void E(t tVar, c.f fVar) {
        tVar.getClass();
        tVar.encryptedKeyset_ = fVar;
    }

    public static void F(t tVar, d0 d0Var) {
        tVar.getClass();
        tVar.keysetInfo_ = d0Var;
    }

    public static a H() {
        return (a) DEFAULT_INSTANCE.p();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v0, resolved type: com.google.crypto.tink.shaded.protobuf.f$b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: com.google.crypto.tink.shaded.protobuf.f$a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: com.google.crypto.tink.shaded.protobuf.f$b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v4, resolved type: com.google.crypto.tink.shaded.protobuf.f$b} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static i9.t I(java.io.InputStream r4, com.google.crypto.tink.shaded.protobuf.i r5) {
        /*
            i9.t r0 = DEFAULT_INSTANCE
            if (r4 != 0) goto L_0x0018
            byte[] r4 = com.google.crypto.tink.shaded.protobuf.p.f7416b
            int r1 = r4.length
            com.google.crypto.tink.shaded.protobuf.f$a r2 = new com.google.crypto.tink.shaded.protobuf.f$a
            r3 = 0
            r2.<init>(r4, r3, r1, r3)
            r2.g(r1)     // Catch:{ InvalidProtocolBufferException -> 0x0011 }
            goto L_0x001d
        L_0x0011:
            r4 = move-exception
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            r5.<init>(r4)
            throw r5
        L_0x0018:
            com.google.crypto.tink.shaded.protobuf.f$b r2 = new com.google.crypto.tink.shaded.protobuf.f$b
            r2.<init>(r4)
        L_0x001d:
            com.google.crypto.tink.shaded.protobuf.n r4 = com.google.crypto.tink.shaded.protobuf.n.A(r0, r2, r5)
            com.google.crypto.tink.shaded.protobuf.n.m(r4)
            i9.t r4 = (i9.t) r4
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: i9.t.I(java.io.InputStream, com.google.crypto.tink.shaded.protobuf.i):i9.t");
    }

    public final c G() {
        return this.encryptedKeyset_;
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
                return new x(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0002\u0003\u0002\u0000\u0000\u0000\u0002\n\u0003\t", new Object[]{"encryptedKeyset_", "keysetInfo_"});
            case 3:
                return new t();
            case 4:
                return new a();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                u<t> uVar = PARSER;
                if (uVar == null) {
                    synchronized (t.class) {
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
