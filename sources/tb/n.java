package tb;

import al.g0;
import com.google.protobuf.i;
import tc.p;
import tc.t;
import tc.w;

/* compiled from: TransportInfo */
public final class n extends i<n, a> implements p {
    /* access modifiers changed from: private */
    public static final n DEFAULT_INSTANCE;
    public static final int DISPATCH_DESTINATION_FIELD_NUMBER = 1;
    private static volatile t<n> PARSER;
    private int bitField0_;
    private int dispatchDestination_;

    /* compiled from: TransportInfo */
    public static final class a extends i.a<n, a> implements p {
        public a() {
            super(n.DEFAULT_INSTANCE);
        }
    }

    static {
        n nVar = new n();
        DEFAULT_INSTANCE = nVar;
        i.E(n.class, nVar);
    }

    public final Object w(i.e eVar) {
        switch (eVar.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new w(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"bitField0_", "dispatchDestination_", g0.f19033w});
            case 3:
                return new n();
            case 4:
                return new a();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                t<n> tVar = PARSER;
                if (tVar == null) {
                    synchronized (n.class) {
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
