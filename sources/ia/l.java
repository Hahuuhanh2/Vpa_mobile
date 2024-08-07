package ia;

import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import m9.b;

/* compiled from: CrashlyticsBackgroundWorker */
public final class l {

    /* renamed from: a  reason: collision with root package name */
    public final Executor f11332a;

    /* renamed from: b  reason: collision with root package name */
    public Task<Void> f11333b = Tasks.forResult(null);

    /* renamed from: c  reason: collision with root package name */
    public final Object f11334c = new Object();

    /* renamed from: d  reason: collision with root package name */
    public final ThreadLocal<Boolean> f11335d = new ThreadLocal<>();

    /* compiled from: CrashlyticsBackgroundWorker */
    public class a implements Runnable {
        public a() {
        }

        public final void run() {
            l.this.f11335d.set(Boolean.TRUE);
        }
    }

    public l(Executor executor) {
        this.f11332a = executor;
        executor.execute(new a());
    }

    public final <T> Task<T> a(Callable<T> callable) {
        Task<TContinuationResult> continueWith;
        synchronized (this.f11334c) {
            continueWith = this.f11333b.continueWith(this.f11332a, new n(callable));
            this.f11333b = continueWith.continueWith(this.f11332a, new b());
        }
        return continueWith;
    }
}
