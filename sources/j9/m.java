package j9;

import com.google.crypto.tink.shaded.protobuf.CodedOutputStream;
import com.google.crypto.tink.shaded.protobuf.v;
import com.google.crypto.tink.shaded.protobuf.w;
import java.util.Iterator;
import java.util.Map;

/* compiled from: MapFieldSchemaLite */
public final class m implements l {
    public final w a(Object obj, Object obj2) {
        w wVar = (w) obj;
        w wVar2 = (w) obj2;
        if (!wVar2.isEmpty()) {
            if (!wVar.f7428a) {
                if (wVar.isEmpty()) {
                    wVar = new w();
                } else {
                    wVar = new w(wVar);
                }
            }
            wVar.c();
            if (!wVar2.isEmpty()) {
                wVar.putAll(wVar2);
            }
        }
        return wVar;
    }

    public final Object b(Object obj) {
        ((w) obj).f7428a = false;
        return obj;
    }

    public final void c(Object obj) {
        ((v) obj).getClass();
    }

    public final int d(int i10, Object obj, Object obj2) {
        w wVar = (w) obj;
        v vVar = (v) obj2;
        if (wVar.isEmpty()) {
            return 0;
        }
        Iterator it = wVar.entrySet().iterator();
        if (!it.hasNext()) {
            return 0;
        }
        Map.Entry entry = (Map.Entry) it.next();
        entry.getKey();
        entry.getValue();
        vVar.getClass();
        CodedOutputStream.b0(i10);
        throw null;
    }

    public final w e(Object obj) {
        return (w) obj;
    }

    public final w f() {
        w<?, ?> wVar = w.f7427b;
        if (wVar.isEmpty()) {
            return new w();
        }
        return new w(wVar);
    }

    public final w g(Object obj) {
        return (w) obj;
    }

    public final boolean h(Object obj) {
        return !((w) obj).f7428a;
    }
}
