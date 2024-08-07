package i0;

import c0.p0;
import java.util.concurrent.Delayed;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: ImmediateFuture */
public abstract class i<V> implements v8.a<V> {

    /* compiled from: ImmediateFuture */
    public static class a<V> extends i<V> {

        /* renamed from: a  reason: collision with root package name */
        public final Throwable f10911a;

        public a(Exception exc) {
            this.f10911a = exc;
        }

        public final V get() {
            throw new ExecutionException(this.f10911a);
        }

        public final String toString() {
            return super.toString() + "[status=FAILURE, cause=[" + this.f10911a + "]]";
        }
    }

    /* compiled from: ImmediateFuture */
    public static final class b<V> extends a<V> implements ScheduledFuture<V> {
        public b(RejectedExecutionException rejectedExecutionException) {
            super(rejectedExecutionException);
        }

        public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
            Delayed delayed = (Delayed) obj;
            return -1;
        }

        public final long getDelay(TimeUnit timeUnit) {
            return 0;
        }
    }

    /* compiled from: ImmediateFuture */
    public static final class c<V> extends i<V> {

        /* renamed from: b  reason: collision with root package name */
        public static final c f10912b = new c((Object) null);

        /* renamed from: a  reason: collision with root package name */
        public final V f10913a;

        public c(V v2) {
            this.f10913a = v2;
        }

        public final V get() {
            return this.f10913a;
        }

        public final String toString() {
            return super.toString() + "[status=SUCCESS, result=[" + this.f10913a + "]]";
        }
    }

    public final void b(Runnable runnable, Executor executor) {
        runnable.getClass();
        executor.getClass();
        try {
            executor.execute(runnable);
        } catch (RuntimeException unused) {
            runnable.toString();
            executor.toString();
            p0.c("ImmediateFuture");
        }
    }

    public final boolean cancel(boolean z10) {
        return false;
    }

    public abstract V get();

    public final V get(long j10, TimeUnit timeUnit) {
        timeUnit.getClass();
        return get();
    }

    public final boolean isCancelled() {
        return false;
    }

    public final boolean isDone() {
        return true;
    }
}
