package tb;

import com.google.protobuf.i;
import com.google.protobuf.k;
import com.google.protobuf.y;
import tc.p;
import tc.t;
import tc.w;

/* compiled from: GaugeMetric */
public final class g extends i<g, a> implements p {
    public static final int ANDROID_MEMORY_READINGS_FIELD_NUMBER = 4;
    public static final int CPU_METRIC_READINGS_FIELD_NUMBER = 2;
    /* access modifiers changed from: private */
    public static final g DEFAULT_INSTANCE;
    public static final int GAUGE_METADATA_FIELD_NUMBER = 3;
    private static volatile t<g> PARSER = null;
    public static final int SESSION_ID_FIELD_NUMBER = 1;
    private k.c<b> androidMemoryReadings_;
    private int bitField0_;
    private k.c<e> cpuMetricReadings_;
    private f gaugeMetadata_;
    private String sessionId_ = "";

    /* compiled from: GaugeMetric */
    public static final class a extends i.a<g, a> implements p {
        public a() {
            super(g.DEFAULT_INSTANCE);
        }
    }

    static {
        g gVar = new g();
        DEFAULT_INSTANCE = gVar;
        i.E(g.class, gVar);
    }

    public g() {
        y<Object> yVar = y.f7958d;
        this.cpuMetricReadings_ = yVar;
        this.androidMemoryReadings_ = yVar;
    }

    public static void G(g gVar, String str) {
        gVar.getClass();
        str.getClass();
        gVar.bitField0_ |= 1;
        gVar.sessionId_ = str;
    }

    public static void H(g gVar, b bVar) {
        gVar.getClass();
        bVar.getClass();
        k.c<b> cVar = gVar.androidMemoryReadings_;
        if (!cVar.f()) {
            gVar.androidMemoryReadings_ = i.D(cVar);
        }
        gVar.androidMemoryReadings_.add(bVar);
    }

    public static void I(g gVar, f fVar) {
        gVar.getClass();
        fVar.getClass();
        gVar.gaugeMetadata_ = fVar;
        gVar.bitField0_ |= 2;
    }

    public static void J(g gVar, e eVar) {
        gVar.getClass();
        eVar.getClass();
        k.c<e> cVar = gVar.cpuMetricReadings_;
        if (!cVar.f()) {
            gVar.cpuMetricReadings_ = i.D(cVar);
        }
        gVar.cpuMetricReadings_.add(eVar);
    }

    public static g M() {
        return DEFAULT_INSTANCE;
    }

    public static a Q() {
        return (a) DEFAULT_INSTANCE.v();
    }

    public final int K() {
        return this.androidMemoryReadings_.size();
    }

    public final int L() {
        return this.cpuMetricReadings_.size();
    }

    public final f N() {
        f fVar = this.gaugeMetadata_;
        if (fVar == null) {
            return f.J();
        }
        return fVar;
    }

    public final boolean O() {
        if ((this.bitField0_ & 2) != 0) {
            return true;
        }
        return false;
    }

    public final boolean P() {
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
                return new w(DEFAULT_INSTANCE, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0002\u0000\u0001ဈ\u0000\u0002\u001b\u0003ဉ\u0001\u0004\u001b", new Object[]{"bitField0_", "sessionId_", "cpuMetricReadings_", e.class, "gaugeMetadata_", "androidMemoryReadings_", b.class});
            case 3:
                return new g();
            case 4:
                return new a();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                t<g> tVar = PARSER;
                if (tVar == null) {
                    synchronized (g.class) {
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
