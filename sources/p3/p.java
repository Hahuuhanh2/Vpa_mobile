package p3;

import android.content.Context;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.concurrent.Callable;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class p implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f14002a = 1;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ String f14003b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Object f14004c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ Serializable f14005d;

    public /* synthetic */ p(Context context, String str, String str2) {
        this.f14004c = context;
        this.f14003b = str;
        this.f14005d = str2;
    }

    public /* synthetic */ p(r rVar, ArrayList arrayList, String str) {
        this.f14004c = rVar;
        this.f14005d = arrayList;
        this.f14003b = str;
    }

    /* JADX WARNING: Removed duplicated region for block: B:52:0x00ce  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x00f0  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x00f6  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object call() {
        /*
            r11 = this;
            int r0 = r11.f14002a
            switch(r0) {
                case 0: goto L_0x0006;
                default: goto L_0x0005;
            }
        L_0x0005:
            goto L_0x0028
        L_0x0006:
            java.lang.Object r0 = r11.f14004c
            p3.r r0 = (p3.r) r0
            java.io.Serializable r1 = r11.f14005d
            java.util.ArrayList r1 = (java.util.ArrayList) r1
            java.lang.String r2 = r11.f14003b
            androidx.work.impl.WorkDatabase r3 = r0.f14015e
            x3.w r3 = r3.v()
            java.util.ArrayList r3 = r3.a(r2)
            r1.addAll(r3)
            androidx.work.impl.WorkDatabase r0 = r0.f14015e
            x3.t r0 = r0.u()
            x3.s r0 = r0.t(r2)
            return r0
        L_0x0028:
            java.lang.Object r0 = r11.f14004c
            android.content.Context r0 = (android.content.Context) r0
            java.lang.String r1 = r11.f14003b
            java.io.Serializable r2 = r11.f14005d
            java.lang.String r2 = (java.lang.String) r2
            java.util.HashMap r3 = com.airbnb.lottie.p.f4876a
            k4.e r3 = m9.b.f13205q
            if (r3 != 0) goto L_0x0071
            java.lang.Class<k4.e> r4 = k4.e.class
            monitor-enter(r4)
            k4.e r3 = m9.b.f13205q     // Catch:{ all -> 0x006e }
            if (r3 != 0) goto L_0x006c
            k4.e r3 = new k4.e     // Catch:{ all -> 0x006e }
            android.content.Context r0 = r0.getApplicationContext()     // Catch:{ all -> 0x006e }
            k4.d r5 = m9.b.f13206r     // Catch:{ all -> 0x006e }
            if (r5 != 0) goto L_0x0062
            java.lang.Class<k4.d> r5 = k4.d.class
            monitor-enter(r5)     // Catch:{ all -> 0x006e }
            k4.d r6 = m9.b.f13206r     // Catch:{ all -> 0x005f }
            if (r6 != 0) goto L_0x005c
            k4.d r6 = new k4.d     // Catch:{ all -> 0x005f }
            com.airbnb.lottie.c r7 = new com.airbnb.lottie.c     // Catch:{ all -> 0x005f }
            r7.<init>(r0)     // Catch:{ all -> 0x005f }
            r6.<init>((java.lang.Object) r7)     // Catch:{ all -> 0x005f }
            m9.b.f13206r = r6     // Catch:{ all -> 0x005f }
        L_0x005c:
            monitor-exit(r5)     // Catch:{ all -> 0x005f }
            r5 = r6
            goto L_0x0062
        L_0x005f:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x005f }
            throw r0     // Catch:{ all -> 0x006e }
        L_0x0062:
            a.a r0 = new a.a     // Catch:{ all -> 0x006e }
            r0.<init>()     // Catch:{ all -> 0x006e }
            r3.<init>(r5, r0)     // Catch:{ all -> 0x006e }
            m9.b.f13205q = r3     // Catch:{ all -> 0x006e }
        L_0x006c:
            monitor-exit(r4)     // Catch:{ all -> 0x006e }
            goto L_0x0071
        L_0x006e:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x006e }
            throw r0
        L_0x0071:
            k4.b r0 = k4.b.ZIP
            r4 = 0
            r5 = 0
            if (r2 != 0) goto L_0x0079
            goto L_0x00ed
        L_0x0079:
            k4.d r6 = r3.f11973a
            r6.getClass()
            java.io.File r7 = new java.io.File     // Catch:{ FileNotFoundException -> 0x00ca }
            java.io.File r8 = r6.f()     // Catch:{ FileNotFoundException -> 0x00ca }
            k4.b r9 = k4.b.JSON     // Catch:{ FileNotFoundException -> 0x00ca }
            java.lang.String r10 = k4.d.e(r1, r9, r5)     // Catch:{ FileNotFoundException -> 0x00ca }
            r7.<init>(r8, r10)     // Catch:{ FileNotFoundException -> 0x00ca }
            boolean r8 = r7.exists()     // Catch:{ FileNotFoundException -> 0x00ca }
            if (r8 == 0) goto L_0x0094
            goto L_0x00a9
        L_0x0094:
            java.io.File r7 = new java.io.File     // Catch:{ FileNotFoundException -> 0x00ca }
            java.io.File r6 = r6.f()     // Catch:{ FileNotFoundException -> 0x00ca }
            java.lang.String r8 = k4.d.e(r1, r0, r5)     // Catch:{ FileNotFoundException -> 0x00ca }
            r7.<init>(r6, r8)     // Catch:{ FileNotFoundException -> 0x00ca }
            boolean r6 = r7.exists()     // Catch:{ FileNotFoundException -> 0x00ca }
            if (r6 == 0) goto L_0x00a8
            goto L_0x00a9
        L_0x00a8:
            r7 = r4
        L_0x00a9:
            if (r7 != 0) goto L_0x00ac
            goto L_0x00ca
        L_0x00ac:
            java.io.FileInputStream r6 = new java.io.FileInputStream     // Catch:{ FileNotFoundException -> 0x00ca }
            r6.<init>(r7)     // Catch:{ FileNotFoundException -> 0x00ca }
            java.lang.String r8 = r7.getAbsolutePath()
            java.lang.String r10 = ".zip"
            boolean r8 = r8.endsWith(r10)
            if (r8 == 0) goto L_0x00be
            r9 = r0
        L_0x00be:
            r7.getAbsolutePath()
            n4.c.a()
            android.util.Pair r7 = new android.util.Pair
            r7.<init>(r9, r6)
            goto L_0x00cb
        L_0x00ca:
            r7 = r4
        L_0x00cb:
            if (r7 != 0) goto L_0x00ce
            goto L_0x00ed
        L_0x00ce:
            java.lang.Object r6 = r7.first
            k4.b r6 = (k4.b) r6
            java.lang.Object r7 = r7.second
            java.io.InputStream r7 = (java.io.InputStream) r7
            if (r6 != r0) goto L_0x00e2
            java.util.zip.ZipInputStream r0 = new java.util.zip.ZipInputStream
            r0.<init>(r7)
            com.airbnb.lottie.h0 r0 = com.airbnb.lottie.p.f(r0, r1)
            goto L_0x00e6
        L_0x00e2:
            com.airbnb.lottie.h0 r0 = com.airbnb.lottie.p.c(r7, r1)
        L_0x00e6:
            V r0 = r0.f4830a
            if (r0 == 0) goto L_0x00ed
            com.airbnb.lottie.i r0 = (com.airbnb.lottie.i) r0
            goto L_0x00ee
        L_0x00ed:
            r0 = r4
        L_0x00ee:
            if (r0 == 0) goto L_0x00f6
            com.airbnb.lottie.h0 r1 = new com.airbnb.lottie.h0
            r1.<init>((com.airbnb.lottie.i) r0)
            goto L_0x0155
        L_0x00f6:
            n4.c.a()
            java.lang.String r0 = "LottieFetchResult close failed "
            n4.c.a()
            a.a r6 = r3.f11974b     // Catch:{ Exception -> 0x0116 }
            r6.getClass()     // Catch:{ Exception -> 0x0116 }
            k4.a r4 = a.a.f(r1)     // Catch:{ Exception -> 0x0116 }
            java.net.HttpURLConnection r6 = r4.f11961a     // Catch:{ IOException -> 0x0118 }
            int r6 = r6.getResponseCode()     // Catch:{ IOException -> 0x0118 }
            int r6 = r6 / 100
            r7 = 2
            if (r6 != r7) goto L_0x0118
            r5 = 1
            goto L_0x0118
        L_0x0114:
            r1 = move-exception
            goto L_0x0165
        L_0x0116:
            r1 = move-exception
            goto L_0x0145
        L_0x0118:
            if (r5 == 0) goto L_0x012e
            java.net.HttpURLConnection r5 = r4.f11961a     // Catch:{ Exception -> 0x0116 }
            java.io.InputStream r5 = r5.getInputStream()     // Catch:{ Exception -> 0x0116 }
            java.net.HttpURLConnection r6 = r4.f11961a     // Catch:{ Exception -> 0x0116 }
            java.lang.String r6 = r6.getContentType()     // Catch:{ Exception -> 0x0116 }
            com.airbnb.lottie.h0 r1 = r3.a(r1, r5, r6, r2)     // Catch:{ Exception -> 0x0116 }
            n4.c.a()     // Catch:{ Exception -> 0x0116 }
            goto L_0x013c
        L_0x012e:
            com.airbnb.lottie.h0 r1 = new com.airbnb.lottie.h0     // Catch:{ Exception -> 0x0116 }
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException     // Catch:{ Exception -> 0x0116 }
            java.lang.String r5 = r4.d()     // Catch:{ Exception -> 0x0116 }
            r3.<init>(r5)     // Catch:{ Exception -> 0x0116 }
            r1.<init>((java.lang.Throwable) r3)     // Catch:{ Exception -> 0x0116 }
        L_0x013c:
            r4.close()     // Catch:{ IOException -> 0x0140 }
            goto L_0x0155
        L_0x0140:
            r3 = move-exception
            n4.c.c(r0, r3)
            goto L_0x0155
        L_0x0145:
            com.airbnb.lottie.h0 r3 = new com.airbnb.lottie.h0     // Catch:{ all -> 0x0114 }
            r3.<init>((java.lang.Throwable) r1)     // Catch:{ all -> 0x0114 }
            if (r4 == 0) goto L_0x0154
            r4.close()     // Catch:{ IOException -> 0x0150 }
            goto L_0x0154
        L_0x0150:
            r1 = move-exception
            n4.c.c(r0, r1)
        L_0x0154:
            r1 = r3
        L_0x0155:
            if (r2 == 0) goto L_0x0164
            V r0 = r1.f4830a
            if (r0 == 0) goto L_0x0164
            g4.g r3 = g4.g.f10362b
            com.airbnb.lottie.i r0 = (com.airbnb.lottie.i) r0
            v0.f<java.lang.String, com.airbnb.lottie.i> r3 = r3.f10363a
            r3.put(r2, r0)
        L_0x0164:
            return r1
        L_0x0165:
            if (r4 == 0) goto L_0x016f
            r4.close()     // Catch:{ IOException -> 0x016b }
            goto L_0x016f
        L_0x016b:
            r2 = move-exception
            n4.c.c(r0, r2)
        L_0x016f:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p3.p.call():java.lang.Object");
    }
}
