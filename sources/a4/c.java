package a4;

import al.c1;
import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import p3.l0;
import y3.p;

/* compiled from: WorkManagerTaskExecutor */
public final class c implements b {

    /* renamed from: a  reason: collision with root package name */
    public final p f91a;

    /* renamed from: b  reason: collision with root package name */
    public final c1 f92b;

    /* renamed from: c  reason: collision with root package name */
    public final Handler f93c = new Handler(Looper.getMainLooper());

    /* renamed from: d  reason: collision with root package name */
    public final a f94d = new a();

    /* compiled from: WorkManagerTaskExecutor */
    public class a implements Executor {
        public a() {
        }

        public final void execute(Runnable runnable) {
            c.this.f93c.post(runnable);
        }
    }

    public c(ExecutorService executorService) {
        p pVar = new p(executorService);
        this.f91a = pVar;
        this.f92b = l0.U(pVar);
    }

    public final c1 a() {
        return this.f92b;
    }

    public final a b() {
        return this.f94d;
    }

    public final p c() {
        return this.f91a;
    }

    public final void d(Runnable runnable) {
        this.f91a.execute(runnable);
    }
}
