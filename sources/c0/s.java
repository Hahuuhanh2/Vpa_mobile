package c0;

import android.content.Context;
import java.util.concurrent.Executor;
import z0.b;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class s implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ u f4320a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Context f4321b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Executor f4322c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ b.a f4323d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ long f4324e;

    public /* synthetic */ s(u uVar, Context context, Executor executor, b.a aVar, long j10) {
        this.f4320a = uVar;
        this.f4321b = context;
        this.f4322c = executor;
        this.f4323d = aVar;
        this.f4324e = j10;
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x00c1  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00e9  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r11 = this;
            c0.u r1 = r11.f4320a
            android.content.Context r0 = r11.f4321b
            java.util.concurrent.Executor r2 = r11.f4322c
            z0.b$a r5 = r11.f4323d
            long r3 = r11.f4324e
            r1.getClass()
            r6 = 0
            android.app.Application r7 = g0.d.b(r0)     // Catch:{ CameraIdListIncorrectException -> 0x009a, InitializationException -> 0x0098, RuntimeException -> 0x0096 }
            r1.f4354i = r7     // Catch:{ CameraIdListIncorrectException -> 0x009a, InitializationException -> 0x0098, RuntimeException -> 0x0096 }
            if (r7 != 0) goto L_0x001c
            android.content.Context r0 = g0.d.a(r0)     // Catch:{ CameraIdListIncorrectException -> 0x009a, InitializationException -> 0x0098, RuntimeException -> 0x0096 }
            r1.f4354i = r0     // Catch:{ CameraIdListIncorrectException -> 0x009a, InitializationException -> 0x0098, RuntimeException -> 0x0096 }
        L_0x001c:
            c0.v r0 = r1.f4348c     // Catch:{ CameraIdListIncorrectException -> 0x009a, InitializationException -> 0x0098, RuntimeException -> 0x0096 }
            f0.p$a r0 = r0.L()     // Catch:{ CameraIdListIncorrectException -> 0x009a, InitializationException -> 0x0098, RuntimeException -> 0x0096 }
            if (r0 == 0) goto L_0x00a9
            java.util.concurrent.Executor r7 = r1.f4349d     // Catch:{ CameraIdListIncorrectException -> 0x009a, InitializationException -> 0x0098, RuntimeException -> 0x0096 }
            android.os.Handler r8 = r1.f4350e     // Catch:{ CameraIdListIncorrectException -> 0x009a, InitializationException -> 0x0098, RuntimeException -> 0x0096 }
            f0.a r9 = new f0.a     // Catch:{ CameraIdListIncorrectException -> 0x009a, InitializationException -> 0x0098, RuntimeException -> 0x0096 }
            r9.<init>(r7, r8)     // Catch:{ CameraIdListIncorrectException -> 0x009a, InitializationException -> 0x0098, RuntimeException -> 0x0096 }
            c0.v r7 = r1.f4348c     // Catch:{ CameraIdListIncorrectException -> 0x009a, InitializationException -> 0x0098, RuntimeException -> 0x0096 }
            c0.p r7 = r7.K()     // Catch:{ CameraIdListIncorrectException -> 0x009a, InitializationException -> 0x0098, RuntimeException -> 0x0096 }
            android.content.Context r8 = r1.f4354i     // Catch:{ CameraIdListIncorrectException -> 0x009a, InitializationException -> 0x0098, RuntimeException -> 0x0096 }
            v.p r0 = r0.a(r8, r9, r7)     // Catch:{ CameraIdListIncorrectException -> 0x009a, InitializationException -> 0x0098, RuntimeException -> 0x0096 }
            r1.f4351f = r0     // Catch:{ CameraIdListIncorrectException -> 0x009a, InitializationException -> 0x0098, RuntimeException -> 0x0096 }
            c0.v r0 = r1.f4348c     // Catch:{ CameraIdListIncorrectException -> 0x009a, InitializationException -> 0x0098, RuntimeException -> 0x0096 }
            f0.o$a r0 = r0.M()     // Catch:{ CameraIdListIncorrectException -> 0x009a, InitializationException -> 0x0098, RuntimeException -> 0x0096 }
            if (r0 == 0) goto L_0x009c
            android.content.Context r8 = r1.f4354i     // Catch:{ CameraIdListIncorrectException -> 0x009a, InitializationException -> 0x0098, RuntimeException -> 0x0096 }
            f0.p r9 = r1.f4351f     // Catch:{ CameraIdListIncorrectException -> 0x009a, InitializationException -> 0x0098, RuntimeException -> 0x0096 }
            w.z r9 = r9.b()     // Catch:{ CameraIdListIncorrectException -> 0x009a, InitializationException -> 0x0098, RuntimeException -> 0x0096 }
            f0.p r10 = r1.f4351f     // Catch:{ CameraIdListIncorrectException -> 0x009a, InitializationException -> 0x0098, RuntimeException -> 0x0096 }
            java.util.LinkedHashSet r10 = r10.a()     // Catch:{ CameraIdListIncorrectException -> 0x009a, InitializationException -> 0x0098, RuntimeException -> 0x0096 }
            v.j0 r0 = r0.a(r8, r9, r10)     // Catch:{ CameraIdListIncorrectException -> 0x009a, InitializationException -> 0x0098, RuntimeException -> 0x0096 }
            r1.f4352g = r0     // Catch:{ CameraIdListIncorrectException -> 0x009a, InitializationException -> 0x0098, RuntimeException -> 0x0096 }
            c0.v r0 = r1.f4348c     // Catch:{ CameraIdListIncorrectException -> 0x009a, InitializationException -> 0x0098, RuntimeException -> 0x0096 }
            androidx.camera.core.impl.y$c r0 = r0.N()     // Catch:{ CameraIdListIncorrectException -> 0x009a, InitializationException -> 0x0098, RuntimeException -> 0x0096 }
            if (r0 == 0) goto L_0x0089
            android.content.Context r8 = r1.f4354i     // Catch:{ CameraIdListIncorrectException -> 0x009a, InitializationException -> 0x0098, RuntimeException -> 0x0096 }
            v.m0 r0 = r0.a(r8)     // Catch:{ CameraIdListIncorrectException -> 0x009a, InitializationException -> 0x0098, RuntimeException -> 0x0096 }
            r1.f4353h = r0     // Catch:{ CameraIdListIncorrectException -> 0x009a, InitializationException -> 0x0098, RuntimeException -> 0x0096 }
            boolean r0 = r2 instanceof c0.m     // Catch:{ CameraIdListIncorrectException -> 0x009a, InitializationException -> 0x0098, RuntimeException -> 0x0096 }
            if (r0 == 0) goto L_0x0073
            r0 = r2
            c0.m r0 = (c0.m) r0     // Catch:{ CameraIdListIncorrectException -> 0x009a, InitializationException -> 0x0098, RuntimeException -> 0x0096 }
            f0.p r8 = r1.f4351f     // Catch:{ CameraIdListIncorrectException -> 0x009a, InitializationException -> 0x0098, RuntimeException -> 0x0096 }
            r0.a(r8)     // Catch:{ CameraIdListIncorrectException -> 0x009a, InitializationException -> 0x0098, RuntimeException -> 0x0096 }
        L_0x0073:
            f0.s r0 = r1.f4346a     // Catch:{ CameraIdListIncorrectException -> 0x009a, InitializationException -> 0x0098, RuntimeException -> 0x0096 }
            f0.p r8 = r1.f4351f     // Catch:{ CameraIdListIncorrectException -> 0x009a, InitializationException -> 0x0098, RuntimeException -> 0x0096 }
            r0.b(r8)     // Catch:{ CameraIdListIncorrectException -> 0x009a, InitializationException -> 0x0098, RuntimeException -> 0x0096 }
            android.content.Context r0 = r1.f4354i     // Catch:{ CameraIdListIncorrectException -> 0x009a, InitializationException -> 0x0098, RuntimeException -> 0x0096 }
            f0.s r8 = r1.f4346a     // Catch:{ CameraIdListIncorrectException -> 0x009a, InitializationException -> 0x0098, RuntimeException -> 0x0096 }
            androidx.camera.core.impl.CameraValidator.a(r0, r8, r7)     // Catch:{ CameraIdListIncorrectException -> 0x009a, InitializationException -> 0x0098, RuntimeException -> 0x0096 }
            r1.b()     // Catch:{ CameraIdListIncorrectException -> 0x009a, InitializationException -> 0x0098, RuntimeException -> 0x0096 }
            r5.a(r6)     // Catch:{ CameraIdListIncorrectException -> 0x009a, InitializationException -> 0x0098, RuntimeException -> 0x0096 }
            goto L_0x010d
        L_0x0089:
            androidx.camera.core.InitializationException r0 = new androidx.camera.core.InitializationException     // Catch:{ CameraIdListIncorrectException -> 0x009a, InitializationException -> 0x0098, RuntimeException -> 0x0096 }
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException     // Catch:{ CameraIdListIncorrectException -> 0x009a, InitializationException -> 0x0098, RuntimeException -> 0x0096 }
            java.lang.String r8 = "Invalid app configuration provided. Missing UseCaseConfigFactory."
            r7.<init>(r8)     // Catch:{ CameraIdListIncorrectException -> 0x009a, InitializationException -> 0x0098, RuntimeException -> 0x0096 }
            r0.<init>(r7)     // Catch:{ CameraIdListIncorrectException -> 0x009a, InitializationException -> 0x0098, RuntimeException -> 0x0096 }
            throw r0     // Catch:{ CameraIdListIncorrectException -> 0x009a, InitializationException -> 0x0098, RuntimeException -> 0x0096 }
        L_0x0096:
            r0 = move-exception
            goto L_0x00b6
        L_0x0098:
            r0 = move-exception
            goto L_0x00b6
        L_0x009a:
            r0 = move-exception
            goto L_0x00b6
        L_0x009c:
            androidx.camera.core.InitializationException r0 = new androidx.camera.core.InitializationException     // Catch:{ CameraIdListIncorrectException -> 0x009a, InitializationException -> 0x0098, RuntimeException -> 0x0096 }
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException     // Catch:{ CameraIdListIncorrectException -> 0x009a, InitializationException -> 0x0098, RuntimeException -> 0x0096 }
            java.lang.String r8 = "Invalid app configuration provided. Missing CameraDeviceSurfaceManager."
            r7.<init>(r8)     // Catch:{ CameraIdListIncorrectException -> 0x009a, InitializationException -> 0x0098, RuntimeException -> 0x0096 }
            r0.<init>(r7)     // Catch:{ CameraIdListIncorrectException -> 0x009a, InitializationException -> 0x0098, RuntimeException -> 0x0096 }
            throw r0     // Catch:{ CameraIdListIncorrectException -> 0x009a, InitializationException -> 0x0098, RuntimeException -> 0x0096 }
        L_0x00a9:
            androidx.camera.core.InitializationException r0 = new androidx.camera.core.InitializationException     // Catch:{ CameraIdListIncorrectException -> 0x009a, InitializationException -> 0x0098, RuntimeException -> 0x0096 }
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException     // Catch:{ CameraIdListIncorrectException -> 0x009a, InitializationException -> 0x0098, RuntimeException -> 0x0096 }
            java.lang.String r8 = "Invalid app configuration provided. Missing CameraFactory."
            r7.<init>(r8)     // Catch:{ CameraIdListIncorrectException -> 0x009a, InitializationException -> 0x0098, RuntimeException -> 0x0096 }
            r0.<init>(r7)     // Catch:{ CameraIdListIncorrectException -> 0x009a, InitializationException -> 0x0098, RuntimeException -> 0x0096 }
            throw r0     // Catch:{ CameraIdListIncorrectException -> 0x009a, InitializationException -> 0x0098, RuntimeException -> 0x0096 }
        L_0x00b6:
            long r7 = android.os.SystemClock.elapsedRealtime()
            long r7 = r7 - r3
            r9 = 2500(0x9c4, double:1.235E-320)
            int r7 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r7 >= 0) goto L_0x00e9
            java.lang.String r0 = "CameraX"
            android.os.SystemClock.elapsedRealtime()
            c0.p0.h(r0)
            android.os.Handler r6 = r1.f4350e
            c0.t r7 = new c0.t
            r0 = r7
            r0.<init>((c0.u) r1, (java.util.concurrent.Executor) r2, (long) r3, (z0.b.a) r5)
            java.lang.String r0 = "retry_token"
            r1 = 500(0x1f4, double:2.47E-321)
            int r3 = android.os.Build.VERSION.SDK_INT
            r4 = 28
            if (r3 < r4) goto L_0x00df
            boolean unused = r6.postDelayed(r7, "retry_token", 500)
            goto L_0x010d
        L_0x00df:
            android.os.Message r3 = android.os.Message.obtain(r6, r7)
            r3.obj = r0
            r6.sendMessageDelayed(r3, r1)
            goto L_0x010d
        L_0x00e9:
            java.lang.Object r2 = r1.f4347b
            monitor-enter(r2)
            r3 = 3
            r1.f4356k = r3     // Catch:{ all -> 0x010e }
            monitor-exit(r2)     // Catch:{ all -> 0x010e }
            boolean r1 = r0 instanceof androidx.camera.core.impl.CameraValidator.CameraIdListIncorrectException
            if (r1 == 0) goto L_0x00fd
            java.lang.String r0 = "CameraX"
            c0.p0.b(r0)
            r5.a(r6)
            goto L_0x010d
        L_0x00fd:
            boolean r1 = r0 instanceof androidx.camera.core.InitializationException
            if (r1 == 0) goto L_0x0105
            r5.b(r0)
            goto L_0x010d
        L_0x0105:
            androidx.camera.core.InitializationException r1 = new androidx.camera.core.InitializationException
            r1.<init>(r0)
            r5.b(r1)
        L_0x010d:
            return
        L_0x010e:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x010e }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: c0.s.run():void");
    }
}
