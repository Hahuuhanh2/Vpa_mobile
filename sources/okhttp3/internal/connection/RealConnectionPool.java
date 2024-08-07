package okhttp3.internal.connection;

import android.support.v4.media.a;
import java.lang.ref.Reference;
import java.util.ArrayList;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.TimeUnit;
import okhttp3.internal.Util;
import okhttp3.internal.concurrent.TaskQueue;
import okhttp3.internal.concurrent.TaskRunner;
import okhttp3.internal.connection.RealCall;
import okhttp3.internal.platform.Platform;
import sk.j;

/* compiled from: RealConnectionPool.kt */
public final class RealConnectionPool {

    /* renamed from: a  reason: collision with root package name */
    public final int f22292a = 5;

    /* renamed from: b  reason: collision with root package name */
    public final long f22293b;

    /* renamed from: c  reason: collision with root package name */
    public final TaskQueue f22294c;

    /* renamed from: d  reason: collision with root package name */
    public final RealConnectionPool$cleanupTask$1 f22295d;

    /* renamed from: e  reason: collision with root package name */
    public final ConcurrentLinkedQueue<RealConnection> f22296e;

    /* compiled from: RealConnectionPool.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(int i10) {
            this();
        }
    }

    static {
        new Companion(0);
    }

    public RealConnectionPool(TaskRunner taskRunner, TimeUnit timeUnit) {
        j.f(taskRunner, "taskRunner");
        this.f22293b = timeUnit.toNanos(5);
        this.f22294c = taskRunner.f();
        this.f22295d = new RealConnectionPool$cleanupTask$1(this, a.o(new StringBuilder(), Util.f22177g, " ConnectionPool"));
        this.f22296e = new ConcurrentLinkedQueue<>();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x002b, code lost:
        if (r2 != false) goto L_0x002d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean a(okhttp3.Address r6, okhttp3.internal.connection.RealCall r7, java.util.List<okhttp3.Route> r8, boolean r9) {
        /*
            r5 = this;
            java.lang.String r0 = "address"
            sk.j.f(r6, r0)
            java.lang.String r0 = "call"
            sk.j.f(r7, r0)
            java.util.concurrent.ConcurrentLinkedQueue<okhttp3.internal.connection.RealConnection> r0 = r5.f22296e
            java.util.Iterator r0 = r0.iterator()
        L_0x0010:
            boolean r1 = r0.hasNext()
            r2 = 0
            if (r1 == 0) goto L_0x003f
            java.lang.Object r1 = r0.next()
            okhttp3.internal.connection.RealConnection r1 = (okhttp3.internal.connection.RealConnection) r1
            java.lang.String r3 = "connection"
            sk.j.e(r1, r3)
            monitor-enter(r1)
            r3 = 1
            if (r9 == 0) goto L_0x002d
            okhttp3.internal.http2.Http2Connection r4 = r1.f22276g     // Catch:{ all -> 0x003c }
            if (r4 == 0) goto L_0x002b
            r2 = r3
        L_0x002b:
            if (r2 == 0) goto L_0x0038
        L_0x002d:
            boolean r2 = r1.h(r6, r8)     // Catch:{ all -> 0x003c }
            if (r2 == 0) goto L_0x0038
            r7.b(r1)     // Catch:{ all -> 0x003c }
            monitor-exit(r1)
            return r3
        L_0x0038:
            ek.i r2 = ek.i.f20112a     // Catch:{ all -> 0x003c }
            monitor-exit(r1)
            goto L_0x0010
        L_0x003c:
            r6 = move-exception
            monitor-exit(r1)
            throw r6
        L_0x003f:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.connection.RealConnectionPool.a(okhttp3.Address, okhttp3.internal.connection.RealCall, java.util.List, boolean):boolean");
    }

    public final int b(RealConnection realConnection, long j10) {
        byte[] bArr = Util.f22171a;
        ArrayList arrayList = realConnection.f22285p;
        int i10 = 0;
        while (i10 < arrayList.size()) {
            Reference reference = (Reference) arrayList.get(i10);
            if (reference.get() != null) {
                i10++;
            } else {
                StringBuilder q10 = a.q("A connection to ");
                q10.append(realConnection.f22271b.f22160a.f21901i);
                q10.append(" was leaked. Did you forget to close a response body?");
                String sb2 = q10.toString();
                Platform.f22562a.getClass();
                Platform.f22563b.k(((RealCall.CallReference) reference).f22269a, sb2);
                arrayList.remove(i10);
                realConnection.f22279j = true;
                if (arrayList.isEmpty()) {
                    realConnection.f22286q = j10 - this.f22293b;
                    return 0;
                }
            }
        }
        return arrayList.size();
    }
}
