package tb;

import com.google.protobuf.i;
import com.google.protobuf.k;
import com.google.protobuf.q;
import com.google.protobuf.r;
import com.google.protobuf.y;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import tc.c0;
import tc.p;
import tc.t;
import tc.w;

/* compiled from: TraceMetric */
public final class m extends i<m, a> implements p {
    public static final int CLIENT_START_TIME_US_FIELD_NUMBER = 4;
    public static final int COUNTERS_FIELD_NUMBER = 6;
    public static final int CUSTOM_ATTRIBUTES_FIELD_NUMBER = 8;
    /* access modifiers changed from: private */
    public static final m DEFAULT_INSTANCE;
    public static final int DURATION_US_FIELD_NUMBER = 5;
    public static final int IS_AUTO_FIELD_NUMBER = 2;
    public static final int NAME_FIELD_NUMBER = 1;
    private static volatile t<m> PARSER = null;
    public static final int PERF_SESSIONS_FIELD_NUMBER = 9;
    public static final int SUBTRACES_FIELD_NUMBER = 7;
    private int bitField0_;
    private long clientStartTimeUs_;
    private r<String, Long> counters_;
    private r<String, String> customAttributes_;
    private long durationUs_;
    private boolean isAuto_;
    private String name_ = "";
    private k.c<k> perfSessions_;
    private k.c<m> subtraces_;

    /* compiled from: TraceMetric */
    public static final class a extends i.a<m, a> implements p {
        public a() {
            super(m.DEFAULT_INSTANCE);
        }

        public final void A(String str) {
            s();
            m.G((m) this.f7906b, str);
        }

        public final void w(m mVar) {
            s();
            m.I((m) this.f7906b, mVar);
        }

        public final void x(long j10, String str) {
            str.getClass();
            s();
            m.H((m) this.f7906b).put(str, Long.valueOf(j10));
        }

        public final void y(long j10) {
            s();
            m.N((m) this.f7906b, j10);
        }

        public final void z(long j10) {
            s();
            m.O((m) this.f7906b, j10);
        }
    }

    /* compiled from: TraceMetric */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public static final q<String, Long> f14942a = new q<>(c0.f14966d, c0.INT64, 0L);
    }

    /* compiled from: TraceMetric */
    public static final class c {

        /* renamed from: a  reason: collision with root package name */
        public static final q<String, String> f14943a;

        static {
            c0.a aVar = c0.f14966d;
            f14943a = new q<>(aVar, aVar, "");
        }
    }

    static {
        m mVar = new m();
        DEFAULT_INSTANCE = mVar;
        i.E(m.class, mVar);
    }

    public m() {
        r<?, ?> rVar = r.f7936b;
        this.counters_ = rVar;
        this.customAttributes_ = rVar;
        y<Object> yVar = y.f7958d;
        this.subtraces_ = yVar;
        this.perfSessions_ = yVar;
    }

    public static void G(m mVar, String str) {
        mVar.getClass();
        str.getClass();
        mVar.bitField0_ |= 1;
        mVar.name_ = str;
    }

    public static r H(m mVar) {
        r<String, Long> rVar = mVar.counters_;
        if (!rVar.f7937a) {
            mVar.counters_ = rVar.e();
        }
        return mVar.counters_;
    }

    public static void I(m mVar, m mVar2) {
        mVar.getClass();
        mVar2.getClass();
        k.c<m> cVar = mVar.subtraces_;
        if (!cVar.f()) {
            mVar.subtraces_ = i.D(cVar);
        }
        mVar.subtraces_.add(mVar2);
    }

    public static void J(m mVar, ArrayList arrayList) {
        k.c<m> cVar = mVar.subtraces_;
        if (!cVar.f()) {
            mVar.subtraces_ = i.D(cVar);
        }
        com.google.protobuf.a.d(arrayList, mVar.subtraces_);
    }

    public static r K(m mVar) {
        r<String, String> rVar = mVar.customAttributes_;
        if (!rVar.f7937a) {
            mVar.customAttributes_ = rVar.e();
        }
        return mVar.customAttributes_;
    }

    public static void L(m mVar, k kVar) {
        mVar.getClass();
        k.c<k> cVar = mVar.perfSessions_;
        if (!cVar.f()) {
            mVar.perfSessions_ = i.D(cVar);
        }
        mVar.perfSessions_.add(kVar);
    }

    public static void M(m mVar, List list) {
        k.c<k> cVar = mVar.perfSessions_;
        if (!cVar.f()) {
            mVar.perfSessions_ = i.D(cVar);
        }
        com.google.protobuf.a.d(list, mVar.perfSessions_);
    }

    public static void N(m mVar, long j10) {
        mVar.bitField0_ |= 4;
        mVar.clientStartTimeUs_ = j10;
    }

    public static void O(m mVar, long j10) {
        mVar.bitField0_ |= 8;
        mVar.durationUs_ = j10;
    }

    public static m T() {
        return DEFAULT_INSTANCE;
    }

    public static a Z() {
        return (a) DEFAULT_INSTANCE.v();
    }

    public final boolean P() {
        return this.customAttributes_.containsKey("Hosting_activity");
    }

    public final int Q() {
        return this.counters_.size();
    }

    public final Map<String, Long> R() {
        return Collections.unmodifiableMap(this.counters_);
    }

    public final Map<String, String> S() {
        return Collections.unmodifiableMap(this.customAttributes_);
    }

    public final long U() {
        return this.durationUs_;
    }

    public final String V() {
        return this.name_;
    }

    public final k.c W() {
        return this.perfSessions_;
    }

    public final k.c X() {
        return this.subtraces_;
    }

    public final boolean Y() {
        if ((this.bitField0_ & 4) != 0) {
            return true;
        }
        return false;
    }

    public final Object w(i.e eVar) {
        Class<m> cls = m.class;
        switch (eVar.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new w(DEFAULT_INSTANCE, "\u0001\b\u0000\u0001\u0001\t\b\u0002\u0002\u0000\u0001ဈ\u0000\u0002ဇ\u0001\u0004ဂ\u0002\u0005ဂ\u0003\u00062\u0007\u001b\b2\t\u001b", new Object[]{"bitField0_", "name_", "isAuto_", "clientStartTimeUs_", "durationUs_", "counters_", b.f14942a, "subtraces_", cls, "customAttributes_", c.f14943a, "perfSessions_", k.class});
            case 3:
                return new m();
            case 4:
                return new a();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                t<m> tVar = PARSER;
                if (tVar == null) {
                    synchronized (cls) {
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
