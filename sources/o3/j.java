package o3;

/* compiled from: Logger */
public abstract class j {

    /* renamed from: a  reason: collision with root package name */
    public static final Object f13683a = new Object();

    /* renamed from: b  reason: collision with root package name */
    public static volatile j f13684b;

    /* compiled from: Logger */
    public static class a extends j {
        public a(int i10) {
        }
    }

    public static j a() {
        j jVar;
        synchronized (f13683a) {
            if (f13684b == null) {
                f13684b = new a(3);
            }
            jVar = f13684b;
        }
        return jVar;
    }

    public static String b(String str) {
        int length = str.length();
        StringBuilder sb2 = new StringBuilder(23);
        sb2.append("WM-");
        if (length >= 20) {
            sb2.append(str.substring(0, 20));
        } else {
            sb2.append(str);
        }
        return sb2.toString();
    }
}
