package tb;

import com.google.protobuf.i;
import com.google.protobuf.q;
import com.google.protobuf.r;
import tb.d;
import tc.c0;
import tc.p;
import tc.t;
import tc.w;

/* compiled from: ApplicationInfo */
public final class c extends i<c, a> implements p {
    public static final int ANDROID_APP_INFO_FIELD_NUMBER = 3;
    public static final int APPLICATION_PROCESS_STATE_FIELD_NUMBER = 5;
    public static final int APP_INSTANCE_ID_FIELD_NUMBER = 2;
    public static final int CUSTOM_ATTRIBUTES_FIELD_NUMBER = 6;
    /* access modifiers changed from: private */
    public static final c DEFAULT_INSTANCE;
    public static final int GOOGLE_APP_ID_FIELD_NUMBER = 1;
    private static volatile t<c> PARSER;
    private a androidAppInfo_;
    private String appInstanceId_ = "";
    private int applicationProcessState_;
    private int bitField0_;
    private r<String, String> customAttributes_ = r.f7936b;
    private String googleAppId_ = "";

    /* compiled from: ApplicationInfo */
    public static final class a extends i.a<c, a> implements p {
        public a() {
            super(c.DEFAULT_INSTANCE);
        }
    }

    /* compiled from: ApplicationInfo */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public static final q<String, String> f14915a;

        static {
            c0.a aVar = c0.f14966d;
            f14915a = new q<>(aVar, aVar, "");
        }
    }

    static {
        c cVar = new c();
        DEFAULT_INSTANCE = cVar;
        i.E(c.class, cVar);
    }

    public static void G(c cVar, String str) {
        cVar.getClass();
        str.getClass();
        cVar.bitField0_ |= 1;
        cVar.googleAppId_ = str;
    }

    public static void H(c cVar, d dVar) {
        cVar.getClass();
        cVar.applicationProcessState_ = dVar.f14921a;
        cVar.bitField0_ |= 8;
    }

    public static r I(c cVar) {
        r<String, String> rVar = cVar.customAttributes_;
        if (!rVar.f7937a) {
            cVar.customAttributes_ = rVar.e();
        }
        return cVar.customAttributes_;
    }

    public static void J(c cVar, String str) {
        cVar.getClass();
        str.getClass();
        cVar.bitField0_ |= 2;
        cVar.appInstanceId_ = str;
    }

    public static void K(c cVar, a aVar) {
        cVar.getClass();
        cVar.androidAppInfo_ = aVar;
        cVar.bitField0_ |= 4;
    }

    public static c M() {
        return DEFAULT_INSTANCE;
    }

    public static a R() {
        return (a) DEFAULT_INSTANCE.v();
    }

    public final a L() {
        a aVar = this.androidAppInfo_;
        if (aVar == null) {
            return a.J();
        }
        return aVar;
    }

    public final boolean N() {
        if ((this.bitField0_ & 4) != 0) {
            return true;
        }
        return false;
    }

    public final boolean O() {
        if ((this.bitField0_ & 2) != 0) {
            return true;
        }
        return false;
    }

    public final boolean P() {
        if ((this.bitField0_ & 8) != 0) {
            return true;
        }
        return false;
    }

    public final boolean Q() {
        if ((this.bitField0_ & 1) != 0) {
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
                return new w(DEFAULT_INSTANCE, "\u0001\u0005\u0000\u0001\u0001\u0006\u0005\u0001\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဉ\u0002\u0005ဌ\u0003\u00062", new Object[]{"bitField0_", "googleAppId_", "appInstanceId_", "androidAppInfo_", "applicationProcessState_", d.a.f14922a, "customAttributes_", b.f14915a});
            case 3:
                return new c();
            case 4:
                return new a();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                t<c> tVar = PARSER;
                if (tVar == null) {
                    synchronized (c.class) {
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
