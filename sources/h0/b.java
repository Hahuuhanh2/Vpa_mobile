package h0;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import i0.i;
import java.util.List;
import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.Callable;
import java.util.concurrent.Delayed;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.RunnableScheduledFuture;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import z0.b;

/* compiled from: HandlerScheduledExecutorService */
public final class b extends AbstractExecutorService implements ScheduledExecutorService {

    /* renamed from: a  reason: collision with root package name */
    public final Handler f10504a;

    /* compiled from: HandlerScheduledExecutorService */
    public class a extends ThreadLocal<ScheduledExecutorService> {
        public final Object initialValue() {
            if (Looper.myLooper() == Looper.getMainLooper()) {
                return j7.a.f0();
            }
            if (Looper.myLooper() != null) {
                return new b(new Handler(Looper.myLooper()));
            }
            return null;
        }
    }

    /* renamed from: h0.b$b  reason: collision with other inner class name */
    /* compiled from: HandlerScheduledExecutorService */
    public class C0116b implements Callable<Void> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Runnable f10505a;

        public C0116b(Runnable runnable) {
            this.f10505a = runnable;
        }

        public final Object call() {
            this.f10505a.run();
            return null;
        }
    }

    /* compiled from: HandlerScheduledExecutorService */
    public static class c<V> implements RunnableScheduledFuture<V> {

        /* renamed from: a  reason: collision with root package name */
        public final AtomicReference<b.a<V>> f10506a = new AtomicReference<>((Object) null);

        /* renamed from: b  reason: collision with root package name */
        public final long f10507b;

        /* renamed from: c  reason: collision with root package name */
        public final Callable<V> f10508c;

        /* renamed from: d  reason: collision with root package name */
        public final b.d f10509d;

        /* compiled from: HandlerScheduledExecutorService */
        public class a implements b.c<V> {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ Handler f10510a;

            /* renamed from: b  reason: collision with root package name */
            public final /* synthetic */ Callable f10511b;

            public a(Handler handler, Callable callable) {
                this.f10510a = handler;
                this.f10511b = callable;
            }

            public final String e(b.a aVar) {
                c cVar = new c(this);
                a x10 = j7.a.x();
                z0.c<Void> cVar2 = aVar.f17800c;
                if (cVar2 != null) {
                    cVar2.b(cVar, x10);
                }
                c.this.f10506a.set(aVar);
                return "HandlerScheduledFuture-" + this.f10511b.toString();
            }
        }

        public c(Handler handler, long j10, Callable<V> callable) {
            this.f10507b = j10;
            this.f10508c = callable;
            this.f10509d = z0.b.a(new a(handler, callable));
        }

        public final boolean cancel(boolean z10) {
            return this.f10509d.cancel(z10);
        }

        public final int compareTo(Object obj) {
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            return Long.compare(getDelay(timeUnit), ((Delayed) obj).getDelay(timeUnit));
        }

        public final V get() {
            return this.f10509d.get();
        }

        public final long getDelay(TimeUnit timeUnit) {
            return timeUnit.convert(this.f10507b - System.currentTimeMillis(), TimeUnit.MILLISECONDS);
        }

        public final boolean isCancelled() {
            return this.f10509d.isCancelled();
        }

        public final boolean isDone() {
            return this.f10509d.isDone();
        }

        public final boolean isPeriodic() {
            return false;
        }

        public final void run() {
            b.a andSet = this.f10506a.getAndSet((Object) null);
            if (andSet != null) {
                try {
                    andSet.a(this.f10508c.call());
                } catch (Exception e10) {
                    andSet.b(e10);
                }
            }
        }

        public final V get(long j10, TimeUnit timeUnit) {
            return this.f10509d.f17803b.get(j10, timeUnit);
        }
    }

    static {
        new a();
    }

    public b(Handler handler) {
        this.f10504a = handler;
    }

    public final boolean awaitTermination(long j10, TimeUnit timeUnit) {
        throw new UnsupportedOperationException(b.class.getSimpleName() + " cannot be shut down. Use Looper.quitSafely().");
    }

    public final void execute(Runnable runnable) {
        if (!this.f10504a.post(runnable)) {
            throw new RejectedExecutionException(this.f10504a + " is shutting down");
        }
    }

    public final boolean isShutdown() {
        return false;
    }

    public final boolean isTerminated() {
        return false;
    }

    public final ScheduledFuture<?> schedule(Runnable runnable, long j10, TimeUnit timeUnit) {
        return schedule(new C0116b(runnable), j10, timeUnit);
    }

    public final ScheduledFuture<?> scheduleAtFixedRate(Runnable runnable, long j10, long j11, TimeUnit timeUnit) {
        throw new UnsupportedOperationException(b.class.getSimpleName() + " does not yet support fixed-rate scheduling.");
    }

    public final ScheduledFuture<?> scheduleWithFixedDelay(Runnable runnable, long j10, long j11, TimeUnit timeUnit) {
        throw new UnsupportedOperationException(b.class.getSimpleName() + " does not yet support fixed-delay scheduling.");
    }

    public final void shutdown() {
        throw new UnsupportedOperationException(b.class.getSimpleName() + " cannot be shut down. Use Looper.quitSafely().");
    }

    public final List<Runnable> shutdownNow() {
        throw new UnsupportedOperationException(b.class.getSimpleName() + " cannot be shut down. Use Looper.quitSafely().");
    }

    public final <V> ScheduledFuture<V> schedule(Callable<V> callable, long j10, TimeUnit timeUnit) {
        long convert = TimeUnit.MILLISECONDS.convert(j10, timeUnit) + SystemClock.uptimeMillis();
        c cVar = new c(this.f10504a, convert, callable);
        if (this.f10504a.postAtTime(cVar, convert)) {
            return cVar;
        }
        return new i.b(new RejectedExecutionException(this.f10504a + " is shutting down"));
    }
}
