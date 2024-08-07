package ia;

import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.Callable;

/* compiled from: CrashlyticsBackgroundWorker */
public final class n implements Continuation<Void, Object> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Callable f11344a;

    public n(Callable callable) {
        this.f11344a = callable;
    }

    public final Object then(Task<Void> task) {
        return this.f11344a.call();
    }
}
