package wb;

import com.google.android.gms.tasks.OnCanceledListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import ja.g;
import java.util.HashMap;
import java.util.Objects;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import n.b;

/* compiled from: ConfigCacheClient */
public final class c {

    /* renamed from: d  reason: collision with root package name */
    public static final HashMap f16758d = new HashMap();

    /* renamed from: e  reason: collision with root package name */
    public static final b f16759e = new b(3);

    /* renamed from: a  reason: collision with root package name */
    public final Executor f16760a;

    /* renamed from: b  reason: collision with root package name */
    public final h f16761b;

    /* renamed from: c  reason: collision with root package name */
    public Task<d> f16762c = null;

    /* compiled from: ConfigCacheClient */
    public static class a<TResult> implements OnSuccessListener<TResult>, OnFailureListener, OnCanceledListener {

        /* renamed from: a  reason: collision with root package name */
        public final CountDownLatch f16763a = new CountDownLatch(1);

        public final void onCanceled() {
            this.f16763a.countDown();
        }

        public final void onFailure(Exception exc) {
            this.f16763a.countDown();
        }

        public final void onSuccess(TResult tresult) {
            this.f16763a.countDown();
        }
    }

    public c(ScheduledExecutorService scheduledExecutorService, h hVar) {
        this.f16760a = scheduledExecutorService;
        this.f16761b = hVar;
    }

    public static Object a(Task task, TimeUnit timeUnit) {
        a aVar = new a();
        b bVar = f16759e;
        task.addOnSuccessListener((Executor) bVar, aVar);
        task.addOnFailureListener((Executor) bVar, (OnFailureListener) aVar);
        task.addOnCanceledListener((Executor) bVar, (OnCanceledListener) aVar);
        if (!aVar.f16763a.await(5, timeUnit)) {
            throw new TimeoutException("Task await timed out.");
        } else if (task.isSuccessful()) {
            return task.getResult();
        } else {
            throw new ExecutionException(task.getException());
        }
    }

    public final synchronized Task<d> b() {
        Task<d> task = this.f16762c;
        if (task == null || (task.isComplete() && !this.f16762c.isSuccessful())) {
            Executor executor = this.f16760a;
            h hVar = this.f16761b;
            Objects.requireNonNull(hVar);
            this.f16762c = Tasks.call(executor, new g(hVar, 1));
        }
        return this.f16762c;
    }

    public final Task<d> c(d dVar) {
        return Tasks.call(this.f16760a, new z9.a(1, this, dVar)).onSuccessTask(this.f16760a, new b(this, dVar));
    }
}
