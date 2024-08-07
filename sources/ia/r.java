package ia;

import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.util.concurrent.Executor;
import pa.c;

/* compiled from: CrashlyticsController */
public final class r implements SuccessContinuation<c, Void> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Executor f11358a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ s f11359b;

    public r(s sVar, Executor executor) {
        this.f11359b = sVar;
        this.f11358a = executor;
    }

    public final Task then(Object obj) {
        if (((c) obj) == null) {
            return Tasks.forResult(null);
        }
        t.b(t.this);
        t.this.f11375m.f((String) null, this.f11358a);
        t.this.f11379q.trySetResult(null);
        return Tasks.forResult(null);
    }
}
