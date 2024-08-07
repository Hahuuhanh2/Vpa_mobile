package x4;

import android.os.Process;
import android.os.StrictMode;
import android.util.Log;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: GlideExecutor */
public final class a implements ExecutorService {

    /* renamed from: b  reason: collision with root package name */
    public static final long f17062b = TimeUnit.SECONDS.toMillis(10);

    /* renamed from: c  reason: collision with root package name */
    public static volatile int f17063c;

    /* renamed from: a  reason: collision with root package name */
    public final ExecutorService f17064a;

    /* renamed from: x4.a$a  reason: collision with other inner class name */
    /* compiled from: GlideExecutor */
    public static final class C0224a implements ThreadFactory {

        /* renamed from: x4.a$a$a  reason: collision with other inner class name */
        /* compiled from: GlideExecutor */
        public class C0225a extends Thread {
            public C0225a(Runnable runnable) {
                super(runnable);
            }

            public final void run() {
                Process.setThreadPriority(9);
                super.run();
            }
        }

        public final Thread newThread(Runnable runnable) {
            return new C0225a(runnable);
        }
    }

    /* compiled from: GlideExecutor */
    public static final class b implements ThreadFactory {

        /* renamed from: a  reason: collision with root package name */
        public final ThreadFactory f17065a;

        /* renamed from: b  reason: collision with root package name */
        public final String f17066b;

        /* renamed from: c  reason: collision with root package name */
        public final c f17067c;

        /* renamed from: d  reason: collision with root package name */
        public final boolean f17068d;

        /* renamed from: e  reason: collision with root package name */
        public final AtomicInteger f17069e = new AtomicInteger();

        /* renamed from: x4.a$b$a  reason: collision with other inner class name */
        /* compiled from: GlideExecutor */
        public class C0226a implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ Runnable f17070a;

            public C0226a(Runnable runnable) {
                this.f17070a = runnable;
            }

            public final void run() {
                if (b.this.f17068d) {
                    StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder().detectNetwork().penaltyDeath().build());
                }
                try {
                    this.f17070a.run();
                } catch (Throwable th2) {
                    b.this.f17067c.a(th2);
                }
            }
        }

        public b(C0224a aVar, String str, boolean z10) {
            c.C0227a aVar2 = c.f17072a;
            this.f17065a = aVar;
            this.f17066b = str;
            this.f17067c = aVar2;
            this.f17068d = z10;
        }

        public final Thread newThread(Runnable runnable) {
            Thread newThread = this.f17065a.newThread(new C0226a(runnable));
            StringBuilder q10 = android.support.v4.media.a.q("glide-");
            q10.append(this.f17066b);
            q10.append("-thread-");
            q10.append(this.f17069e.getAndIncrement());
            newThread.setName(q10.toString());
            return newThread;
        }
    }

    /* compiled from: GlideExecutor */
    public interface c {

        /* renamed from: a  reason: collision with root package name */
        public static final C0227a f17072a = new C0227a();

        /* renamed from: x4.a$c$a  reason: collision with other inner class name */
        /* compiled from: GlideExecutor */
        public class C0227a implements c {
            public final void a(Throwable th2) {
                Log.isLoggable("GlideExecutor", 6);
            }
        }

        void a(Throwable th2);
    }

    public a(ThreadPoolExecutor threadPoolExecutor) {
        this.f17064a = threadPoolExecutor;
    }

    public final boolean awaitTermination(long j10, TimeUnit timeUnit) {
        return this.f17064a.awaitTermination(j10, timeUnit);
    }

    public final void execute(Runnable runnable) {
        this.f17064a.execute(runnable);
    }

    public final <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> collection) {
        return this.f17064a.invokeAll(collection);
    }

    public final <T> T invokeAny(Collection<? extends Callable<T>> collection) {
        return this.f17064a.invokeAny(collection);
    }

    public final boolean isShutdown() {
        return this.f17064a.isShutdown();
    }

    public final boolean isTerminated() {
        return this.f17064a.isTerminated();
    }

    public final void shutdown() {
        this.f17064a.shutdown();
    }

    public final List<Runnable> shutdownNow() {
        return this.f17064a.shutdownNow();
    }

    public final Future<?> submit(Runnable runnable) {
        return this.f17064a.submit(runnable);
    }

    public final String toString() {
        return this.f17064a.toString();
    }

    public final <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> collection, long j10, TimeUnit timeUnit) {
        return this.f17064a.invokeAll(collection, j10, timeUnit);
    }

    public final <T> T invokeAny(Collection<? extends Callable<T>> collection, long j10, TimeUnit timeUnit) {
        return this.f17064a.invokeAny(collection, j10, timeUnit);
    }

    public final <T> Future<T> submit(Runnable runnable, T t10) {
        return this.f17064a.submit(runnable, t10);
    }

    public final <T> Future<T> submit(Callable<T> callable) {
        return this.f17064a.submit(callable);
    }
}
