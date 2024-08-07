package lc;

import com.google.android.gms.tasks.CancellationToken;
import com.google.android.gms.tasks.CancellationTokenSource;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: com.google.mlkit:common@@18.7.0 */
public abstract class j {

    /* renamed from: a  reason: collision with root package name */
    public final n f12918a = new n();

    /* renamed from: b  reason: collision with root package name */
    public final AtomicInteger f12919b = new AtomicInteger(0);

    /* renamed from: c  reason: collision with root package name */
    public final AtomicBoolean f12920c = new AtomicBoolean(false);

    public final <T> Task<T> a(Executor executor, Callable<T> callable, CancellationToken cancellationToken) {
        boolean z10;
        if (this.f12919b.get() > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        y6.j.i(z10);
        if (cancellationToken.isCancellationRequested()) {
            return Tasks.forCanceled();
        }
        CancellationTokenSource cancellationTokenSource = new CancellationTokenSource();
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource(cancellationTokenSource.getToken());
        this.f12918a.a(new t(this, cancellationToken, cancellationTokenSource, callable, taskCompletionSource), new s(executor, cancellationToken, cancellationTokenSource, taskCompletionSource));
        return taskCompletionSource.getTask();
    }
}
