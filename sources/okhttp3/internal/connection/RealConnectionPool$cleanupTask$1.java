package okhttp3.internal.connection;

import okhttp3.internal.concurrent.Task;

/* compiled from: RealConnectionPool.kt */
public final class RealConnectionPool$cleanupTask$1 extends Task {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ RealConnectionPool f22297e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RealConnectionPool$cleanupTask$1(RealConnectionPool realConnectionPool, String str) {
        super(str, true);
        this.f22297e = realConnectionPool;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0079, code lost:
        r1 = r6.f22273d;
        sk.j.c(r1);
        okhttp3.internal.Util.d(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0087, code lost:
        if (r0.f22296e.isEmpty() == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0089, code lost:
        r0.f22294c.a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:?, code lost:
        return 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:?, code lost:
        return 0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long a() {
        /*
            r13 = this;
            okhttp3.internal.connection.RealConnectionPool r0 = r13.f22297e
            long r1 = java.lang.System.nanoTime()
            java.util.concurrent.ConcurrentLinkedQueue<okhttp3.internal.connection.RealConnection> r3 = r0.f22296e
            java.util.Iterator r3 = r3.iterator()
            r4 = 0
            r5 = 0
            r6 = -9223372036854775808
            r7 = r6
            r6 = r5
            r5 = r4
        L_0x0013:
            boolean r9 = r3.hasNext()
            if (r9 == 0) goto L_0x0041
            java.lang.Object r9 = r3.next()
            okhttp3.internal.connection.RealConnection r9 = (okhttp3.internal.connection.RealConnection) r9
            java.lang.String r10 = "connection"
            sk.j.e(r9, r10)
            monitor-enter(r9)
            int r10 = r0.b(r9, r1)     // Catch:{ all -> 0x003e }
            if (r10 <= 0) goto L_0x002e
            int r5 = r5 + 1
            goto L_0x003c
        L_0x002e:
            int r4 = r4 + 1
            long r10 = r9.f22286q     // Catch:{ all -> 0x003e }
            long r10 = r1 - r10
            int r12 = (r10 > r7 ? 1 : (r10 == r7 ? 0 : -1))
            if (r12 <= 0) goto L_0x003a
            r6 = r9
            r7 = r10
        L_0x003a:
            ek.i r10 = ek.i.f20112a     // Catch:{ all -> 0x003e }
        L_0x003c:
            monitor-exit(r9)
            goto L_0x0013
        L_0x003e:
            r0 = move-exception
            monitor-exit(r9)
            throw r0
        L_0x0041:
            long r9 = r0.f22293b
            int r3 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r3 >= 0) goto L_0x0056
            int r3 = r0.f22292a
            if (r4 <= r3) goto L_0x004c
            goto L_0x0056
        L_0x004c:
            if (r4 <= 0) goto L_0x0050
            long r9 = r9 - r7
            goto L_0x008e
        L_0x0050:
            if (r5 <= 0) goto L_0x0053
            goto L_0x008e
        L_0x0053:
            r9 = -1
            goto L_0x008e
        L_0x0056:
            sk.j.c(r6)
            monitor-enter(r6)
            java.util.ArrayList r3 = r6.f22285p     // Catch:{ all -> 0x008f }
            boolean r3 = r3.isEmpty()     // Catch:{ all -> 0x008f }
            r4 = 1
            r3 = r3 ^ r4
            r9 = 0
            if (r3 == 0) goto L_0x0068
            monitor-exit(r6)
            goto L_0x008e
        L_0x0068:
            long r11 = r6.f22286q     // Catch:{ all -> 0x008f }
            long r11 = r11 + r7
            int r1 = (r11 > r1 ? 1 : (r11 == r1 ? 0 : -1))
            if (r1 == 0) goto L_0x0071
            monitor-exit(r6)
            goto L_0x008e
        L_0x0071:
            r6.f22279j = r4     // Catch:{ all -> 0x008f }
            java.util.concurrent.ConcurrentLinkedQueue<okhttp3.internal.connection.RealConnection> r1 = r0.f22296e     // Catch:{ all -> 0x008f }
            r1.remove(r6)     // Catch:{ all -> 0x008f }
            monitor-exit(r6)
            java.net.Socket r1 = r6.f22273d
            sk.j.c(r1)
            okhttp3.internal.Util.d(r1)
            java.util.concurrent.ConcurrentLinkedQueue<okhttp3.internal.connection.RealConnection> r1 = r0.f22296e
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L_0x008e
            okhttp3.internal.concurrent.TaskQueue r0 = r0.f22294c
            r0.a()
        L_0x008e:
            return r9
        L_0x008f:
            r0 = move-exception
            monitor-exit(r6)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.connection.RealConnectionPool$cleanupTask$1.a():long");
    }
}
