package tc;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: ExtensionRegistryLite */
public final class e {

    /* renamed from: b  reason: collision with root package name */
    public static volatile e f14983b;

    /* renamed from: c  reason: collision with root package name */
    public static final e f14984c = new e(0);

    /* renamed from: a  reason: collision with root package name */
    public final Map<Object, Object> f14985a;

    public e() {
        this.f14985a = new HashMap();
    }

    public static void a() {
        if (f14983b == null) {
            synchronized (e.class) {
                if (f14983b == null) {
                    Class<?> cls = d.f14971a;
                    e eVar = null;
                    if (cls != null) {
                        try {
                            eVar = (e) cls.getDeclaredMethod("getEmptyRegistry", new Class[0]).invoke((Object) null, new Object[0]);
                        } catch (Exception unused) {
                        }
                    }
                    if (eVar == null) {
                        eVar = f14984c;
                    }
                    f14983b = eVar;
                }
            }
        }
    }

    public e(int i10) {
        this.f14985a = Collections.emptyMap();
    }
}
