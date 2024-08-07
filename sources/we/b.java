package we;

import android.os.Handler;
import android.os.Looper;
import f0.b0;
import j$.util.concurrent.ConcurrentHashMap;
import java.lang.Thread;
import java.util.HashMap;
import java.util.Objects;
import java.util.Timer;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: PictureThreadUtils */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final Handler f16802a = new Handler(Looper.getMainLooper());

    /* renamed from: b  reason: collision with root package name */
    public static final HashMap f16803b = new HashMap();

    /* renamed from: c  reason: collision with root package name */
    public static final ConcurrentHashMap f16804c = new ConcurrentHashMap();

    /* renamed from: d  reason: collision with root package name */
    public static final int f16805d = Runtime.getRuntime().availableProcessors();

    /* renamed from: e  reason: collision with root package name */
    public static a f16806e;

    /* compiled from: PictureThreadUtils */
    public static final class a extends LinkedBlockingQueue<Runnable> {

        /* renamed from: a  reason: collision with root package name */
        public volatile d f16807a;

        /* renamed from: b  reason: collision with root package name */
        public int f16808b = Integer.MAX_VALUE;

        /* renamed from: g */
        public final boolean offer(Runnable runnable) {
            if (this.f16808b > size() || this.f16807a == null || this.f16807a.getPoolSize() >= this.f16807a.getMaximumPoolSize()) {
                return super.offer(runnable);
            }
            return false;
        }
    }

    /* renamed from: we.b$b  reason: collision with other inner class name */
    /* compiled from: PictureThreadUtils */
    public static abstract class C0217b<T> extends c<T> {
        public final void c() {
            Objects.toString(Thread.currentThread());
        }

        public final void e() {
        }
    }

    /* compiled from: PictureThreadUtils */
    public static abstract class c<T> implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final AtomicInteger f16809a = new AtomicInteger(0);

        /* renamed from: b  reason: collision with root package name */
        public volatile Thread f16810b;

        /* compiled from: PictureThreadUtils */
        public class a implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ Object f16811a;

            public a(Object obj) {
                this.f16811a = obj;
            }

            public final void run() {
                c.this.f(this.f16811a);
                c.this.d();
            }
        }

        /* renamed from: we.b$c$b  reason: collision with other inner class name */
        /* compiled from: PictureThreadUtils */
        public class C0218b implements Runnable {
            public C0218b(Throwable th2) {
            }

            public final void run() {
                c.this.e();
                c.this.d();
            }
        }

        public static a b() {
            if (b.f16806e == null) {
                b.f16806e = new a();
            }
            return b.f16806e;
        }

        public abstract T a();

        public abstract void c();

        public final void d() {
            b.f16804c.remove(this);
        }

        public abstract void e();

        public abstract void f(T t10);

        public final void run() {
            if (this.f16809a.compareAndSet(0, 1)) {
                this.f16810b = Thread.currentThread();
                try {
                    Object a10 = a();
                    if (this.f16809a.compareAndSet(1, 3)) {
                        a b10 = b();
                        a aVar = new a(a10);
                        b10.getClass();
                        b.d(aVar);
                    }
                } catch (InterruptedException unused) {
                    this.f16809a.compareAndSet(4, 5);
                } catch (Throwable th2) {
                    if (this.f16809a.compareAndSet(1, 2)) {
                        a b11 = b();
                        C0218b bVar = new C0218b(th2);
                        b11.getClass();
                        b.d(bVar);
                    }
                }
            }
        }
    }

    /* compiled from: PictureThreadUtils */
    public static final class d extends ThreadPoolExecutor {

        /* renamed from: a  reason: collision with root package name */
        public final AtomicInteger f16814a = new AtomicInteger();

        /* renamed from: b  reason: collision with root package name */
        public a f16815b;

        public d(int i10, int i11, long j10, TimeUnit timeUnit, a aVar, e eVar) {
            super(i10, i11, j10, timeUnit, aVar, eVar);
            aVar.f16807a = this;
            this.f16815b = aVar;
        }

        public static d a() {
            int i10 = (b.f16805d * 2) + 1;
            return new d(i10, i10, 30, TimeUnit.SECONDS, new a(), new e("io"));
        }

        public final void afterExecute(Runnable runnable, Throwable th2) {
            this.f16814a.decrementAndGet();
            super.afterExecute(runnable, th2);
        }

        public final void execute(Runnable runnable) {
            if (!isShutdown()) {
                this.f16814a.incrementAndGet();
                try {
                    super.execute(runnable);
                } catch (RejectedExecutionException unused) {
                    this.f16815b.offer(runnable);
                } catch (Throwable unused2) {
                    this.f16814a.decrementAndGet();
                }
            }
        }
    }

    /* compiled from: PictureThreadUtils */
    public static final class e extends AtomicLong implements ThreadFactory {

        /* renamed from: c  reason: collision with root package name */
        public static final AtomicInteger f16816c = new AtomicInteger(1);

        /* renamed from: a  reason: collision with root package name */
        public final String f16817a;

        /* renamed from: b  reason: collision with root package name */
        public final int f16818b = 5;

        /* compiled from: PictureThreadUtils */
        public class a extends Thread {
            public a(Runnable runnable, String str) {
                super(runnable, str);
            }

            public final void run() {
                try {
                    super.run();
                } catch (Throwable unused) {
                }
            }
        }

        /* renamed from: we.b$e$b  reason: collision with other inner class name */
        /* compiled from: PictureThreadUtils */
        public class C0219b implements Thread.UncaughtExceptionHandler {
            public final void uncaughtException(Thread thread, Throwable th2) {
                System.out.println(th2);
            }
        }

        public e(String str) {
            StringBuilder v2 = b0.v(str, "-pool-");
            v2.append(f16816c.getAndIncrement());
            v2.append("-thread-");
            this.f16817a = v2.toString();
        }

        public final Thread newThread(Runnable runnable) {
            a aVar = new a(runnable, this.f16817a + getAndIncrement());
            aVar.setDaemon(false);
            aVar.setUncaughtExceptionHandler(new C0219b());
            aVar.setPriority(this.f16818b);
            return aVar;
        }
    }

    static {
        new Timer();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001a, code lost:
        if (r3.f16810b == null) goto L_0x0021;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x001c, code lost:
        r3.f16810b.interrupt();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0021, code lost:
        r0 = we.b.c.b();
        r1 = new we.c(r3);
        r0.getClass();
        d(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void a(we.b.c r3) {
        /*
            if (r3 != 0) goto L_0x0003
            return
        L_0x0003:
            java.util.concurrent.atomic.AtomicInteger r0 = r3.f16809a
            monitor-enter(r0)
            java.util.concurrent.atomic.AtomicInteger r1 = r3.f16809a     // Catch:{ all -> 0x0031 }
            int r1 = r1.get()     // Catch:{ all -> 0x0031 }
            r2 = 1
            if (r1 <= r2) goto L_0x0011
            monitor-exit(r0)     // Catch:{ all -> 0x0031 }
            goto L_0x0030
        L_0x0011:
            java.util.concurrent.atomic.AtomicInteger r1 = r3.f16809a     // Catch:{ all -> 0x0031 }
            r2 = 4
            r1.set(r2)     // Catch:{ all -> 0x0031 }
            monitor-exit(r0)     // Catch:{ all -> 0x0031 }
            java.lang.Thread r0 = r3.f16810b
            if (r0 == 0) goto L_0x0021
            java.lang.Thread r0 = r3.f16810b
            r0.interrupt()
        L_0x0021:
            we.a r0 = we.b.c.b()
            we.c r1 = new we.c
            r1.<init>(r3)
            r0.getClass()
            d(r1)
        L_0x0030:
            return
        L_0x0031:
            r3 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0031 }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: we.b.a(we.b$c):void");
    }

    public static void b(C0217b bVar) {
        ExecutorService c10 = c();
        ConcurrentHashMap concurrentHashMap = f16804c;
        synchronized (concurrentHashMap) {
            if (concurrentHashMap.get(bVar) == null) {
                concurrentHashMap.put(bVar, c10);
                c10.execute(bVar);
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v1, resolved type: java.util.concurrent.ExecutorService} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.concurrent.ExecutorService c() {
        /*
            java.util.HashMap r0 = f16803b
            monitor-enter(r0)
            r1 = -4
            java.lang.Integer r2 = java.lang.Integer.valueOf(r1)     // Catch:{ all -> 0x0043 }
            java.lang.Object r2 = r0.get(r2)     // Catch:{ all -> 0x0043 }
            java.util.Map r2 = (java.util.Map) r2     // Catch:{ all -> 0x0043 }
            r3 = 5
            if (r2 != 0) goto L_0x0029
            j$.util.concurrent.ConcurrentHashMap r2 = new j$.util.concurrent.ConcurrentHashMap     // Catch:{ all -> 0x0043 }
            r2.<init>()     // Catch:{ all -> 0x0043 }
            we.b$d r4 = we.b.d.a()     // Catch:{ all -> 0x0043 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x0043 }
            r2.put(r3, r4)     // Catch:{ all -> 0x0043 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ all -> 0x0043 }
            r0.put(r1, r2)     // Catch:{ all -> 0x0043 }
            goto L_0x0041
        L_0x0029:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x0043 }
            java.lang.Object r1 = r2.get(r1)     // Catch:{ all -> 0x0043 }
            r4 = r1
            java.util.concurrent.ExecutorService r4 = (java.util.concurrent.ExecutorService) r4     // Catch:{ all -> 0x0043 }
            if (r4 != 0) goto L_0x0041
            we.b$d r4 = we.b.d.a()     // Catch:{ all -> 0x0043 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x0043 }
            r2.put(r1, r4)     // Catch:{ all -> 0x0043 }
        L_0x0041:
            monitor-exit(r0)     // Catch:{ all -> 0x0043 }
            return r4
        L_0x0043:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0043 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: we.b.c():java.util.concurrent.ExecutorService");
    }

    public static void d(Runnable runnable) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            runnable.run();
        } else {
            f16802a.post(runnable);
        }
    }
}
