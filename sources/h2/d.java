package h2;

import androidx.datastore.preferences.protobuf.InvalidProtocolBufferException;
import androidx.datastore.preferences.protobuf.UninitializedMessageException;
import androidx.datastore.preferences.protobuf.e;
import androidx.datastore.preferences.protobuf.i;
import androidx.datastore.preferences.protobuf.n;
import androidx.datastore.preferences.protobuf.v;
import androidx.datastore.preferences.protobuf.w;
import j2.q;
import j2.t;
import j2.z;
import java.io.FileInputStream;
import java.util.Collections;
import java.util.Map;

/* compiled from: PreferencesProto */
public final class d extends n<d, a> implements j2.n {
    /* access modifiers changed from: private */
    public static final d DEFAULT_INSTANCE;
    private static volatile q<d> PARSER = null;
    public static final int PREFERENCES_FIELD_NUMBER = 1;
    private w<String, f> preferences_ = w.f2337b;

    /* compiled from: PreferencesProto */
    public static final class a extends n.a<d, a> implements j2.n {
        public a() {
            super(d.DEFAULT_INSTANCE);
        }
    }

    /* compiled from: PreferencesProto */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public static final v<String, f> f10541a = new v<>(z.f11535c, z.f11537e, f.y());
    }

    static {
        d dVar = new d();
        DEFAULT_INSTANCE = dVar;
        n.o(d.class, dVar);
    }

    public static w q(d dVar) {
        w<String, f> wVar = dVar.preferences_;
        if (!wVar.f2338a) {
            dVar.preferences_ = wVar.e();
        }
        return dVar.preferences_;
    }

    public static a s() {
        return (a) ((n.a) DEFAULT_INSTANCE.k(n.f.NEW_BUILDER));
    }

    public static d t(FileInputStream fileInputStream) {
        n n10 = n.n(DEFAULT_INSTANCE, new e.b(fileInputStream), i.a());
        if (n10.f()) {
            return (d) n10;
        }
        throw new InvalidProtocolBufferException(new UninitializedMessageException().getMessage());
    }

    public final Object k(n.f fVar) {
        switch (fVar.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new t(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"preferences_", b.f10541a});
            case 3:
                return new d();
            case 4:
                return new a();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                q<d> qVar = PARSER;
                if (qVar == null) {
                    synchronized (d.class) {
                        try {
                            qVar = PARSER;
                            if (qVar == null) {
                                qVar = new n.b<>(DEFAULT_INSTANCE);
                                PARSER = qVar;
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                }
                return qVar;
            default:
                throw new UnsupportedOperationException();
        }
    }

    public final Map<String, f> r() {
        return Collections.unmodifiableMap(this.preferences_);
    }
}
