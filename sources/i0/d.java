package i0;

import al.g0;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import z0.b;

/* compiled from: FutureChain */
public class d<V> implements v8.a<V> {

    /* renamed from: a  reason: collision with root package name */
    public final v8.a<V> f10901a;

    /* renamed from: b  reason: collision with root package name */
    public b.a<V> f10902b;

    /* compiled from: FutureChain */
    public class a implements b.c<V> {
        public a() {
        }

        public final String e(b.a aVar) {
            boolean z10;
            if (d.this.f10902b == null) {
                z10 = true;
            } else {
                z10 = false;
            }
            g0.E("The result can only set once!", z10);
            d.this.f10902b = aVar;
            StringBuilder q10 = android.support.v4.media.a.q("FutureChain[");
            q10.append(d.this);
            q10.append("]");
            return q10.toString();
        }
    }

    public d(v8.a<V> aVar) {
        aVar.getClass();
        this.f10901a = aVar;
    }

    public static <V> d<V> a(v8.a<V> aVar) {
        if (aVar instanceof d) {
            return (d) aVar;
        }
        return new d<>(aVar);
    }

    public final void b(Runnable runnable, Executor executor) {
        this.f10901a.b(runnable, executor);
    }

    /* access modifiers changed from: package-private */
    public final boolean c(Throwable th2) {
        b.a<V> aVar = this.f10902b;
        if (aVar != null) {
            return aVar.b(th2);
        }
        return false;
    }

    public boolean cancel(boolean z10) {
        return this.f10901a.cancel(z10);
    }

    public final <T> d<T> d(a<? super V, T> aVar, Executor executor) {
        b bVar = new b(aVar, this);
        b(bVar, executor);
        return bVar;
    }

    public V get() {
        return this.f10901a.get();
    }

    public final boolean isCancelled() {
        return this.f10901a.isCancelled();
    }

    public final boolean isDone() {
        return this.f10901a.isDone();
    }

    public V get(long j10, TimeUnit timeUnit) {
        return this.f10901a.get(j10, timeUnit);
    }

    public d() {
        this.f10901a = b.a(new a());
    }
}
