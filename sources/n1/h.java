package n1;

import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Build;
import m1.e;
import p3.l0;
import v0.f;

/* compiled from: TypefaceCompat */
public final class h {

    /* renamed from: a  reason: collision with root package name */
    public static final o f13434a;

    /* renamed from: b  reason: collision with root package name */
    public static final f<String, Typeface> f13435b = new f<>(16);

    /* compiled from: TypefaceCompat */
    public static class a extends l0 {
        public e.C0160e E;

        public a(e.C0160e eVar) {
            this.E = eVar;
        }
    }

    static {
        boolean z10;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 29) {
            f13434a = new m();
        } else if (i10 >= 28) {
            f13434a = new l();
        } else if (i10 >= 26) {
            f13434a = new k();
        } else {
            if (i10 >= 24) {
                if (j.f13443c != null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    f13434a = new j();
                }
            }
            f13434a = new i();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0024, code lost:
        if (r0.equals(r4) == false) goto L_0x0028;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.graphics.Typeface a(android.content.Context r7, m1.c.b r8, android.content.res.Resources r9, int r10, java.lang.String r11, int r12, int r13, m1.e.C0160e r14, boolean r15) {
        /*
            boolean r0 = r8 instanceof m1.c.e
            r1 = -3
            if (r0 == 0) goto L_0x0149
            m1.c$e r8 = (m1.c.e) r8
            java.lang.String r0 = r8.f13059d
            r2 = 0
            r3 = 0
            if (r0 == 0) goto L_0x0027
            boolean r4 = r0.isEmpty()
            if (r4 == 0) goto L_0x0014
            goto L_0x0027
        L_0x0014:
            android.graphics.Typeface r0 = android.graphics.Typeface.create(r0, r3)
            android.graphics.Typeface r4 = android.graphics.Typeface.DEFAULT
            android.graphics.Typeface r4 = android.graphics.Typeface.create(r4, r3)
            if (r0 == 0) goto L_0x0027
            boolean r4 = r0.equals(r4)
            if (r4 != 0) goto L_0x0027
            goto L_0x0028
        L_0x0027:
            r0 = r2
        L_0x0028:
            if (r0 == 0) goto L_0x0030
            if (r14 == 0) goto L_0x002f
            r14.b(r0)
        L_0x002f:
            return r0
        L_0x0030:
            r0 = 1
            if (r15 == 0) goto L_0x0038
            int r4 = r8.f13058c
            if (r4 != 0) goto L_0x003b
            goto L_0x003a
        L_0x0038:
            if (r14 != 0) goto L_0x003b
        L_0x003a:
            r3 = r0
        L_0x003b:
            r0 = -1
            if (r15 == 0) goto L_0x0041
            int r15 = r8.f13057b
            goto L_0x0042
        L_0x0041:
            r15 = r0
        L_0x0042:
            android.os.Handler r4 = new android.os.Handler
            android.os.Looper r5 = android.os.Looper.getMainLooper()
            r4.<init>(r5)
            n1.h$a r5 = new n1.h$a
            r5.<init>(r14)
            t1.f r8 = r8.f13056a
            t1.c r14 = new t1.c
            r14.<init>(r5, r4)
            if (r3 == 0) goto L_0x00cd
            v0.f<java.lang.String, android.graphics.Typeface> r3 = t1.k.f14778a
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r6 = r8.f14767e
            r3.append(r6)
            java.lang.String r6 = "-"
            r3.append(r6)
            r3.append(r13)
            java.lang.String r3 = r3.toString()
            v0.f<java.lang.String, android.graphics.Typeface> r6 = t1.k.f14778a
            java.lang.Object r6 = r6.get(r3)
            android.graphics.Typeface r6 = (android.graphics.Typeface) r6
            if (r6 == 0) goto L_0x0086
            t1.a r7 = new t1.a
            r7.<init>(r5, r6)
            r4.post(r7)
            r2 = r6
            goto L_0x015c
        L_0x0086:
            if (r15 != r0) goto L_0x0093
            t1.k$a r7 = t1.k.a(r3, r7, r8, r13)
            r14.a(r7)
            android.graphics.Typeface r2 = r7.f14782a
            goto L_0x015c
        L_0x0093:
            t1.g r0 = new t1.g
            r0.<init>(r3, r7, r8, r13)
            java.util.concurrent.ThreadPoolExecutor r7 = t1.k.f14779b     // Catch:{ InterruptedException -> 0x00bf }
            java.util.concurrent.Future r7 = r7.submit(r0)     // Catch:{ InterruptedException -> 0x00bf }
            long r3 = (long) r15
            java.util.concurrent.TimeUnit r8 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ ExecutionException -> 0x00b8, InterruptedException -> 0x00b6, TimeoutException -> 0x00ae }
            java.lang.Object r7 = r7.get(r3, r8)     // Catch:{ ExecutionException -> 0x00b8, InterruptedException -> 0x00b6, TimeoutException -> 0x00ae }
            t1.k$a r7 = (t1.k.a) r7     // Catch:{ InterruptedException -> 0x00bf }
            r14.a(r7)     // Catch:{ InterruptedException -> 0x00bf }
            android.graphics.Typeface r2 = r7.f14782a     // Catch:{ InterruptedException -> 0x00bf }
            goto L_0x015c
        L_0x00ae:
            java.lang.InterruptedException r7 = new java.lang.InterruptedException     // Catch:{ InterruptedException -> 0x00bf }
            java.lang.String r8 = "timeout"
            r7.<init>(r8)     // Catch:{ InterruptedException -> 0x00bf }
            throw r7     // Catch:{ InterruptedException -> 0x00bf }
        L_0x00b6:
            r7 = move-exception
            throw r7     // Catch:{ InterruptedException -> 0x00bf }
        L_0x00b8:
            r7 = move-exception
            java.lang.RuntimeException r8 = new java.lang.RuntimeException     // Catch:{ InterruptedException -> 0x00bf }
            r8.<init>(r7)     // Catch:{ InterruptedException -> 0x00bf }
            throw r8     // Catch:{ InterruptedException -> 0x00bf }
        L_0x00bf:
            p3.l0 r7 = r14.f14759a
            android.os.Handler r8 = r14.f14760b
            t1.b r14 = new t1.b
            r14.<init>(r7, r1)
            r8.post(r14)
            goto L_0x015c
        L_0x00cd:
            v0.f<java.lang.String, android.graphics.Typeface> r15 = t1.k.f14778a
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            r15.<init>()
            java.lang.String r0 = r8.f14767e
            r15.append(r0)
            java.lang.String r0 = "-"
            r15.append(r0)
            r15.append(r13)
            java.lang.String r15 = r15.toString()
            v0.f<java.lang.String, android.graphics.Typeface> r0 = t1.k.f14778a
            java.lang.Object r0 = r0.get(r15)
            android.graphics.Typeface r0 = (android.graphics.Typeface) r0
            if (r0 == 0) goto L_0x00f9
            t1.a r7 = new t1.a
            r7.<init>(r5, r0)
            r4.post(r7)
            r2 = r0
            goto L_0x015c
        L_0x00f9:
            t1.h r0 = new t1.h
            r0.<init>(r14)
            java.lang.Object r3 = t1.k.f14780c
            monitor-enter(r3)
            v0.h<java.lang.String, java.util.ArrayList<v1.a<t1.k$a>>> r14 = t1.k.f14781d     // Catch:{ all -> 0x0146 }
            java.lang.Object r1 = r14.getOrDefault(r15, r2)     // Catch:{ all -> 0x0146 }
            java.util.ArrayList r1 = (java.util.ArrayList) r1     // Catch:{ all -> 0x0146 }
            if (r1 == 0) goto L_0x0110
            r1.add(r0)     // Catch:{ all -> 0x0146 }
            monitor-exit(r3)     // Catch:{ all -> 0x0146 }
            goto L_0x015c
        L_0x0110:
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch:{ all -> 0x0146 }
            r1.<init>()     // Catch:{ all -> 0x0146 }
            r1.add(r0)     // Catch:{ all -> 0x0146 }
            r14.put(r15, r1)     // Catch:{ all -> 0x0146 }
            monitor-exit(r3)     // Catch:{ all -> 0x0146 }
            t1.i r14 = new t1.i
            r14.<init>(r15, r7, r8, r13)
            java.util.concurrent.ThreadPoolExecutor r7 = t1.k.f14779b
            t1.j r8 = new t1.j
            r8.<init>(r15)
            android.os.Looper r15 = android.os.Looper.myLooper()
            if (r15 != 0) goto L_0x0138
            android.os.Handler r15 = new android.os.Handler
            android.os.Looper r0 = android.os.Looper.getMainLooper()
            r15.<init>(r0)
            goto L_0x013d
        L_0x0138:
            android.os.Handler r15 = new android.os.Handler
            r15.<init>()
        L_0x013d:
            t1.o r0 = new t1.o
            r0.<init>(r15, r14, r8)
            r7.execute(r0)
            goto L_0x015c
        L_0x0146:
            r7 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0146 }
            throw r7
        L_0x0149:
            n1.o r15 = f13434a
            m1.c$c r8 = (m1.c.C0159c) r8
            android.graphics.Typeface r2 = r15.a(r7, r8, r9, r13)
            if (r14 == 0) goto L_0x015c
            if (r2 == 0) goto L_0x0159
            r14.b(r2)
            goto L_0x015c
        L_0x0159:
            r14.a(r1)
        L_0x015c:
            if (r2 == 0) goto L_0x0167
            v0.f<java.lang.String, android.graphics.Typeface> r7 = f13435b
            java.lang.String r8 = b(r9, r10, r11, r12, r13)
            r7.put(r8, r2)
        L_0x0167:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: n1.h.a(android.content.Context, m1.c$b, android.content.res.Resources, int, java.lang.String, int, int, m1.e$e, boolean):android.graphics.Typeface");
    }

    public static String b(Resources resources, int i10, String str, int i11, int i12) {
        return resources.getResourcePackageName(i10) + '-' + str + '-' + i11 + '-' + i10 + '-' + i12;
    }
}
