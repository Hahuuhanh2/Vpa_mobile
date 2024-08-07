package lc;

import com.google.android.gms.tasks.CancellationToken;
import com.google.android.gms.tasks.CancellationTokenSource;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.concurrent.Executor;

/* compiled from: com.google.mlkit:common@@18.7.0 */
public final /* synthetic */ class s implements Executor {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Executor f12939a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ CancellationToken f12940b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ CancellationTokenSource f12941c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ TaskCompletionSource f12942d;

    public /* synthetic */ s(Executor executor, CancellationToken cancellationToken, CancellationTokenSource cancellationTokenSource, TaskCompletionSource taskCompletionSource) {
        this.f12939a = executor;
        this.f12940b = cancellationToken;
        this.f12941c = cancellationTokenSource;
        this.f12942d = taskCompletionSource;
    }

    public final void execute(Runnable runnable) {
        Executor executor = this.f12939a;
        CancellationToken cancellationToken = this.f12940b;
        CancellationTokenSource cancellationTokenSource = this.f12941c;
        TaskCompletionSource taskCompletionSource = this.f12942d;
        try {
            executor.execute(runnable);
        } catch (RuntimeException e10) {
            if (cancellationToken.isCancellationRequested()) {
                cancellationTokenSource.cancel();
            } else {
                taskCompletionSource.setException(e10);
            }
            throw e10;
        }
    }
}
