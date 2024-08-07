package s1;

import android.os.Build;
import android.os.ext.SdkExtensions;

/* compiled from: BuildCompat.kt */
public final class a {

    /* renamed from: s1.a$a  reason: collision with other inner class name */
    /* compiled from: BuildCompat.kt */
    public static final class C0189a {

        /* renamed from: a  reason: collision with root package name */
        public static final C0189a f14587a = new C0189a();

        public final int a(int i10) {
            return SdkExtensions.getExtensionVersion(i10);
        }
    }

    static {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 30) {
            C0189a.f14587a.a(30);
        }
        if (i10 >= 30) {
            C0189a.f14587a.a(31);
        }
        if (i10 >= 30) {
            C0189a.f14587a.a(33);
        }
        if (i10 >= 30) {
            C0189a.f14587a.a(1000000);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean a() {
        /*
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 0
            r2 = 1
            r3 = 33
            if (r0 >= r3) goto L_0x003b
            r3 = 32
            if (r0 < r3) goto L_0x003c
            java.lang.String r0 = android.os.Build.VERSION.CODENAME
            java.lang.String r3 = "CODENAME"
            sk.j.e(r0, r3)
            java.lang.String r3 = "REL"
            boolean r3 = sk.j.a(r3, r0)
            if (r3 == 0) goto L_0x001c
            goto L_0x0038
        L_0x001c:
            java.util.Locale r3 = java.util.Locale.ROOT
            java.lang.String r0 = r0.toUpperCase(r3)
            java.lang.String r4 = "this as java.lang.String).toUpperCase(Locale.ROOT)"
            sk.j.e(r0, r4)
            java.lang.String r5 = "Tiramisu"
            java.lang.String r3 = r5.toUpperCase(r3)
            sk.j.e(r3, r4)
            int r0 = r0.compareTo(r3)
            if (r0 < 0) goto L_0x0038
            r0 = r2
            goto L_0x0039
        L_0x0038:
            r0 = r1
        L_0x0039:
            if (r0 == 0) goto L_0x003c
        L_0x003b:
            r1 = r2
        L_0x003c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: s1.a.a():boolean");
    }
}
