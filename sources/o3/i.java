package o3;

import al.i1;
import al.k1;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import v8.a;
import z3.a;
import z3.c;

/* compiled from: ListenableFuture.kt */
public final class i<R> implements a<R> {

    /* renamed from: a  reason: collision with root package name */
    public final i1 f13681a;

    /* renamed from: b  reason: collision with root package name */
    public final c<R> f13682b;

    public i(k1 k1Var) {
        c<R> cVar = new c<>();
        this.f13681a = k1Var;
        this.f13682b = cVar;
        k1Var.invokeOnCompletion(new h(this));
    }

    public final void b(Runnable runnable, Executor executor) {
        this.f13682b.b(runnable, executor);
    }

    public final boolean cancel(boolean z10) {
        return this.f13682b.cancel(z10);
    }

    public final R get() {
        return this.f13682b.get();
    }

    public final R get(long j10, TimeUnit timeUnit) {
        return this.f13682b.get(j10, timeUnit);
    }

    public final boolean isCancelled() {
        return this.f13682b.f17841a instanceof a.b;
    }

    public final boolean isDone() {
        return this.f13682b.isDone();
    }
}
