package tb;

import com.google.protobuf.c;
import com.google.protobuf.i;
import com.google.protobuf.j;
import com.google.protobuf.k;
import java.util.Arrays;
import tb.l;
import tc.p;
import tc.t;
import tc.w;

/* compiled from: PerfSession */
public final class k extends i<k, b> implements p {
    /* access modifiers changed from: private */
    public static final k DEFAULT_INSTANCE;
    private static volatile t<k> PARSER = null;
    public static final int SESSION_ID_FIELD_NUMBER = 1;
    public static final int SESSION_VERBOSITY_FIELD_NUMBER = 2;
    private static final tc.i<Integer, l> sessionVerbosity_converter_ = new a();
    private int bitField0_;
    private String sessionId_ = "";
    private k.b sessionVerbosity_ = j.f7914d;

    /* compiled from: PerfSession */
    public class a implements tc.i<Integer, l> {
    }

    /* compiled from: PerfSession */
    public static final class b extends i.a<k, b> implements p {
        public b() {
            super(k.DEFAULT_INSTANCE);
        }
    }

    static {
        k kVar = new k();
        DEFAULT_INSTANCE = kVar;
        i.E(k.class, kVar);
    }

    public static void G(k kVar, String str) {
        kVar.getClass();
        str.getClass();
        kVar.bitField0_ |= 1;
        kVar.sessionId_ = str;
    }

    public static void H(k kVar) {
        int i10;
        kVar.getClass();
        k.b bVar = kVar.sessionVerbosity_;
        if (!((c) bVar).f7887a) {
            j jVar = (j) bVar;
            int i11 = jVar.f7916c;
            if (i11 == 0) {
                i10 = 10;
            } else {
                i10 = i11 * 2;
            }
            if (i10 >= i11) {
                kVar.sessionVerbosity_ = new j(Arrays.copyOf(jVar.f7915b, i10), jVar.f7916c);
            } else {
                throw new IllegalArgumentException();
            }
        }
        ((j) kVar.sessionVerbosity_).i(1);
    }

    public static b K() {
        return (b) DEFAULT_INSTANCE.v();
    }

    public final l I() {
        l lVar;
        l lVar2 = l.SESSION_VERBOSITY_NONE;
        int m10 = ((j) this.sessionVerbosity_).m(0);
        if (m10 == 0) {
            lVar = lVar2;
        } else if (m10 != 1) {
            lVar = null;
        } else {
            lVar = l.GAUGES_AND_SYSTEM_EVENTS;
        }
        if (lVar == null) {
            return lVar2;
        }
        return lVar;
    }

    public final int J() {
        return ((j) this.sessionVerbosity_).f7916c;
    }

    public final Object w(i.e eVar) {
        switch (eVar.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new w(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001e", new Object[]{"bitField0_", "sessionId_", "sessionVerbosity_", l.a.f14941a});
            case 3:
                return new k();
            case 4:
                return new b();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                t<k> tVar = PARSER;
                if (tVar == null) {
                    synchronized (k.class) {
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
