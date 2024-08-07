package ll;

import ek.i;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import sk.j;

/* compiled from: AsyncTimeout.kt */
public class c extends d0 {

    /* renamed from: h  reason: collision with root package name */
    public static final ReentrantLock f20861h;

    /* renamed from: i  reason: collision with root package name */
    public static final Condition f20862i;

    /* renamed from: j  reason: collision with root package name */
    public static final long f20863j;

    /* renamed from: k  reason: collision with root package name */
    public static final long f20864k;

    /* renamed from: l  reason: collision with root package name */
    public static c f20865l;

    /* renamed from: e  reason: collision with root package name */
    public boolean f20866e;

    /* renamed from: f  reason: collision with root package name */
    public c f20867f;

    /* renamed from: g  reason: collision with root package name */
    public long f20868g;

    /* compiled from: AsyncTimeout.kt */
    public static final class a {
        public static c a() {
            c cVar = c.f20865l;
            j.c(cVar);
            c cVar2 = cVar.f20867f;
            if (cVar2 == null) {
                long nanoTime = System.nanoTime();
                c.f20862i.await(c.f20863j, TimeUnit.MILLISECONDS);
                c cVar3 = c.f20865l;
                j.c(cVar3);
                if (cVar3.f20867f != null || System.nanoTime() - nanoTime < c.f20864k) {
                    return null;
                }
                return c.f20865l;
            }
            long nanoTime2 = cVar2.f20868g - System.nanoTime();
            if (nanoTime2 > 0) {
                c.f20862i.await(nanoTime2, TimeUnit.NANOSECONDS);
                return null;
            }
            c cVar4 = c.f20865l;
            j.c(cVar4);
            cVar4.f20867f = cVar2.f20867f;
            cVar2.f20867f = null;
            return cVar2;
        }
    }

    /* compiled from: AsyncTimeout.kt */
    public static final class b extends Thread {
        public b() {
            super("Okio Watchdog");
            setDaemon(true);
        }

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|(5:5|6|7|19|8)(5:9|10|11|12|(2:14|23)(1:22))|18) */
        /* JADX WARNING: Code restructure failed: missing block: B:15:0x001f, code lost:
            r1 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:16:0x0020, code lost:
            r0.unlock();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:17:0x0023, code lost:
            throw r1;
         */
        /* JADX WARNING: Missing exception handler attribute for start block: B:0:0x0000 */
        /* JADX WARNING: Removed duplicated region for block: B:0:0x0000 A[LOOP:0: B:0:0x0000->B:18:0x0000, LOOP_START, MTH_ENTER_BLOCK, SYNTHETIC, Splitter:B:0:0x0000] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void run() {
            /*
                r3 = this;
            L_0x0000:
                java.util.concurrent.locks.ReentrantLock r0 = ll.c.f20861h     // Catch:{ InterruptedException -> 0x0000 }
                r0.lock()     // Catch:{ InterruptedException -> 0x0000 }
                ll.c r1 = ll.c.a.a()     // Catch:{ all -> 0x001f }
                ll.c r2 = ll.c.f20865l     // Catch:{ all -> 0x001f }
                if (r1 != r2) goto L_0x0014
                r1 = 0
                ll.c.f20865l = r1     // Catch:{ all -> 0x001f }
                r0.unlock()     // Catch:{ InterruptedException -> 0x0000 }
                return
            L_0x0014:
                ek.i r2 = ek.i.f20112a     // Catch:{ all -> 0x001f }
                r0.unlock()     // Catch:{ InterruptedException -> 0x0000 }
                if (r1 == 0) goto L_0x0000
                r1.k()     // Catch:{ InterruptedException -> 0x0000 }
                goto L_0x0000
            L_0x001f:
                r1 = move-exception
                r0.unlock()     // Catch:{ InterruptedException -> 0x0000 }
                throw r1     // Catch:{ InterruptedException -> 0x0000 }
            */
            throw new UnsupportedOperationException("Method not decompiled: ll.c.b.run():void");
        }
    }

    static {
        ReentrantLock reentrantLock = new ReentrantLock();
        f20861h = reentrantLock;
        Condition newCondition = reentrantLock.newCondition();
        j.e(newCondition, "newCondition(...)");
        f20862i = newCondition;
        long millis = TimeUnit.SECONDS.toMillis(60);
        f20863j = millis;
        f20864k = TimeUnit.MILLISECONDS.toNanos(millis);
    }

    public final void h() {
        c cVar;
        long j10 = this.f20874c;
        boolean z10 = this.f20872a;
        int i10 = (j10 > 0 ? 1 : (j10 == 0 ? 0 : -1));
        if (i10 != 0 || z10) {
            ReentrantLock reentrantLock = f20861h;
            reentrantLock.lock();
            try {
                if (!this.f20866e) {
                    this.f20866e = true;
                    if (f20865l == null) {
                        f20865l = new c();
                        new b().start();
                    }
                    long nanoTime = System.nanoTime();
                    if (i10 != 0 && z10) {
                        this.f20868g = Math.min(j10, c() - nanoTime) + nanoTime;
                    } else if (i10 != 0) {
                        this.f20868g = j10 + nanoTime;
                    } else if (z10) {
                        this.f20868g = c();
                    } else {
                        throw new AssertionError();
                    }
                    long j11 = this.f20868g - nanoTime;
                    c cVar2 = f20865l;
                    j.c(cVar2);
                    while (true) {
                        cVar = cVar2.f20867f;
                        if (cVar == null) {
                            break;
                        } else if (j11 < cVar.f20868g - nanoTime) {
                            break;
                        } else {
                            cVar2 = cVar;
                        }
                    }
                    this.f20867f = cVar;
                    cVar2.f20867f = this;
                    if (cVar2 == f20865l) {
                        f20862i.signal();
                    }
                    i iVar = i.f20112a;
                    return;
                }
                throw new IllegalStateException("Unbalanced enter/exit".toString());
            } finally {
                reentrantLock.unlock();
            }
        }
    }

    public final boolean i() {
        ReentrantLock reentrantLock = f20861h;
        reentrantLock.lock();
        try {
            if (!this.f20866e) {
                return false;
            }
            this.f20866e = false;
            c cVar = f20865l;
            while (cVar != null) {
                c cVar2 = cVar.f20867f;
                if (cVar2 == this) {
                    cVar.f20867f = this.f20867f;
                    this.f20867f = null;
                    reentrantLock.unlock();
                    return false;
                }
                cVar = cVar2;
            }
            reentrantLock.unlock();
            return true;
        } finally {
            reentrantLock.unlock();
        }
    }

    public IOException j(IOException iOException) {
        InterruptedIOException interruptedIOException = new InterruptedIOException("timeout");
        if (iOException != null) {
            interruptedIOException.initCause(iOException);
        }
        return interruptedIOException;
    }

    public void k() {
    }
}
