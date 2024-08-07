package ia;

import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.util.concurrent.Executor;
import pa.c;

/* compiled from: CrashlyticsController */
public final class p implements SuccessContinuation<c, Void> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Executor f11349a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ String f11350b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ q f11351c;

    public p(q qVar, Executor executor, String str) {
        this.f11351c = qVar;
        this.f11349a = executor;
        this.f11350b = str;
    }

    public final Task then(Object obj) {
        String str = null;
        if (((c) obj) == null) {
            return Tasks.forResult(null);
        }
        Task[] taskArr = new Task[2];
        taskArr[0] = t.b(this.f11351c.f11357f);
        q qVar = this.f11351c;
        m0 m0Var = qVar.f11357f.f11375m;
        Executor executor = this.f11349a;
        if (qVar.f11356e) {
            str = this.f11350b;
        }
        taskArr[1] = m0Var.f(str, executor);
        return Tasks.whenAll((Task<?>[]) taskArr);
    }
}
