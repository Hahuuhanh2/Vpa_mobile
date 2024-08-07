package l6;

import f6.j;
import f6.s;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class f implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ j f12729a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ s f12730b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ int f12731c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ Runnable f12732d;

    public /* synthetic */ f(j jVar, j jVar2, int i10, Runnable runnable) {
        this.f12729a = jVar;
        this.f12730b = jVar2;
        this.f12731c = i10;
        this.f12732d = runnable;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(2:12|13) */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0046, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
        r0.f12746d.a(r1, r2 + 1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0052, code lost:
        r3.run();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0055, code lost:
        throw r0;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:12:0x0048 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r9 = this;
            l6.j r0 = r9.f12729a
            f6.s r1 = r9.f12730b
            int r2 = r9.f12731c
            java.lang.Runnable r3 = r9.f12732d
            r0.getClass()
            r4 = 1
            n6.a r5 = r0.f12748f     // Catch:{ SynchronizationException -> 0x0048 }
            m6.d r6 = r0.f12745c     // Catch:{ SynchronizationException -> 0x0048 }
            java.util.Objects.requireNonNull(r6)     // Catch:{ SynchronizationException -> 0x0048 }
            c0.q0 r7 = new c0.q0     // Catch:{ SynchronizationException -> 0x0048 }
            r8 = 5
            r7.<init>(r6, r8)     // Catch:{ SynchronizationException -> 0x0048 }
            r5.h(r7)     // Catch:{ SynchronizationException -> 0x0048 }
            android.content.Context r5 = r0.f12743a     // Catch:{ SynchronizationException -> 0x0048 }
            java.lang.String r6 = "connectivity"
            java.lang.Object r5 = r5.getSystemService(r6)     // Catch:{ SynchronizationException -> 0x0048 }
            android.net.ConnectivityManager r5 = (android.net.ConnectivityManager) r5     // Catch:{ SynchronizationException -> 0x0048 }
            android.net.NetworkInfo r5 = r5.getActiveNetworkInfo()     // Catch:{ SynchronizationException -> 0x0048 }
            if (r5 == 0) goto L_0x0034
            boolean r5 = r5.isConnected()     // Catch:{ SynchronizationException -> 0x0048 }
            if (r5 == 0) goto L_0x0034
            r5 = r4
            goto L_0x0035
        L_0x0034:
            r5 = 0
        L_0x0035:
            if (r5 != 0) goto L_0x0042
            n6.a r5 = r0.f12748f     // Catch:{ SynchronizationException -> 0x0048 }
            l6.g r6 = new l6.g     // Catch:{ SynchronizationException -> 0x0048 }
            r6.<init>(r0, r1, r2)     // Catch:{ SynchronizationException -> 0x0048 }
            r5.h(r6)     // Catch:{ SynchronizationException -> 0x0048 }
            goto L_0x004e
        L_0x0042:
            r0.a(r1, r2)     // Catch:{ SynchronizationException -> 0x0048 }
            goto L_0x004e
        L_0x0046:
            r0 = move-exception
            goto L_0x0052
        L_0x0048:
            l6.n r0 = r0.f12746d     // Catch:{ all -> 0x0046 }
            int r2 = r2 + r4
            r0.a(r1, r2)     // Catch:{ all -> 0x0046 }
        L_0x004e:
            r3.run()
            return
        L_0x0052:
            r3.run()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: l6.f.run():void");
    }
}
