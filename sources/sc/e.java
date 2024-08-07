package sc;

import androidx.lifecycle.i;
import androidx.lifecycle.q;
import com.google.android.gms.tasks.CancellationTokenSource;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.io.Closeable;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import lc.f;
import m9.b;
import r2.k;
import rc.a;
import y6.j;

/* compiled from: com.google.mlkit:vision-common@@17.3.0 */
public class e<DetectionResultT> implements Closeable, k {

    /* renamed from: e  reason: collision with root package name */
    public static final y6.e f14730e = new y6.e("MobileVisionBase", "");

    /* renamed from: a  reason: collision with root package name */
    public final AtomicBoolean f14731a = new AtomicBoolean(false);

    /* renamed from: b  reason: collision with root package name */
    public final f f14732b;

    /* renamed from: c  reason: collision with root package name */
    public final CancellationTokenSource f14733c;

    /* renamed from: d  reason: collision with root package name */
    public final Executor f14734d;

    public e(f<DetectionResultT, a> fVar, Executor executor) {
        this.f14732b = fVar;
        CancellationTokenSource cancellationTokenSource = new CancellationTokenSource();
        this.f14733c = cancellationTokenSource;
        this.f14734d = executor;
        fVar.f12919b.incrementAndGet();
        fVar.a(executor, g.f14737a, cancellationTokenSource.getToken()).addOnFailureListener(b.H);
    }

    @q(i.a.ON_DESTROY)
    public synchronized void close() {
        boolean z10 = true;
        if (!this.f14731a.getAndSet(true)) {
            this.f14733c.cancel();
            f fVar = this.f14732b;
            Executor executor = this.f14734d;
            if (fVar.f12919b.get() <= 0) {
                z10 = false;
            }
            j.i(z10);
            TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
            fVar.f12918a.a(new t6.k(3, fVar, taskCompletionSource), executor);
            taskCompletionSource.getTask();
        }
    }
}
