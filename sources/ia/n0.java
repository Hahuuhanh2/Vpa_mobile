package ia;

import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class n0 implements Continuation {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f11345a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ TaskCompletionSource f11346b;

    public /* synthetic */ n0(int i10, TaskCompletionSource taskCompletionSource) {
        this.f11345a = i10;
        this.f11346b = taskCompletionSource;
    }

    public final Object then(Task task) {
        switch (this.f11345a) {
            case 0:
                TaskCompletionSource taskCompletionSource = this.f11346b;
                if (task.isSuccessful()) {
                    taskCompletionSource.trySetResult(task.getResult());
                } else if (task.getException() != null) {
                    taskCompletionSource.trySetException(task.getException());
                }
                return null;
            default:
                TaskCompletionSource taskCompletionSource2 = this.f11346b;
                if (task.isSuccessful()) {
                    taskCompletionSource2.trySetResult(task.getResult());
                } else if (task.getException() != null) {
                    taskCompletionSource2.trySetException(task.getException());
                }
                return null;
        }
    }
}
