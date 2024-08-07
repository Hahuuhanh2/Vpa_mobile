package tb;

import com.google.protobuf.i;
import tc.t;
import tc.w;

/* compiled from: PerfMetric */
public final class i extends com.google.protobuf.i<i, a> implements j {
    public static final int APPLICATION_INFO_FIELD_NUMBER = 1;
    /* access modifiers changed from: private */
    public static final i DEFAULT_INSTANCE;
    public static final int GAUGE_METRIC_FIELD_NUMBER = 4;
    public static final int NETWORK_REQUEST_METRIC_FIELD_NUMBER = 3;
    private static volatile t<i> PARSER = null;
    public static final int TRACE_METRIC_FIELD_NUMBER = 2;
    public static final int TRANSPORT_INFO_FIELD_NUMBER = 5;
    private c applicationInfo_;
    private int bitField0_;
    private g gaugeMetric_;
    private h networkRequestMetric_;
    private m traceMetric_;
    private n transportInfo_;

    /* compiled from: PerfMetric */
    public static final class a extends i.a<i, a> implements j {
        public a() {
            super(i.DEFAULT_INSTANCE);
        }

        public final boolean j() {
            return ((i) this.f7906b).j();
        }

        public final boolean l() {
            return ((i) this.f7906b).l();
        }

        public final m m() {
            return ((i) this.f7906b).m();
        }

        public final boolean n() {
            return ((i) this.f7906b).n();
        }

        public final h o() {
            return ((i) this.f7906b).o();
        }

        public final g p() {
            return ((i) this.f7906b).p();
        }
    }

    static {
        i iVar = new i();
        DEFAULT_INSTANCE = iVar;
        com.google.protobuf.i.E(i.class, iVar);
    }

    public static void G(i iVar, c cVar) {
        iVar.getClass();
        iVar.applicationInfo_ = cVar;
        iVar.bitField0_ |= 1;
    }

    public static void H(i iVar, g gVar) {
        iVar.getClass();
        gVar.getClass();
        iVar.gaugeMetric_ = gVar;
        iVar.bitField0_ |= 8;
    }

    public static void I(i iVar, m mVar) {
        iVar.getClass();
        mVar.getClass();
        iVar.traceMetric_ = mVar;
        iVar.bitField0_ |= 2;
    }

    public static void J(i iVar, h hVar) {
        iVar.getClass();
        hVar.getClass();
        iVar.networkRequestMetric_ = hVar;
        iVar.bitField0_ |= 4;
    }

    public static a M() {
        return (a) DEFAULT_INSTANCE.v();
    }

    public final c K() {
        c cVar = this.applicationInfo_;
        if (cVar == null) {
            return c.M();
        }
        return cVar;
    }

    public final boolean L() {
        if ((this.bitField0_ & 1) != 0) {
            return true;
        }
        return false;
    }

    public final boolean j() {
        if ((this.bitField0_ & 8) != 0) {
            return true;
        }
        return false;
    }

    public final boolean l() {
        if ((this.bitField0_ & 2) != 0) {
            return true;
        }
        return false;
    }

    public final m m() {
        m mVar = this.traceMetric_;
        if (mVar == null) {
            return m.T();
        }
        return mVar;
    }

    public final boolean n() {
        if ((this.bitField0_ & 4) != 0) {
            return true;
        }
        return false;
    }

    public final h o() {
        h hVar = this.networkRequestMetric_;
        if (hVar == null) {
            return h.U();
        }
        return hVar;
    }

    public final g p() {
        g gVar = this.gaugeMetric_;
        if (gVar == null) {
            return g.M();
        }
        return gVar;
    }

    public final Object w(i.e eVar) {
        switch (eVar.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new w(DEFAULT_INSTANCE, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0005ဉ\u0004", new Object[]{"bitField0_", "applicationInfo_", "traceMetric_", "networkRequestMetric_", "gaugeMetric_", "transportInfo_"});
            case 3:
                return new i();
            case 4:
                return new a();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                t<i> tVar = PARSER;
                if (tVar == null) {
                    synchronized (i.class) {
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
