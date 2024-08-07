package tb;

import com.google.protobuf.i;
import tc.p;
import tc.t;
import tc.w;

/* compiled from: AndroidApplicationInfo */
public final class a extends i<a, C0197a> implements p {
    /* access modifiers changed from: private */
    public static final a DEFAULT_INSTANCE;
    public static final int PACKAGE_NAME_FIELD_NUMBER = 1;
    private static volatile t<a> PARSER = null;
    public static final int SDK_VERSION_FIELD_NUMBER = 2;
    public static final int VERSION_NAME_FIELD_NUMBER = 3;
    private int bitField0_;
    private String packageName_ = "";
    private String sdkVersion_ = "";
    private String versionName_ = "";

    /* renamed from: tb.a$a  reason: collision with other inner class name */
    /* compiled from: AndroidApplicationInfo */
    public static final class C0197a extends i.a<a, C0197a> implements p {
        public C0197a() {
            super(a.DEFAULT_INSTANCE);
        }
    }

    static {
        a aVar = new a();
        DEFAULT_INSTANCE = aVar;
        i.E(a.class, aVar);
    }

    public static void G(a aVar, String str) {
        aVar.getClass();
        str.getClass();
        aVar.bitField0_ |= 1;
        aVar.packageName_ = str;
    }

    public static void H(a aVar) {
        aVar.getClass();
        aVar.bitField0_ |= 2;
        aVar.sdkVersion_ = "20.4.1";
    }

    public static void I(a aVar, String str) {
        aVar.getClass();
        aVar.bitField0_ |= 4;
        aVar.versionName_ = str;
    }

    public static a J() {
        return DEFAULT_INSTANCE;
    }

    public static C0197a M() {
        return (C0197a) DEFAULT_INSTANCE.v();
    }

    public final boolean K() {
        if ((this.bitField0_ & 1) != 0) {
            return true;
        }
        return false;
    }

    public final boolean L() {
        if ((this.bitField0_ & 2) != 0) {
            return true;
        }
        return false;
    }

    public final Object w(i.e eVar) {
        switch (eVar.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new w(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002", new Object[]{"bitField0_", "packageName_", "sdkVersion_", "versionName_"});
            case 3:
                return new a();
            case 4:
                return new C0197a();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                t<a> tVar = PARSER;
                if (tVar == null) {
                    synchronized (a.class) {
                        try {
                            tVar = PARSER;
                            if (tVar == null) {
                                tVar = new i.b<>(DEFAULT_INSTANCE);
                                PARSER = tVar;
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                }
                return tVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
