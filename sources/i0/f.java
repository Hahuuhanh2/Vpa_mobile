package i0;

import al.g0;
import i0.i;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import z0.b;
import z0.c;

/* compiled from: Futures */
public final class f {

    /* renamed from: a  reason: collision with root package name */
    public static final a f10905a = new a();

    /* compiled from: Futures */
    public class a implements p.a<Object, Object> {
        public final Object apply(Object obj) {
            return obj;
        }
    }

    /* compiled from: Futures */
    public static final class b<V> implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final Future<V> f10906a;

        /* renamed from: b  reason: collision with root package name */
        public final c<? super V> f10907b;

        public b(Future<V> future, c<? super V> cVar) {
            this.f10906a = future;
            this.f10907b = cVar;
        }

        public final void run() {
            try {
                this.f10907b.onSuccess(f.a(this.f10906a));
            } catch (ExecutionException e10) {
                Throwable cause = e10.getCause();
                if (cause == null) {
                    this.f10907b.a(e10);
                } else {
                    this.f10907b.a(cause);
                }
            } catch (Error | RuntimeException e11) {
                this.f10907b.a(e11);
            }
        }

        public final String toString() {
            return b.class.getSimpleName() + "," + this.f10907b;
        }
    }

    public static <V> V a(Future<V> future) {
        boolean isDone = future.isDone();
        g0.E("Future was expected to be done, " + future, isDone);
        return b(future);
    }

    public static <V> V b(Future<V> future) {
        V v2;
        boolean z10 = false;
        while (true) {
            try {
                v2 = future.get();
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
        return v2;
    }

    public static i.c c(Object obj) {
        if (obj == null) {
            return i.c.f10912b;
        }
        return new i.c(obj);
    }

    public static <V> v8.a<V> d(v8.a<V> aVar) {
        aVar.getClass();
        if (aVar.isDone()) {
            return aVar;
        }
        return z0.b.a(new ca.a(aVar, 8));
    }

    public static void e(boolean z10, v8.a aVar, b.a aVar2, h0.a aVar3) {
        aVar.getClass();
        aVar2.getClass();
        aVar3.getClass();
        aVar.b(new b(aVar, new g(aVar2)), aVar3);
        if (z10) {
            h hVar = new h(aVar);
            h0.a x10 = j7.a.x();
            c<Void> cVar = aVar2.f17800c;
            if (cVar != null) {
                cVar.b(hVar, x10);
            }
        }
    }

    public static b f(v8.a aVar, p.a aVar2, Executor executor) {
        b bVar = new b(new e(aVar2), aVar);
        aVar.b(bVar, executor);
        return bVar;
    }
}
