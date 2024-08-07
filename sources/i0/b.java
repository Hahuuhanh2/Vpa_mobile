package i0;

import java.lang.reflect.UndeclaredThrowableException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import z0.b;

/* compiled from: ChainingListenableFuture */
public final class b<I, O> extends d<O> implements Runnable {

    /* renamed from: c  reason: collision with root package name */
    public a<? super I, ? extends O> f10894c;

    /* renamed from: d  reason: collision with root package name */
    public final LinkedBlockingQueue f10895d = new LinkedBlockingQueue(1);

    /* renamed from: e  reason: collision with root package name */
    public final CountDownLatch f10896e = new CountDownLatch(1);

    /* renamed from: f  reason: collision with root package name */
    public v8.a<? extends I> f10897f;

    /* renamed from: n  reason: collision with root package name */
    public volatile v8.a<? extends O> f10898n;

    /* compiled from: ChainingListenableFuture */
    public class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ v8.a f10899a;

        public a(v8.a aVar) {
            this.f10899a = aVar;
        }

        public final void run() {
            try {
                b bVar = b.this;
                Object b10 = f.b(this.f10899a);
                b.a<V> aVar = bVar.f10902b;
                if (aVar != null) {
                    aVar.a(b10);
                }
            } catch (CancellationException unused) {
                b.this.cancel(false);
                b.this.f10898n = null;
                return;
            } catch (ExecutionException e10) {
                b.this.c(e10.getCause());
            } catch (Throwable th2) {
                b.this.f10898n = null;
                throw th2;
            }
            b.this.f10898n = null;
        }
    }

    public b(a<? super I, ? extends O> aVar, v8.a<? extends I> aVar2) {
        this.f10894c = aVar;
        aVar2.getClass();
        this.f10897f = aVar2;
    }

    public static Object e(LinkedBlockingQueue linkedBlockingQueue) {
        Object take;
        boolean z10 = false;
        while (true) {
            try {
                take = linkedBlockingQueue.take();
                break;
            } catch (InterruptedException unused) {
                z10 = true;
            } catch (Throwable th2) {
                if (z10) {
                    Thread.currentThread().interrupt();
                }
                throw th2;
            }
        }
        if (z10) {
            Thread.currentThread().interrupt();
        }
        return take;
    }

    public final boolean cancel(boolean z10) {
        boolean z11 = false;
        if (!super.cancel(z10)) {
            return false;
        }
        while (true) {
            try {
                this.f10895d.put(Boolean.valueOf(z10));
                break;
            } catch (InterruptedException unused) {
                z11 = true;
            } catch (Throwable th2) {
                if (z11) {
                    Thread.currentThread().interrupt();
                }
                throw th2;
            }
        }
        if (z11) {
            Thread.currentThread().interrupt();
        }
        v8.a<? extends I> aVar = this.f10897f;
        if (aVar != null) {
            aVar.cancel(z10);
        }
        v8.a<? extends O> aVar2 = this.f10898n;
        if (aVar2 != null) {
            aVar2.cancel(z10);
        }
        return true;
    }

    public final O get() {
        if (!isDone()) {
            v8.a<? extends I> aVar = this.f10897f;
            if (aVar != null) {
                aVar.get();
            }
            this.f10896e.await();
            v8.a<? extends O> aVar2 = this.f10898n;
            if (aVar2 != null) {
                aVar2.get();
            }
        }
        return super.get();
    }

    public final void run() {
        try {
            try {
                v8.a<? extends O> apply = this.f10894c.apply(f.b(this.f10897f));
                this.f10898n = apply;
                if (isCancelled()) {
                    apply.cancel(((Boolean) e(this.f10895d)).booleanValue());
                    this.f10898n = null;
                    this.f10894c = null;
                    this.f10897f = null;
                    this.f10896e.countDown();
                    return;
                }
                apply.b(new a(apply), j7.a.x());
                this.f10894c = null;
                this.f10897f = null;
                this.f10896e.countDown();
            } catch (UndeclaredThrowableException e10) {
                c(e10.getCause());
            } catch (Exception e11) {
                c(e11);
            } catch (Error e12) {
                c(e12);
            } catch (Throwable th2) {
                this.f10894c = null;
                this.f10897f = null;
                this.f10896e.countDown();
                throw th2;
            }
        } catch (CancellationException unused) {
            cancel(false);
        } catch (ExecutionException e13) {
            c(e13.getCause());
        }
    }

    public final O get(long j10, TimeUnit timeUnit) {
        if (!isDone()) {
            TimeUnit timeUnit2 = TimeUnit.NANOSECONDS;
            if (timeUnit != timeUnit2) {
                j10 = timeUnit2.convert(j10, timeUnit);
                timeUnit = timeUnit2;
            }
            v8.a<? extends I> aVar = this.f10897f;
            if (aVar != null) {
                long nanoTime = System.nanoTime();
                aVar.get(j10, timeUnit);
                j10 -= Math.max(0, System.nanoTime() - nanoTime);
            }
            long nanoTime2 = System.nanoTime();
            if (this.f10896e.await(j10, timeUnit)) {
                j10 -= Math.max(0, System.nanoTime() - nanoTime2);
                v8.a<? extends O> aVar2 = this.f10898n;
                if (aVar2 != null) {
                    aVar2.get(j10, timeUnit);
                }
            } else {
                throw new TimeoutException();
            }
        }
        return super.get(j10, timeUnit);
    }
}
