package tb;

import com.google.protobuf.i;
import tc.p;
import tc.t;
import tc.w;

/* compiled from: GaugeMetadata */
public final class f extends i<f, a> implements p {
    public static final int CPU_CLOCK_RATE_KHZ_FIELD_NUMBER = 2;
    public static final int CPU_PROCESSOR_COUNT_FIELD_NUMBER = 6;
    /* access modifiers changed from: private */
    public static final f DEFAULT_INSTANCE;
    public static final int DEVICE_RAM_SIZE_KB_FIELD_NUMBER = 3;
    public static final int MAX_APP_JAVA_HEAP_MEMORY_KB_FIELD_NUMBER = 4;
    public static final int MAX_ENCOURAGED_APP_JAVA_HEAP_MEMORY_KB_FIELD_NUMBER = 5;
    private static volatile t<f> PARSER = null;
    public static final int PROCESS_NAME_FIELD_NUMBER = 1;
    private int bitField0_;
    private int cpuClockRateKhz_;
    private int cpuProcessorCount_;
    private int deviceRamSizeKb_;
    private int maxAppJavaHeapMemoryKb_;
    private int maxEncouragedAppJavaHeapMemoryKb_;
    private String processName_ = "";

    /* compiled from: GaugeMetadata */
    public static final class a extends i.a<f, a> implements p {
        public a() {
            super(f.DEFAULT_INSTANCE);
        }
    }

    static {
        f fVar = new f();
        DEFAULT_INSTANCE = fVar;
        i.E(f.class, fVar);
    }

    public static void G(f fVar, int i10) {
        fVar.bitField0_ |= 16;
        fVar.maxAppJavaHeapMemoryKb_ = i10;
    }

    public static void H(f fVar, int i10) {
        fVar.bitField0_ |= 32;
        fVar.maxEncouragedAppJavaHeapMemoryKb_ = i10;
    }

    public static void I(f fVar, int i10) {
        fVar.bitField0_ |= 8;
        fVar.deviceRamSizeKb_ = i10;
    }

    public static f J() {
        return DEFAULT_INSTANCE;
    }

    public static a L() {
        return (a) DEFAULT_INSTANCE.v();
    }

    public final boolean K() {
        if ((this.bitField0_ & 16) != 0) {
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
                return new w(DEFAULT_INSTANCE, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဈ\u0000\u0002င\u0001\u0003င\u0003\u0004င\u0004\u0005င\u0005\u0006င\u0002", new Object[]{"bitField0_", "processName_", "cpuClockRateKhz_", "deviceRamSizeKb_", "maxAppJavaHeapMemoryKb_", "maxEncouragedAppJavaHeapMemoryKb_", "cpuProcessorCount_"});
            case 3:
                return new f();
            case 4:
                return new a();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                t<f> tVar = PARSER;
                if (tVar == null) {
                    synchronized (f.class) {
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
