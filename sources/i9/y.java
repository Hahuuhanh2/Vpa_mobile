package i9;

import com.google.crypto.tink.shaded.protobuf.n;
import com.google.crypto.tink.shaded.protobuf.p;
import j9.c;
import j9.q;
import j9.u;
import j9.x;

/* compiled from: KeyData */
public final class y extends n<y, a> implements q {
    /* access modifiers changed from: private */
    public static final y DEFAULT_INSTANCE;
    public static final int KEY_MATERIAL_TYPE_FIELD_NUMBER = 3;
    private static volatile u<y> PARSER = null;
    public static final int TYPE_URL_FIELD_NUMBER = 1;
    public static final int VALUE_FIELD_NUMBER = 2;
    private int keyMaterialType_;
    private String typeUrl_ = "";
    private c value_ = c.f11735b;

    /* compiled from: KeyData */
    public static final class a extends n.a<y, a> implements q {
        public a() {
            super(y.DEFAULT_INSTANCE);
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

    /* compiled from: KeyData */
    public enum b implements p.a {
        UNKNOWN_KEYMATERIAL(0),
        SYMMETRIC(1),
        ASYMMETRIC_PRIVATE(2),
        ASYMMETRIC_PUBLIC(3),
        REMOTE(4),
        UNRECOGNIZED(-1);
        

        /* renamed from: a  reason: collision with root package name */
        public final int f11240a;

        /* access modifiers changed from: public */
        b(int i10) {
            this.f11240a = i10;
        }

        public static b b(int i10) {
            if (i10 == 0) {
                return UNKNOWN_KEYMATERIAL;
            }
            if (i10 == 1) {
                return SYMMETRIC;
            }
            if (i10 == 2) {
                return ASYMMETRIC_PRIVATE;
            }
            if (i10 == 3) {
                return ASYMMETRIC_PUBLIC;
            }
            if (i10 != 4) {
                return null;
            }
            return REMOTE;
        }

        public final int a() {
            if (this != UNRECOGNIZED) {
                return this.f11240a;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }
    }

    static {
        y yVar = new y();
        DEFAULT_INSTANCE = yVar;
        n.B(y.class, yVar);
    }

    public static void E(y yVar, String str) {
        yVar.getClass();
        str.getClass();
        yVar.typeUrl_ = str;
    }

    public static void F(y yVar, c cVar) {
        yVar.getClass();
        cVar.getClass();
        yVar.value_ = cVar;
    }

    public static void G(y yVar, b bVar) {
        yVar.getClass();
        yVar.keyMaterialType_ = bVar.a();
    }

    public static y H() {
        return DEFAULT_INSTANCE;
    }

    public static a L() {
        return (a) DEFAULT_INSTANCE.p();
    }

    public final b I() {
        b b10 = b.b(this.keyMaterialType_);
        if (b10 == null) {
            return b.UNRECOGNIZED;
        }
        return b10;
    }

    public final String J() {
        return this.typeUrl_;
    }

    public final c K() {
        return this.value_;
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
                return new x(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\n\u0003\f", new Object[]{"typeUrl_", "value_", "keyMaterialType_"});
            case 3:
                return new y();
            case 4:
                return new a();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                u<y> uVar = PARSER;
                if (uVar == null) {
                    synchronized (y.class) {
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
