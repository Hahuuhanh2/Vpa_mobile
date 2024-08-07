package y3;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* compiled from: SerialExecutorImpl */
public final class p implements a4.a {

    /* renamed from: a  reason: collision with root package name */
    public final ArrayDeque<a> f17405a = new ArrayDeque<>();

    /* renamed from: b  reason: collision with root package name */
    public final Executor f17406b;

    /* renamed from: c  reason: collision with root package name */
    public Runnable f17407c;

    /* renamed from: d  reason: collision with root package name */
    public final Object f17408d = new Object();

    /* compiled from: SerialExecutorImpl */
    public static class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final p f17409a;

        /* renamed from: b  reason: collision with root package name */
        public final Runnable f17410b;

        public a(p pVar, Runnable runnable) {
            this.f17409a = pVar;
            this.f17410b = runnable;
        }

        public final void run() {
            try {
                this.f17410b.run();
                synchronized (this.f17409a.f17408d) {
                    this.f17409a.a();
                }
            } catch (Throwable th2) {
                synchronized (this.f17409a.f17408d) {
                    this.f17409a.a();
                    throw th2;
                }
            }
        }
    }

    public p(ExecutorService executorService) {
        this.f17406b = executorService;
    }

    public final void a() {
        Runnable poll = this.f17405a.poll();
        this.f17407c = poll;
        if (poll != null) {
            this.f17406b.execute(poll);
        }
    }

    public final void execute(Runnable runnable) {
        synchronized (this.f17408d) {
            this.f17405a.add(new a(this, runnable));
            if (this.f17407c == null) {
                a();
            }
        }
    }
}
