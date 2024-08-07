package tc;

/* compiled from: Android */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final Class<?> f14944a;

    /* renamed from: b  reason: collision with root package name */
    public static final boolean f14945b;

    static {
        Class<?> cls;
        boolean z10;
        Class<?> cls2 = null;
        try {
            cls = Class.forName("libcore.io.Memory");
        } catch (Throwable unused) {
            cls = null;
        }
        f14944a = cls;
        try {
            cls2 = Class.forName("org.robolectric.Robolectric");
        } catch (Throwable unused2) {
        }
        if (cls2 != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        f14945b = z10;
    }

    public static boolean a() {
        if (f14944a == null || f14945b) {
            return false;
        }
        return true;
    }
}
