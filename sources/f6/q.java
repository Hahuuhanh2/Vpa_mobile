package f6;

import android.util.Log;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* compiled from: SafeLoggingExecutor */
public final class q implements Executor {

    /* renamed from: a  reason: collision with root package name */
    public final Executor f10019a;

    /* compiled from: SafeLoggingExecutor */
    public static class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final Runnable f10020a;

        public a(Runnable runnable) {
            this.f10020a = runnable;
        }

        public final void run() {
            try {
                this.f10020a.run();
            } catch (Exception unused) {
                Log.isLoggable(j6.a.b("Executor"), 6);
            }
        }
    }

    public q(ExecutorService executorService) {
        this.f10019a = executorService;
    }

    public final void execute(Runnable runnable) {
        this.f10019a.execute(new a(runnable));
    }
}
