package lc;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicReference;
import w6.l0;

/* compiled from: com.google.mlkit:common@@18.7.0 */
public final class n {

    /* renamed from: a  reason: collision with root package name */
    public final Object f12929a = new Object();

    /* renamed from: b  reason: collision with root package name */
    public boolean f12930b;

    /* renamed from: c  reason: collision with root package name */
    public final ArrayDeque f12931c = new ArrayDeque();

    /* renamed from: d  reason: collision with root package name */
    public final AtomicReference f12932d = new AtomicReference();

    public final void a(Runnable runnable, Executor executor) {
        synchronized (this.f12929a) {
            if (this.f12930b) {
                this.f12931c.add(new x(executor, runnable));
                return;
            }
            this.f12930b = true;
            c(runnable, executor);
        }
    }

    public final void b() {
        synchronized (this.f12929a) {
            if (this.f12931c.isEmpty()) {
                this.f12930b = false;
                return;
            }
            x xVar = (x) this.f12931c.remove();
            c(xVar.f12952b, xVar.f12951a);
        }
    }

    public final void c(Runnable runnable, Executor executor) {
        try {
            executor.execute(new l0(3, this, runnable));
        } catch (RejectedExecutionException unused) {
            b();
        }
    }
}
