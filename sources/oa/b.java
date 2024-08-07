package oa;

import c6.h;
import com.google.android.gms.tasks.TaskCompletionSource;
import ia.e0;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class b implements h {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ d f13769a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ TaskCompletionSource f13770b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ boolean f13771c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ e0 f13772d;

    public /* synthetic */ b(d dVar, TaskCompletionSource taskCompletionSource, boolean z10, e0 e0Var) {
        this.f13769a = dVar;
        this.f13770b = taskCompletionSource;
        this.f13771c = z10;
        this.f13772d = e0Var;
    }

    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:12:0x0045 */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0053  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(java.lang.Exception r10) {
        /*
            r9 = this;
            oa.d r0 = r9.f13769a
            com.google.android.gms.tasks.TaskCompletionSource r1 = r9.f13770b
            boolean r2 = r9.f13771c
            ia.e0 r3 = r9.f13772d
            r0.getClass()
            if (r10 == 0) goto L_0x0011
            r1.trySetException(r10)
            goto L_0x005e
        L_0x0011:
            if (r2 == 0) goto L_0x005b
            java.util.concurrent.CountDownLatch r10 = new java.util.concurrent.CountDownLatch
            r2 = 1
            r10.<init>(r2)
            java.lang.Thread r4 = new java.lang.Thread
            oa.c r5 = new oa.c
            r6 = 0
            r5.<init>(r6, r0, r10)
            r4.<init>(r5)
            r4.start()
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.SECONDS
            java.util.concurrent.ExecutorService r4 = ia.o0.f11348a
            r4 = 2
            long r4 = r0.toNanos(r4)     // Catch:{ all -> 0x004f }
            long r7 = java.lang.System.nanoTime()     // Catch:{ all -> 0x004f }
            long r7 = r7 + r4
        L_0x0036:
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.NANOSECONDS     // Catch:{ InterruptedException -> 0x0045 }
            r10.await(r4, r0)     // Catch:{ InterruptedException -> 0x0045 }
            if (r6 == 0) goto L_0x005b
            java.lang.Thread r10 = java.lang.Thread.currentThread()
            r10.interrupt()
            goto L_0x005b
        L_0x0045:
            long r4 = java.lang.System.nanoTime()     // Catch:{ all -> 0x004d }
            long r4 = r7 - r4
            r6 = r2
            goto L_0x0036
        L_0x004d:
            r10 = move-exception
            goto L_0x0051
        L_0x004f:
            r10 = move-exception
            r2 = r6
        L_0x0051:
            if (r2 == 0) goto L_0x005a
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r0.interrupt()
        L_0x005a:
            throw r10
        L_0x005b:
            r1.trySetResult(r3)
        L_0x005e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: oa.b.a(java.lang.Exception):void");
    }
}
