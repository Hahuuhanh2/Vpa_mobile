package ia;

import java.lang.Thread;
import java.util.concurrent.atomic.AtomicBoolean;
import pa.e;
import pa.g;

/* compiled from: CrashlyticsUncaughtExceptionHandler */
public final class f0 implements Thread.UncaughtExceptionHandler {

    /* renamed from: a  reason: collision with root package name */
    public final a f11292a;

    /* renamed from: b  reason: collision with root package name */
    public final g f11293b;

    /* renamed from: c  reason: collision with root package name */
    public final Thread.UncaughtExceptionHandler f11294c;

    /* renamed from: d  reason: collision with root package name */
    public final fa.a f11295d;

    /* renamed from: e  reason: collision with root package name */
    public final AtomicBoolean f11296e = new AtomicBoolean(false);

    /* compiled from: CrashlyticsUncaughtExceptionHandler */
    public interface a {
    }

    public f0(o oVar, e eVar, Thread.UncaughtExceptionHandler uncaughtExceptionHandler, fa.a aVar) {
        this.f11292a = oVar;
        this.f11293b = eVar;
        this.f11294c = uncaughtExceptionHandler;
        this.f11295d = aVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0021 A[Catch:{ Exception -> 0x003f, all -> 0x001d }] */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x002b A[Catch:{ Exception -> 0x003f, all -> 0x001d }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void uncaughtException(java.lang.Thread r6, java.lang.Throwable r7) {
        /*
            r5 = this;
            java.util.concurrent.atomic.AtomicBoolean r0 = r5.f11296e
            r1 = 1
            r0.set(r1)
            java.lang.String r0 = "FirebaseCrashlytics"
            r2 = 3
            r3 = 0
            if (r6 != 0) goto L_0x000e
        L_0x000c:
            r1 = r3
            goto L_0x001f
        L_0x000e:
            if (r7 != 0) goto L_0x0011
            goto L_0x000c
        L_0x0011:
            fa.a r4 = r5.f11295d     // Catch:{ Exception -> 0x003f, all -> 0x001d }
            boolean r4 = r4.b()     // Catch:{ Exception -> 0x003f, all -> 0x001d }
            if (r4 == 0) goto L_0x001f
            android.util.Log.isLoggable(r0, r2)     // Catch:{ Exception -> 0x003f, all -> 0x001d }
            goto L_0x000c
        L_0x001d:
            r1 = move-exception
            goto L_0x0030
        L_0x001f:
            if (r1 == 0) goto L_0x002b
            ia.f0$a r1 = r5.f11292a     // Catch:{ Exception -> 0x003f, all -> 0x001d }
            pa.g r4 = r5.f11293b     // Catch:{ Exception -> 0x003f, all -> 0x001d }
            ia.o r1 = (ia.o) r1     // Catch:{ Exception -> 0x003f, all -> 0x001d }
            r1.a(r4, r6, r7)     // Catch:{ Exception -> 0x003f, all -> 0x001d }
            goto L_0x003f
        L_0x002b:
            boolean r1 = android.util.Log.isLoggable(r0, r2)     // Catch:{ Exception -> 0x003f, all -> 0x001d }
            goto L_0x003f
        L_0x0030:
            boolean r0 = android.util.Log.isLoggable(r0, r2)
            java.lang.Thread$UncaughtExceptionHandler r0 = r5.f11294c
            r0.uncaughtException(r6, r7)
            java.util.concurrent.atomic.AtomicBoolean r6 = r5.f11296e
            r6.set(r3)
            throw r1
        L_0x003f:
            boolean r0 = android.util.Log.isLoggable(r0, r2)
            java.lang.Thread$UncaughtExceptionHandler r0 = r5.f11294c
            r0.uncaughtException(r6, r7)
            java.util.concurrent.atomic.AtomicBoolean r6 = r5.f11296e
            r6.set(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ia.f0.uncaughtException(java.lang.Thread, java.lang.Throwable):void");
    }
}
