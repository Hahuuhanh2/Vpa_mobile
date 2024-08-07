package s1;

import android.os.Handler;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* compiled from: ExecutorCompat */
public final class h implements Executor {

    /* renamed from: a  reason: collision with root package name */
    public final Handler f14592a;

    public h(Handler handler) {
        this.f14592a = handler;
    }

    public final void execute(Runnable runnable) {
        Handler handler = this.f14592a;
        runnable.getClass();
        if (!handler.post(runnable)) {
            throw new RejectedExecutionException(this.f14592a + " is shutting down");
        }
    }
}
