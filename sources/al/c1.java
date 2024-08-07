package al;

import fl.b;
import ik.f;
import java.lang.reflect.Method;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import w6.l0;

/* compiled from: Executors.kt */
public final class c1 extends b1 implements l0 {

    /* renamed from: c  reason: collision with root package name */
    public final Executor f19001c;

    public c1(Executor executor) {
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor;
        this.f19001c = executor;
        Method method = b.f20222a;
        try {
            if (executor instanceof ScheduledThreadPoolExecutor) {
                scheduledThreadPoolExecutor = (ScheduledThreadPoolExecutor) executor;
            } else {
                scheduledThreadPoolExecutor = null;
            }
            if (scheduledThreadPoolExecutor != null) {
                Method method2 = b.f20222a;
                if (method2 != null) {
                    method2.invoke(scheduledThreadPoolExecutor, new Object[]{Boolean.TRUE});
                }
            }
        } catch (Throwable unused) {
        }
    }

    public final void close() {
        ExecutorService executorService;
        Executor executor = this.f19001c;
        if (executor instanceof ExecutorService) {
            executorService = (ExecutorService) executor;
        } else {
            executorService = null;
        }
        if (executorService != null) {
            executorService.shutdown();
        }
    }

    public final t0 d(long j10, b2 b2Var, f fVar) {
        ScheduledExecutorService scheduledExecutorService;
        Executor executor = this.f19001c;
        ScheduledFuture<?> scheduledFuture = null;
        if (executor instanceof ScheduledExecutorService) {
            scheduledExecutorService = (ScheduledExecutorService) executor;
        } else {
            scheduledExecutorService = null;
        }
        if (scheduledExecutorService != null) {
            try {
                scheduledFuture = scheduledExecutorService.schedule(b2Var, j10, TimeUnit.MILLISECONDS);
            } catch (RejectedExecutionException e10) {
                CancellationException cancellationException = new CancellationException("The task was rejected");
                cancellationException.initCause(e10);
                g0.x(fVar, cancellationException);
            }
        }
        if (scheduledFuture != null) {
            return new s0(scheduledFuture);
        }
        return h0.f19040q.d(j10, b2Var, fVar);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof c1) || ((c1) obj).f19001c != this.f19001c) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return System.identityHashCode(this.f19001c);
    }

    public final void i(long j10, l lVar) {
        ScheduledExecutorService scheduledExecutorService;
        Executor executor = this.f19001c;
        ScheduledFuture<?> scheduledFuture = null;
        if (executor instanceof ScheduledExecutorService) {
            scheduledExecutorService = (ScheduledExecutorService) executor;
        } else {
            scheduledExecutorService = null;
        }
        if (scheduledExecutorService != null) {
            l0 l0Var = new l0(4, this, lVar);
            f fVar = lVar.f19051e;
            try {
                scheduledFuture = scheduledExecutorService.schedule(l0Var, j10, TimeUnit.MILLISECONDS);
            } catch (RejectedExecutionException e10) {
                CancellationException cancellationException = new CancellationException("The task was rejected");
                cancellationException.initCause(e10);
                g0.x(fVar, cancellationException);
            }
        }
        if (scheduledFuture != null) {
            lVar.v(new h(scheduledFuture, 0));
        } else {
            h0.f19040q.i(j10, lVar);
        }
    }

    public final void s(f fVar, Runnable runnable) {
        try {
            this.f19001c.execute(runnable);
        } catch (RejectedExecutionException e10) {
            CancellationException cancellationException = new CancellationException("The task was rejected");
            cancellationException.initCause(e10);
            g0.x(fVar, cancellationException);
            r0.f19085b.s(fVar, runnable);
        }
    }

    public final String toString() {
        return this.f19001c.toString();
    }
}
