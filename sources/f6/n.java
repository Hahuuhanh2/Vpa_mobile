package f6;

import f6.h;
import java.util.HashMap;
import java.util.Map;

/* compiled from: EventInternal */
public abstract class n {

    /* compiled from: EventInternal */
    public static abstract class a {
        public final void a(String str, String str2) {
            Map<String, String> map = ((h.a) this).f9996f;
            if (map != null) {
                map.put(str, str2);
                return;
            }
            throw new IllegalStateException("Property \"autoMetadata\" has not been set");
        }
    }

    public final String a(String str) {
        String str2 = b().get(str);
        if (str2 == null) {
            return "";
        }
        return str2;
    }

    public abstract Map<String, String> b();

    public abstract Integer c();

    public abstract m d();

    public abstract long e();

    public final int f(String str) {
        String str2 = b().get(str);
        if (str2 == null) {
            return 0;
        }
        return Integer.valueOf(str2).intValue();
    }

    public abstract String g();

    public abstract long h();

    public final h.a i() {
        h.a aVar = new h.a();
        aVar.d(g());
        aVar.f9992b = c();
        aVar.c(d());
        aVar.f9994d = Long.valueOf(e());
        aVar.f9995e = Long.valueOf(h());
        aVar.f9996f = new HashMap(b());
        return aVar;
    }
}
