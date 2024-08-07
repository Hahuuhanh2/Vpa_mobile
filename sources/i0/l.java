package i0;

import v8.a;

/* compiled from: ListFuture */
public final class l implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f10916a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ a f10917b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ m f10918c;

    public l(m mVar, int i10, a aVar) {
        this.f10918c = mVar;
        this.f10916a = i10;
        this.f10917b = aVar;
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:52:0x00b6 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r10 = this;
            i0.m r0 = r10.f10918c
            int r1 = r10.f10916a
            v8.a r2 = r10.f10917b
            java.lang.String r3 = "Less than 0 remaining futures"
            java.util.ArrayList r4 = r0.f10920b
            boolean r5 = r0.isDone()
            if (r5 != 0) goto L_0x0109
            if (r4 != 0) goto L_0x0014
            goto L_0x0109
        L_0x0014:
            r5 = 0
            r6 = 1
            r7 = 0
            boolean r8 = r2.isDone()     // Catch:{ CancellationException -> 0x00b6, ExecutionException -> 0x008d, RuntimeException -> 0x0068, Error -> 0x0046 }
            java.lang.String r9 = "Tried to set value from future which is not done"
            al.g0.E(r9, r8)     // Catch:{ CancellationException -> 0x00b6, ExecutionException -> 0x008d, RuntimeException -> 0x0068, Error -> 0x0046 }
            java.lang.Object r2 = i0.f.b(r2)     // Catch:{ CancellationException -> 0x00b6, ExecutionException -> 0x008d, RuntimeException -> 0x0068, Error -> 0x0046 }
            r4.set(r1, r2)     // Catch:{ CancellationException -> 0x00b6, ExecutionException -> 0x008d, RuntimeException -> 0x0068, Error -> 0x0046 }
            java.util.concurrent.atomic.AtomicInteger r1 = r0.f10922d
            int r1 = r1.decrementAndGet()
            if (r1 < 0) goto L_0x0030
            goto L_0x0031
        L_0x0030:
            r6 = r7
        L_0x0031:
            al.g0.E(r3, r6)
            if (r1 != 0) goto L_0x0110
            java.util.ArrayList r1 = r0.f10920b
            if (r1 == 0) goto L_0x00db
            z0.b$a<java.util.List<V>> r0 = r0.f10924f
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>(r1)
            goto L_0x00d7
        L_0x0043:
            r1 = move-exception
            goto L_0x00e3
        L_0x0046:
            r1 = move-exception
            z0.b$a<java.util.List<V>> r2 = r0.f10924f     // Catch:{ all -> 0x0043 }
            r2.b(r1)     // Catch:{ all -> 0x0043 }
            java.util.concurrent.atomic.AtomicInteger r1 = r0.f10922d
            int r1 = r1.decrementAndGet()
            if (r1 < 0) goto L_0x0055
            goto L_0x0056
        L_0x0055:
            r6 = r7
        L_0x0056:
            al.g0.E(r3, r6)
            if (r1 != 0) goto L_0x0110
            java.util.ArrayList r1 = r0.f10920b
            if (r1 == 0) goto L_0x00db
            z0.b$a<java.util.List<V>> r0 = r0.f10924f
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>(r1)
            goto L_0x00d7
        L_0x0068:
            r1 = move-exception
            boolean r2 = r0.f10921c     // Catch:{ all -> 0x0043 }
            if (r2 == 0) goto L_0x0072
            z0.b$a<java.util.List<V>> r2 = r0.f10924f     // Catch:{ all -> 0x0043 }
            r2.b(r1)     // Catch:{ all -> 0x0043 }
        L_0x0072:
            java.util.concurrent.atomic.AtomicInteger r1 = r0.f10922d
            int r1 = r1.decrementAndGet()
            if (r1 < 0) goto L_0x007b
            goto L_0x007c
        L_0x007b:
            r6 = r7
        L_0x007c:
            al.g0.E(r3, r6)
            if (r1 != 0) goto L_0x0110
            java.util.ArrayList r1 = r0.f10920b
            if (r1 == 0) goto L_0x00db
            z0.b$a<java.util.List<V>> r0 = r0.f10924f
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>(r1)
            goto L_0x00d7
        L_0x008d:
            r1 = move-exception
            boolean r2 = r0.f10921c     // Catch:{ all -> 0x0043 }
            if (r2 == 0) goto L_0x009b
            z0.b$a<java.util.List<V>> r2 = r0.f10924f     // Catch:{ all -> 0x0043 }
            java.lang.Throwable r1 = r1.getCause()     // Catch:{ all -> 0x0043 }
            r2.b(r1)     // Catch:{ all -> 0x0043 }
        L_0x009b:
            java.util.concurrent.atomic.AtomicInteger r1 = r0.f10922d
            int r1 = r1.decrementAndGet()
            if (r1 < 0) goto L_0x00a4
            goto L_0x00a5
        L_0x00a4:
            r6 = r7
        L_0x00a5:
            al.g0.E(r3, r6)
            if (r1 != 0) goto L_0x0110
            java.util.ArrayList r1 = r0.f10920b
            if (r1 == 0) goto L_0x00db
            z0.b$a<java.util.List<V>> r0 = r0.f10924f
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>(r1)
            goto L_0x00d7
        L_0x00b6:
            boolean r1 = r0.f10921c     // Catch:{ all -> 0x0043 }
            if (r1 == 0) goto L_0x00bd
            r0.cancel(r7)     // Catch:{ all -> 0x0043 }
        L_0x00bd:
            java.util.concurrent.atomic.AtomicInteger r1 = r0.f10922d
            int r1 = r1.decrementAndGet()
            if (r1 < 0) goto L_0x00c6
            goto L_0x00c7
        L_0x00c6:
            r6 = r7
        L_0x00c7:
            al.g0.E(r3, r6)
            if (r1 != 0) goto L_0x0110
            java.util.ArrayList r1 = r0.f10920b
            if (r1 == 0) goto L_0x00db
            z0.b$a<java.util.List<V>> r0 = r0.f10924f
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>(r1)
        L_0x00d7:
            r0.a(r2)
            goto L_0x0110
        L_0x00db:
            boolean r0 = r0.isDone()
            al.g0.E(r5, r0)
            goto L_0x0110
        L_0x00e3:
            java.util.concurrent.atomic.AtomicInteger r2 = r0.f10922d
            int r2 = r2.decrementAndGet()
            if (r2 < 0) goto L_0x00ec
            goto L_0x00ed
        L_0x00ec:
            r6 = r7
        L_0x00ed:
            al.g0.E(r3, r6)
            if (r2 != 0) goto L_0x0108
            java.util.ArrayList r2 = r0.f10920b
            if (r2 == 0) goto L_0x0101
            z0.b$a<java.util.List<V>> r0 = r0.f10924f
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>(r2)
            r0.a(r3)
            goto L_0x0108
        L_0x0101:
            boolean r0 = r0.isDone()
            al.g0.E(r5, r0)
        L_0x0108:
            throw r1
        L_0x0109:
            boolean r0 = r0.f10921c
            java.lang.String r1 = "Future was done before all dependencies completed"
            al.g0.E(r1, r0)
        L_0x0110:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: i0.l.run():void");
    }
}
