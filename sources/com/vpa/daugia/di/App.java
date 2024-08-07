package com.vpa.daugia.di;

import android.graphics.Bitmap;
import androidx.lifecycle.s;
import lf.f;
import lg.b;
import sk.j;

/* compiled from: App.kt */
public final class App extends Hilt_App {

    /* renamed from: o  reason: collision with root package name */
    public static final a f19364o = new a();

    /* renamed from: p  reason: collision with root package name */
    public static App f19365p;

    /* renamed from: d  reason: collision with root package name */
    public String f19366d = "";

    /* renamed from: e  reason: collision with root package name */
    public Bitmap f19367e;

    /* renamed from: f  reason: collision with root package name */
    public Bitmap f19368f;

    /* renamed from: n  reason: collision with root package name */
    public b f19369n;

    /* compiled from: App.kt */
    public static final class a {
        public final synchronized App a() {
            App app;
            try {
                if (App.f19365p == null) {
                    App.f19365p = new App();
                }
                app = App.f19365p;
                j.d(app, "null cannot be cast to non-null type com.vpa.daugia.di.App");
            } catch (Throwable th2) {
                throw th2;
            }
            return app;
        }
    }

    static {
        f fVar = f.CONNECTED;
    }

    public App() {
        s.f2817p.f2823f.a(new pg.a());
    }

    public final boolean a() {
        if (this.f19366d.length() > 0) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:46:0x00ed  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0118  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCreate() {
        /*
            r11 = this;
            super.onCreate()
            m9.d.i(r11)
            android.content.pm.PackageManager r0 = r11.getPackageManager()     // Catch:{ Exception -> 0x00db }
            java.lang.String r1 = r11.getPackageName()     // Catch:{ Exception -> 0x00db }
            r2 = 64
            android.content.pm.PackageInfo r0 = r0.getPackageInfo(r1, r2)     // Catch:{ Exception -> 0x00db }
            android.content.pm.Signature[] r0 = r0.signatures     // Catch:{ Exception -> 0x00db }
            java.lang.String r1 = "signatures"
            sk.j.e(r0, r1)     // Catch:{ Exception -> 0x00db }
            int r1 = r0.length     // Catch:{ Exception -> 0x00db }
            r2 = 0
            r3 = r2
        L_0x001e:
            if (r3 >= r1) goto L_0x00df
            r4 = r0[r3]     // Catch:{ Exception -> 0x00db }
            java.lang.String r5 = "SHA"
            java.security.MessageDigest r5 = java.security.MessageDigest.getInstance(r5)     // Catch:{ Exception -> 0x00db }
            byte[] r4 = r4.toByteArray()     // Catch:{ Exception -> 0x00db }
            r5.update(r4)     // Catch:{ Exception -> 0x00db }
            byte[] r4 = r5.digest()     // Catch:{ Exception -> 0x00db }
            java.lang.String r4 = android.util.Base64.encodeToString(r4, r2)     // Catch:{ Exception -> 0x00db }
            java.lang.String r5 = "encodeToString(...)"
            sk.j.e(r4, r5)     // Catch:{ Exception -> 0x00db }
            int r5 = r4.length()     // Catch:{ Exception -> 0x00db }
            r6 = 1
            int r5 = r5 - r6
            r7 = r2
            r8 = r7
        L_0x0044:
            r9 = 32
            if (r7 > r5) goto L_0x0069
            if (r8 != 0) goto L_0x004c
            r10 = r7
            goto L_0x004d
        L_0x004c:
            r10 = r5
        L_0x004d:
            char r10 = r4.charAt(r10)     // Catch:{ Exception -> 0x00db }
            int r10 = sk.j.h(r10, r9)     // Catch:{ Exception -> 0x00db }
            if (r10 > 0) goto L_0x0059
            r10 = r6
            goto L_0x005a
        L_0x0059:
            r10 = r2
        L_0x005a:
            if (r8 != 0) goto L_0x0063
            if (r10 != 0) goto L_0x0060
            r8 = r6
            goto L_0x0044
        L_0x0060:
            int r7 = r7 + 1
            goto L_0x0044
        L_0x0063:
            if (r10 != 0) goto L_0x0066
            goto L_0x0069
        L_0x0066:
            int r5 = r5 + -1
            goto L_0x0044
        L_0x0069:
            int r5 = r5 + 1
            java.lang.CharSequence r4 = r4.subSequence(r7, r5)     // Catch:{ Exception -> 0x00db }
            java.lang.String r4 = r4.toString()     // Catch:{ Exception -> 0x00db }
            int r5 = r4.length()     // Catch:{ Exception -> 0x00db }
            int r5 = r5 - r6
            r7 = r2
            r8 = r7
        L_0x007a:
            if (r7 > r5) goto L_0x009d
            if (r8 != 0) goto L_0x0080
            r10 = r7
            goto L_0x0081
        L_0x0080:
            r10 = r5
        L_0x0081:
            char r10 = r4.charAt(r10)     // Catch:{ Exception -> 0x00db }
            int r10 = sk.j.h(r10, r9)     // Catch:{ Exception -> 0x00db }
            if (r10 > 0) goto L_0x008d
            r10 = r6
            goto L_0x008e
        L_0x008d:
            r10 = r2
        L_0x008e:
            if (r8 != 0) goto L_0x0097
            if (r10 != 0) goto L_0x0094
            r8 = r6
            goto L_0x007a
        L_0x0094:
            int r7 = r7 + 1
            goto L_0x007a
        L_0x0097:
            if (r10 != 0) goto L_0x009a
            goto L_0x009d
        L_0x009a:
            int r5 = r5 + -1
            goto L_0x007a
        L_0x009d:
            int r5 = r5 + 1
            java.lang.CharSequence r5 = r4.subSequence(r7, r5)     // Catch:{ Exception -> 0x00db }
            java.lang.String r5 = r5.toString()     // Catch:{ Exception -> 0x00db }
            int r5 = r5.length()     // Catch:{ Exception -> 0x00db }
            if (r5 <= 0) goto L_0x00d7
            java.lang.String r0 = "MD5"
            java.security.MessageDigest r0 = java.security.MessageDigest.getInstance(r0)     // Catch:{ Exception -> 0x00db }
            java.math.BigInteger r1 = new java.math.BigInteger     // Catch:{ Exception -> 0x00db }
            java.nio.charset.Charset r2 = yk.a.f23582b     // Catch:{ Exception -> 0x00db }
            byte[] r2 = r4.getBytes(r2)     // Catch:{ Exception -> 0x00db }
            java.lang.String r3 = "this as java.lang.String).getBytes(charset)"
            sk.j.e(r2, r3)     // Catch:{ Exception -> 0x00db }
            byte[] r0 = r0.digest(r2)     // Catch:{ Exception -> 0x00db }
            r1.<init>(r6, r0)     // Catch:{ Exception -> 0x00db }
            r0 = 16
            java.lang.String r0 = r1.toString(r0)     // Catch:{ Exception -> 0x00db }
            java.lang.String r1 = "toString(...)"
            sk.j.e(r0, r1)     // Catch:{ Exception -> 0x00db }
            java.lang.String r0 = yk.l.Y0(r0, r9)     // Catch:{ Exception -> 0x00db }
            goto L_0x00e1
        L_0x00d7:
            int r3 = r3 + 1
            goto L_0x001e
        L_0x00db:
            r0 = move-exception
            kf.h.a(r0)
        L_0x00df:
            java.lang.String r0 = ""
        L_0x00e1:
            java.lang.String r1 = "<set-?>"
            sk.j.f(r0, r1)
            j7.a.f11712t = r0
            lg.b r0 = r11.f19369n
            r1 = 0
            if (r0 == 0) goto L_0x0118
            android.content.SharedPreferences r0 = r0.f20850a
            java.lang.String r2 = "pref_base_url"
            java.lang.String r0 = r0.getString(r2, r1)
            if (r0 != 0) goto L_0x00f9
            java.lang.String r0 = "https://dgbs.vpa.com.vn/"
        L_0x00f9:
            j7.a.f11713u = r0
            java.lang.Object r0 = ab.b.f143m
            m9.d r0 = m9.d.d()
            java.lang.Class<ab.c> r1 = ab.c.class
            java.lang.Object r0 = r0.b(r1)
            ab.b r0 = (ab.b) r0
            com.google.android.gms.tasks.Task r0 = r0.getId()
            n0.l r1 = new n0.l
            r1.<init>()
            r0.addOnCompleteListener(r1)
            f19365p = r11
            return
        L_0x0118:
            java.lang.String r0 = "sharedPrefsHelper"
            sk.j.l(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vpa.daugia.di.App.onCreate():void");
    }
}
