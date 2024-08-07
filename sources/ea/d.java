package ea;

import c0.s0;
import com.google.android.gms.tasks.TaskCompletionSource;
import ia.b0;
import ia.o0;
import ia.z;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import pa.e;

/* compiled from: FirebaseCrashlytics */
public final class d implements Callable<Void> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ boolean f9331a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ b0 f9332b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ e f9333c;

    public d(boolean z10, b0 b0Var, e eVar) {
        this.f9331a = z10;
        this.f9332b = b0Var;
        this.f9333c = eVar;
    }

    public final Object call() {
        if (!this.f9331a) {
            return null;
        }
        b0 b0Var = this.f9332b;
        e eVar = this.f9333c;
        ExecutorService executorService = b0Var.f11272l;
        z zVar = new z(b0Var, eVar);
        ExecutorService executorService2 = o0.f11348a;
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        executorService.execute(new s0(6, zVar, executorService, taskCompletionSource));
        taskCompletionSource.getTask();
        return null;
    }
}
