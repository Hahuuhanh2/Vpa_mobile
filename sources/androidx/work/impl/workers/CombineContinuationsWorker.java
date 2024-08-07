package androidx.work.impl.workers;

import android.content.Context;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import androidx.work.d;
import sk.j;

/* compiled from: CombineContinuationsWorker.kt */
public final class CombineContinuationsWorker extends Worker {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CombineContinuationsWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        j.f(context, "context");
        j.f(workerParameters, "workerParams");
    }

    public final d.a.c f() {
        return new d.a.c(this.f3757b.f3734b);
    }
}
