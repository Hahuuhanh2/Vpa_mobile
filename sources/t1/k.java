package t1;

import android.annotation.SuppressLint;
import android.graphics.Typeface;
import java.util.ArrayList;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import v0.f;
import v0.h;

/* compiled from: FontRequestWorker */
public final class k {

    /* renamed from: a  reason: collision with root package name */
    public static final f<String, Typeface> f14778a = new f<>(16);

    /* renamed from: b  reason: collision with root package name */
    public static final ThreadPoolExecutor f14779b;

    /* renamed from: c  reason: collision with root package name */
    public static final Object f14780c = new Object();

    /* renamed from: d  reason: collision with root package name */
    public static final h<String, ArrayList<v1.a<a>>> f14781d = new h<>();

    static {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, (long) 10000, TimeUnit.MILLISECONDS, new LinkedBlockingDeque(), new n());
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        f14779b = threadPoolExecutor;
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x003f  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0045  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static t1.k.a a(java.lang.String r6, android.content.Context r7, t1.f r8, int r9) {
        /*
            v0.f<java.lang.String, android.graphics.Typeface> r0 = f14778a
            java.lang.Object r0 = r0.get(r6)
            android.graphics.Typeface r0 = (android.graphics.Typeface) r0
            if (r0 == 0) goto L_0x0010
            t1.k$a r6 = new t1.k$a
            r6.<init>((android.graphics.Typeface) r0)
            return r6
        L_0x0010:
            t1.l r8 = t1.e.a(r7, r8)     // Catch:{ NameNotFoundException -> 0x0060 }
            int r0 = r8.f14784a
            r1 = -3
            r2 = 1
            if (r0 == 0) goto L_0x001f
            if (r0 == r2) goto L_0x001d
            goto L_0x0034
        L_0x001d:
            r0 = -2
            goto L_0x003d
        L_0x001f:
            t1.m[] r0 = r8.f14785b
            if (r0 == 0) goto L_0x003c
            int r3 = r0.length
            if (r3 != 0) goto L_0x0027
            goto L_0x003c
        L_0x0027:
            int r2 = r0.length
            r3 = 0
            r4 = r3
        L_0x002a:
            if (r4 >= r2) goto L_0x003b
            r5 = r0[r4]
            int r5 = r5.f14790e
            if (r5 == 0) goto L_0x0038
            if (r5 >= 0) goto L_0x0036
        L_0x0034:
            r0 = r1
            goto L_0x003d
        L_0x0036:
            r0 = r5
            goto L_0x003d
        L_0x0038:
            int r4 = r4 + 1
            goto L_0x002a
        L_0x003b:
            r2 = r3
        L_0x003c:
            r0 = r2
        L_0x003d:
            if (r0 == 0) goto L_0x0045
            t1.k$a r6 = new t1.k$a
            r6.<init>((int) r0)
            return r6
        L_0x0045:
            t1.m[] r8 = r8.f14785b
            n1.o r0 = n1.h.f13434a
            android.graphics.Typeface r7 = r0.b(r7, r8, r9)
            if (r7 == 0) goto L_0x005a
            v0.f<java.lang.String, android.graphics.Typeface> r8 = f14778a
            r8.put(r6, r7)
            t1.k$a r6 = new t1.k$a
            r6.<init>((android.graphics.Typeface) r7)
            return r6
        L_0x005a:
            t1.k$a r6 = new t1.k$a
            r6.<init>((int) r1)
            return r6
        L_0x0060:
            t1.k$a r6 = new t1.k$a
            r7 = -1
            r6.<init>((int) r7)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: t1.k.a(java.lang.String, android.content.Context, t1.f, int):t1.k$a");
    }

    /* compiled from: FontRequestWorker */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final Typeface f14782a;

        /* renamed from: b  reason: collision with root package name */
        public final int f14783b;

        public a(int i10) {
            this.f14782a = null;
            this.f14783b = i10;
        }

        @SuppressLint({"WrongConstant"})
        public a(Typeface typeface) {
            this.f14782a = typeface;
            this.f14783b = 0;
        }
    }
}
