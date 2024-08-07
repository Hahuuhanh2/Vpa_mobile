package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.v;
import java.util.Map;

/* compiled from: MapFieldSchemaLite */
public final class y implements x {
    public final w a(Object obj, Object obj2) {
        w wVar = (w) obj;
        w wVar2 = (w) obj2;
        if (!wVar2.isEmpty()) {
            if (!wVar.f2338a) {
                wVar = wVar.e();
            }
            wVar.c();
            if (!wVar2.isEmpty()) {
                wVar.putAll(wVar2);
            }
        }
        return wVar;
    }

    public final Object b(Object obj) {
        ((w) obj).f2338a = false;
        return obj;
    }

    public final v.a<?, ?> c(Object obj) {
        return ((v) obj).f2330a;
    }

    public final int d(int i10, Object obj, Object obj2) {
        w wVar = (w) obj;
        v vVar = (v) obj2;
        int i11 = 0;
        if (!wVar.isEmpty()) {
            for (Map.Entry entry : wVar.entrySet()) {
                Object key = entry.getKey();
                Object value = entry.getValue();
                vVar.getClass();
                int b02 = CodedOutputStream.b0(i10);
                int a10 = v.a(vVar.f2330a, key, value);
                i11 += CodedOutputStream.d0(a10) + a10 + b02;
            }
        }
        return i11;
    }

    public final w e(Object obj) {
        return (w) obj;
    }

    public final w f() {
        return w.f2337b.e();
    }

    public final w g(Object obj) {
        return (w) obj;
    }

    public final boolean h(Object obj) {
        return !((w) obj).f2338a;
    }
}
