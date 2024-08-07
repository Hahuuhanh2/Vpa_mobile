package i9;

import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import com.google.crypto.tink.shaded.protobuf.UninitializedMessageException;
import com.google.crypto.tink.shaded.protobuf.b0;
import com.google.crypto.tink.shaded.protobuf.d;
import com.google.crypto.tink.shaded.protobuf.i;
import com.google.crypto.tink.shaded.protobuf.n;
import com.google.crypto.tink.shaded.protobuf.p;
import j9.q;
import j9.u;
import j9.w;
import j9.x;
import java.io.IOException;
import java.util.List;

/* compiled from: Keyset */
public final class c0 extends n<c0, a> implements q {
    /* access modifiers changed from: private */
    public static final c0 DEFAULT_INSTANCE;
    public static final int KEY_FIELD_NUMBER = 2;
    private static volatile u<c0> PARSER = null;
    public static final int PRIMARY_KEY_ID_FIELD_NUMBER = 1;
    private p.c<b> key_ = b0.f7330d;
    private int primaryKeyId_;

    /* compiled from: Keyset */
    public static final class a extends n.a<c0, a> implements q {
        public a() {
            super(c0.DEFAULT_INSTANCE);
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

    /* compiled from: Keyset */
    public static final class b extends n<b, a> implements q {
        /* access modifiers changed from: private */
        public static final b DEFAULT_INSTANCE;
        public static final int KEY_DATA_FIELD_NUMBER = 1;
        public static final int KEY_ID_FIELD_NUMBER = 3;
        public static final int OUTPUT_PREFIX_TYPE_FIELD_NUMBER = 4;
        private static volatile u<b> PARSER = null;
        public static final int STATUS_FIELD_NUMBER = 2;
        private y keyData_;
        private int keyId_;
        private int outputPrefixType_;
        private int status_;

        /* compiled from: Keyset */
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

        public static void E(b bVar, y yVar) {
            bVar.getClass();
            bVar.keyData_ = yVar;
        }

        public static void F(b bVar, i0 i0Var) {
            bVar.getClass();
            bVar.outputPrefixType_ = i0Var.a();
        }

        public static void G(b bVar) {
            z zVar = z.ENABLED;
            bVar.getClass();
            bVar.status_ = zVar.a();
        }

        public static void H(b bVar, int i10) {
            bVar.keyId_ = i10;
        }

        public static a N() {
            return (a) DEFAULT_INSTANCE.p();
        }

        public final y I() {
            y yVar = this.keyData_;
            if (yVar == null) {
                return y.H();
            }
            return yVar;
        }

        public final int J() {
            return this.keyId_;
        }

        public final i0 K() {
            i0 b10 = i0.b(this.outputPrefixType_);
            if (b10 == null) {
                return i0.UNRECOGNIZED;
            }
            return b10;
        }

        public final z L() {
            z zVar;
            int i10 = this.status_;
            if (i10 == 0) {
                zVar = z.UNKNOWN_STATUS;
            } else if (i10 == 1) {
                zVar = z.ENABLED;
            } else if (i10 == 2) {
                zVar = z.DISABLED;
            } else if (i10 != 3) {
                zVar = null;
            } else {
                zVar = z.DESTROYED;
            }
            if (zVar == null) {
                return z.UNRECOGNIZED;
            }
            return zVar;
        }

        public final boolean M() {
            if (this.keyData_ != null) {
                return true;
            }
            return false;
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
                    return new x(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\t\u0002\f\u0003\u000b\u0004\f", new Object[]{"keyData_", "status_", "keyId_", "outputPrefixType_"});
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
        c0 c0Var = new c0();
        DEFAULT_INSTANCE = c0Var;
        n.B(c0.class, c0Var);
    }

    public static void E(c0 c0Var, int i10) {
        c0Var.primaryKeyId_ = i10;
    }

    public static void F(c0 c0Var, b bVar) {
        int i10;
        c0Var.getClass();
        p.c<b> cVar = c0Var.key_;
        if (!cVar.f()) {
            int size = cVar.size();
            if (size == 0) {
                i10 = 10;
            } else {
                i10 = size * 2;
            }
            c0Var.key_ = cVar.b(i10);
        }
        c0Var.key_.add(bVar);
    }

    public static a K() {
        return (a) DEFAULT_INSTANCE.p();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v0, resolved type: com.google.crypto.tink.shaded.protobuf.f$b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: com.google.crypto.tink.shaded.protobuf.f$a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: com.google.crypto.tink.shaded.protobuf.f$b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v4, resolved type: com.google.crypto.tink.shaded.protobuf.f$b} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static i9.c0 L(java.io.InputStream r4, com.google.crypto.tink.shaded.protobuf.i r5) {
        /*
            i9.c0 r0 = DEFAULT_INSTANCE
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
            i9.c0 r4 = (i9.c0) r4
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: i9.c0.L(java.io.InputStream, com.google.crypto.tink.shaded.protobuf.i):i9.c0");
    }

    public static c0 M(byte[] bArr, i iVar) {
        c0 c0Var = DEFAULT_INSTANCE;
        int length = bArr.length;
        n nVar = (n) c0Var.r();
        try {
            w wVar = w.f11791c;
            wVar.getClass();
            com.google.crypto.tink.shaded.protobuf.c0<?> a10 = wVar.a(nVar.getClass());
            a10.j(nVar, bArr, 0, length + 0, new d.a(iVar));
            a10.c(nVar);
            n.m(nVar);
            return (c0) nVar;
        } catch (InvalidProtocolBufferException e10) {
            e = e10;
            if (e.f7325a) {
                e = new InvalidProtocolBufferException((IOException) e);
            }
            throw e;
        } catch (UninitializedMessageException e11) {
            throw new InvalidProtocolBufferException(e11.getMessage());
        } catch (IOException e12) {
            if (e12.getCause() instanceof InvalidProtocolBufferException) {
                throw ((InvalidProtocolBufferException) e12.getCause());
            }
            throw new InvalidProtocolBufferException(e12);
        } catch (IndexOutOfBoundsException unused) {
            throw InvalidProtocolBufferException.g();
        }
    }

    public final b G(int i10) {
        return this.key_.get(i10);
    }

    public final int H() {
        return this.key_.size();
    }

    public final List<b> I() {
        return this.key_;
    }

    public final int J() {
        return this.primaryKeyId_;
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
                return new x(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new Object[]{"primaryKeyId_", "key_", b.class});
            case 3:
                return new c0();
            case 4:
                return new a();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                u<c0> uVar = PARSER;
                if (uVar == null) {
                    synchronized (c0.class) {
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
