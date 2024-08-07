package tb;

import com.google.protobuf.i;
import com.google.protobuf.k;
import com.google.protobuf.q;
import com.google.protobuf.r;
import com.google.protobuf.y;
import java.util.List;
import p3.l0;
import tc.c0;
import tc.p;
import tc.t;
import tc.w;

/* compiled from: NetworkRequestMetric */
public final class h extends i<h, a> implements p {
    public static final int CLIENT_START_TIME_US_FIELD_NUMBER = 7;
    public static final int CUSTOM_ATTRIBUTES_FIELD_NUMBER = 12;
    /* access modifiers changed from: private */
    public static final h DEFAULT_INSTANCE;
    public static final int HTTP_METHOD_FIELD_NUMBER = 2;
    public static final int HTTP_RESPONSE_CODE_FIELD_NUMBER = 5;
    public static final int NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER = 11;
    private static volatile t<h> PARSER = null;
    public static final int PERF_SESSIONS_FIELD_NUMBER = 13;
    public static final int REQUEST_PAYLOAD_BYTES_FIELD_NUMBER = 3;
    public static final int RESPONSE_CONTENT_TYPE_FIELD_NUMBER = 6;
    public static final int RESPONSE_PAYLOAD_BYTES_FIELD_NUMBER = 4;
    public static final int TIME_TO_REQUEST_COMPLETED_US_FIELD_NUMBER = 8;
    public static final int TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER = 10;
    public static final int TIME_TO_RESPONSE_INITIATED_US_FIELD_NUMBER = 9;
    public static final int URL_FIELD_NUMBER = 1;
    private int bitField0_;
    private long clientStartTimeUs_;
    private r<String, String> customAttributes_ = r.f7936b;
    private int httpMethod_;
    private int httpResponseCode_;
    private int networkClientErrorReason_;
    private k.c<k> perfSessions_ = y.f7958d;
    private long requestPayloadBytes_;
    private String responseContentType_ = "";
    private long responsePayloadBytes_;
    private long timeToRequestCompletedUs_;
    private long timeToResponseCompletedUs_;
    private long timeToResponseInitiatedUs_;
    private String url_ = "";

    /* compiled from: NetworkRequestMetric */
    public static final class a extends i.a<h, a> implements p {
        public a() {
            super(h.DEFAULT_INSTANCE);
        }
    }

    /* compiled from: NetworkRequestMetric */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public static final q<String, String> f14923a;

        static {
            c0.a aVar = c0.f14966d;
            f14923a = new q<>(aVar, aVar, "");
        }
    }

    /* compiled from: NetworkRequestMetric */
    public enum c implements k.a {
        HTTP_METHOD_UNKNOWN(0),
        GET(1),
        PUT(2),
        POST(3),
        DELETE(4),
        HEAD(5),
        PATCH(6),
        OPTIONS(7),
        TRACE(8),
        CONNECT(9);
        

        /* renamed from: a  reason: collision with root package name */
        public final int f14935a;

        /* compiled from: NetworkRequestMetric */
        public static final class a {

            /* renamed from: a  reason: collision with root package name */
            public static final a f14936a = null;

            static {
                f14936a = new a();
            }
        }

        /* access modifiers changed from: public */
        c(int i10) {
            this.f14935a = i10;
        }

        public static c b(int i10) {
            switch (i10) {
                case 0:
                    return HTTP_METHOD_UNKNOWN;
                case 1:
                    return GET;
                case 2:
                    return PUT;
                case 3:
                    return POST;
                case 4:
                    return DELETE;
                case 5:
                    return HEAD;
                case 6:
                    return PATCH;
                case 7:
                    return OPTIONS;
                case 8:
                    return TRACE;
                case 9:
                    return CONNECT;
                default:
                    return null;
            }
        }

        public final int a() {
            return this.f14935a;
        }
    }

    static {
        h hVar = new h();
        DEFAULT_INSTANCE = hVar;
        i.E(h.class, hVar);
    }

    public static void G(h hVar, String str) {
        hVar.getClass();
        str.getClass();
        hVar.bitField0_ |= 1;
        hVar.url_ = str;
    }

    public static void H(h hVar) {
        hVar.getClass();
        hVar.networkClientErrorReason_ = 1;
        hVar.bitField0_ |= 16;
    }

    public static void I(h hVar, int i10) {
        hVar.bitField0_ |= 32;
        hVar.httpResponseCode_ = i10;
    }

    public static void J(h hVar, String str) {
        hVar.getClass();
        str.getClass();
        hVar.bitField0_ |= 64;
        hVar.responseContentType_ = str;
    }

    public static void K(h hVar) {
        hVar.bitField0_ &= -65;
        hVar.responseContentType_ = DEFAULT_INSTANCE.responseContentType_;
    }

    public static void L(h hVar, long j10) {
        hVar.bitField0_ |= 128;
        hVar.clientStartTimeUs_ = j10;
    }

    public static void M(h hVar, long j10) {
        hVar.bitField0_ |= 256;
        hVar.timeToRequestCompletedUs_ = j10;
    }

    public static void N(h hVar, long j10) {
        hVar.bitField0_ |= 512;
        hVar.timeToResponseInitiatedUs_ = j10;
    }

    public static void O(h hVar, long j10) {
        hVar.bitField0_ |= 1024;
        hVar.timeToResponseCompletedUs_ = j10;
    }

    public static void P(h hVar, List list) {
        k.c<k> cVar = hVar.perfSessions_;
        if (!cVar.f()) {
            hVar.perfSessions_ = i.D(cVar);
        }
        com.google.protobuf.a.d(list, hVar.perfSessions_);
    }

    public static void Q(h hVar, c cVar) {
        hVar.getClass();
        hVar.httpMethod_ = cVar.f14935a;
        hVar.bitField0_ |= 2;
    }

    public static void R(h hVar, long j10) {
        hVar.bitField0_ |= 4;
        hVar.requestPayloadBytes_ = j10;
    }

    public static void S(h hVar, long j10) {
        hVar.bitField0_ |= 8;
        hVar.responsePayloadBytes_ = j10;
    }

    public static h U() {
        return DEFAULT_INSTANCE;
    }

    public static a m0() {
        return (a) DEFAULT_INSTANCE.v();
    }

    public final long T() {
        return this.clientStartTimeUs_;
    }

    public final c V() {
        c b10 = c.b(this.httpMethod_);
        if (b10 == null) {
            return c.HTTP_METHOD_UNKNOWN;
        }
        return b10;
    }

    public final int W() {
        return this.httpResponseCode_;
    }

    public final k.c X() {
        return this.perfSessions_;
    }

    public final long Y() {
        return this.requestPayloadBytes_;
    }

    public final long Z() {
        return this.responsePayloadBytes_;
    }

    public final long a0() {
        return this.timeToRequestCompletedUs_;
    }

    public final long b0() {
        return this.timeToResponseCompletedUs_;
    }

    public final long c0() {
        return this.timeToResponseInitiatedUs_;
    }

    public final String d0() {
        return this.url_;
    }

    public final boolean e0() {
        if ((this.bitField0_ & 128) != 0) {
            return true;
        }
        return false;
    }

    public final boolean f0() {
        if ((this.bitField0_ & 2) != 0) {
            return true;
        }
        return false;
    }

    public final boolean g0() {
        if ((this.bitField0_ & 32) != 0) {
            return true;
        }
        return false;
    }

    public final boolean h0() {
        if ((this.bitField0_ & 4) != 0) {
            return true;
        }
        return false;
    }

    public final boolean i0() {
        if ((this.bitField0_ & 8) != 0) {
            return true;
        }
        return false;
    }

    public final boolean j0() {
        if ((this.bitField0_ & 256) != 0) {
            return true;
        }
        return false;
    }

    public final boolean k0() {
        if ((this.bitField0_ & 1024) != 0) {
            return true;
        }
        return false;
    }

    public final boolean l0() {
        if ((this.bitField0_ & 512) != 0) {
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
                return new w(DEFAULT_INSTANCE, "\u0001\r\u0000\u0001\u0001\r\r\u0001\u0001\u0000\u0001ဈ\u0000\u0002ဌ\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005င\u0005\u0006ဈ\u0006\u0007ဂ\u0007\bဂ\b\tဂ\t\nဂ\n\u000bဌ\u0004\f2\r\u001b", new Object[]{"bitField0_", "url_", "httpMethod_", c.a.f14936a, "requestPayloadBytes_", "responsePayloadBytes_", "httpResponseCode_", "responseContentType_", "clientStartTimeUs_", "timeToRequestCompletedUs_", "timeToResponseInitiatedUs_", "timeToResponseCompletedUs_", "networkClientErrorReason_", l0.f13967y, "customAttributes_", b.f14923a, "perfSessions_", k.class});
            case 3:
                return new h();
            case 4:
                return new a();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                t<h> tVar = PARSER;
                if (tVar == null) {
                    synchronized (h.class) {
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
