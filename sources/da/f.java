package da;

import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import l6.h;

/* compiled from: DelegatingScheduledExecutorService */
public final class f implements ScheduledExecutorService {

    /* renamed from: a  reason: collision with root package name */
    public final ExecutorService f8846a;

    /* renamed from: b  reason: collision with root package name */
    public final ScheduledExecutorService f8847b;

    public f(ExecutorService executorService, ScheduledExecutorService scheduledExecutorService) {
        this.f8846a = executorService;
        this.f8847b = scheduledExecutorService;
    }

    public final boolean awaitTermination(long j10, TimeUnit timeUnit) {
        return this.f8846a.awaitTermination(j10, timeUnit);
    }

    public final void execute(Runnable runnable) {
        this.f8846a.execute(runnable);
    }

    public final <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> collection) {
        return this.f8846a.invokeAll(collection);
    }

    public final <T> T invokeAny(Collection<? extends Callable<T>> collection) {
        return this.f8846a.invokeAny(collection);
    }

    public final boolean isShutdown() {
        return this.f8846a.isShutdown();
    }

    public final boolean isTerminated() {
        return this.f8846a.isTerminated();
    }

    public final ScheduledFuture<?> schedule(Runnable runnable, long j10, TimeUnit timeUnit) {
        return new g(new h(this, runnable, j10, timeUnit));
    }

    public final ScheduledFuture<?> scheduleAtFixedRate(Runnable runnable, long j10, long j11, TimeUnit timeUnit) {
        return new g(new d(this, runnable, j10, j11, timeUnit));
    }

    public final ScheduledFuture<?> scheduleWithFixedDelay(Runnable runnable, long j10, long j11, TimeUnit timeUnit) {
        return new g(new c(this, runnable, j10, j11, timeUnit));
    }

    public final void shutdown() {
        throw new UnsupportedOperationException("Shutting down is not allowed.");
    }

    public final List<Runnable> shutdownNow() {
        throw new UnsupportedOperationException("Shutting down is not allowed.");
    }

    public final <T> Future<T> submit(Callable<T> callable) {
        return this.f8846a.submit(callable);
    }

    public final <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> collection, long j10, TimeUnit timeUnit) {
        return this.f8846a.invokeAll(collection, j10, timeUnit);
    }

    public final <T> T invokeAny(Collection<? extends Callable<T>> collection, long j10, TimeUnit timeUnit) {
        return this.f8846a.invokeAny(collection, j10, timeUnit);
    }

    public final <V> ScheduledFuture<V> schedule(Callable<V> callable, long j10, TimeUnit timeUnit) {
        return new g(new b(this, callable, j10, timeUnit));
    }

    public final <T> Future<T> submit(Runnable runnable, T t10) {
        return this.f8846a.submit(runnable, t10);
    }

    public final Future<?> submit(Runnable runnable) {
        return this.f8846a.submit(runnable);
    }
}
