package tb;

import com.google.protobuf.i;
import tc.p;
import tc.t;
import tc.w;

/* compiled from: CpuMetricReading */
public final class e extends i<e, a> implements p {
    public static final int CLIENT_TIME_US_FIELD_NUMBER = 1;
    /* access modifiers changed from: private */
    public static final e DEFAULT_INSTANCE;
    private static volatile t<e> PARSER = null;
    public static final int SYSTEM_TIME_US_FIELD_NUMBER = 3;
    public static final int USER_TIME_US_FIELD_NUMBER = 2;
    private int bitField0_;
    private long clientTimeUs_;
    private long systemTimeUs_;
    private long userTimeUs_;

    /* compiled from: CpuMetricReading */
    public static final class a extends i.a<e, a> implements p {
        public a() {
            super(e.DEFAULT_INSTANCE);
        }
    }

    static {
        e eVar = new e();
        DEFAULT_INSTANCE = eVar;
        i.E(e.class, eVar);
    }

    public static void G(e eVar, long j10) {
        eVar.bitField0_ |= 1;
        eVar.clientTimeUs_ = j10;
    }

    public static void H(e eVar, long j10) {
        eVar.bitField0_ |= 2;
        eVar.userTimeUs_ = j10;
    }

    public static void I(e eVar, long j10) {
        eVar.bitField0_ |= 4;
        eVar.systemTimeUs_ = j10;
    }

    public static a J() {
        return (a) DEFAULT_INSTANCE.v();
    }

    public final Object w(i.e eVar) {
        switch (eVar.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new w(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003ဂ\u0002", new Object[]{"bitField0_", "clientTimeUs_", "userTimeUs_", "systemTimeUs_"});
            case 3:
                return new e();
            case 4:
                return new a();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                t<e> tVar = PARSER;
                if (tVar == null) {
                    synchronized (e.class) {
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
