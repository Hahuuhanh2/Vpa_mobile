package i9;

import com.google.crypto.tink.shaded.protobuf.i;
import com.google.crypto.tink.shaded.protobuf.n;
import j9.c;
import j9.q;
import j9.u;
import j9.x;

/* compiled from: ChaCha20Poly1305KeyFormat */
public final class s extends n<s, a> implements q {
    /* access modifiers changed from: private */
    public static final s DEFAULT_INSTANCE;
    private static volatile u<s> PARSER;

    /* compiled from: ChaCha20Poly1305KeyFormat */
    public static final class a extends n.a<s, a> implements q {
        public a() {
            super(s.DEFAULT_INSTANCE);
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
        s sVar = new s();
        DEFAULT_INSTANCE = sVar;
        n.B(s.class, sVar);
    }

    public static s E() {
        return DEFAULT_INSTANCE;
    }

    public static s F(c cVar, i iVar) {
        return (s) n.z(DEFAULT_INSTANCE, cVar, iVar);
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
                return new x(DEFAULT_INSTANCE, "\u0000\u0000", (Object[]) null);
            case 3:
                return new s();
            case 4:
                return new a();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                u<s> uVar = PARSER;
                if (uVar == null) {
                    synchronized (s.class) {
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
