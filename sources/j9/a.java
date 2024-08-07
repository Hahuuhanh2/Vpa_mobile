package j9;

/* compiled from: Android */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final Class<?> f11727a;

    /* renamed from: b  reason: collision with root package name */
    public static final boolean f11728b;

    static {
        Class<?> cls;
        boolean z10;
        Class<?> cls2 = null;
        try {
            cls = Class.forName("libcore.io.Memory");
        } catch (Throwable unused) {
            cls = null;
        }
        f11727a = cls;
        try {
            cls2 = Class.forName("org.robolectric.Robolectric");
        } catch (Throwable unused2) {
        }
        if (cls2 != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        f11728b = z10;
    }

    public static boolean a() {
        if (f11727a == null || f11728b) {
            return false;
        }
        return true;
    }
}
