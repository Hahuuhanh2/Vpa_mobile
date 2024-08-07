package r2;

import java.io.Closeable;
import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedHashSet;

/* compiled from: ViewModel */
public abstract class v {

    /* renamed from: a  reason: collision with root package name */
    public final HashMap f14497a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    public final LinkedHashSet f14498b = new LinkedHashSet();

    /* renamed from: c  reason: collision with root package name */
    public volatile boolean f14499c = false;

    public static void a(Object obj) {
        if (obj instanceof Closeable) {
            try {
                ((Closeable) obj).close();
            } catch (IOException e10) {
                throw new RuntimeException(e10);
            }
        }
    }

    public void b() {
    }

    public final Object c(Object obj, String str) {
        Object obj2;
        synchronized (this.f14497a) {
            obj2 = this.f14497a.get(str);
            if (obj2 == null) {
                this.f14497a.put(str, obj);
            }
        }
        if (obj2 != null) {
            obj = obj2;
        }
        if (this.f14499c) {
            a(obj);
        }
        return obj;
    }
}
